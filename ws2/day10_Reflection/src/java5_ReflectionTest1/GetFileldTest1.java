package java5_ReflectionTest1;

import java4_ReflectionTest.Human;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author Fcs
 * @description 如何操作运行时类中指定的属性
 * @date 2024-11-06 16:27
 */
public class GetFileldTest1 {
    @Test
    public void test() throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<Human> clazz = Human.class;

        // 创建运行时类的对象
        Human h = clazz.newInstance();

        // getField(String fieldName)：获取指定的属性，要求运行时类的属性声明为public
        Field id = clazz.getField("id");
        // set(参数1, 参数2)：设置当前属性的值
        // 参数1：指明设置哪个对象的属性  参数2：将此属性设置的值
        id.set(h, 123);
        // get(参数)：获取当前属性的值，参数：获取哪个对象的当前属性值
        int pId = (int) id.get(h);
        System.out.println(pId);

        System.out.println();

        // getDeclaredField(String fieldName)：获取运行时类中指定变量名的属性
        Field name = clazz.getDeclaredField("name");
        // 保证当前属性是可以访问的
        name.setAccessible(true);
        name.set(h,"Jerry");
        System.out.println(name.get(h));



    }
}
