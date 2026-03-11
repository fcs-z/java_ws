package java4_ReflectionTest;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author Fcs
 * @description 获取当前运行时类的属性结构
 * @date 2024-11-05 21:35
 */
public class GetFieldTest {

    // 权限修饰符  数据类型  变量名
    @Test
    public void test2() {
        Class<Human> clazz = Human.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            // 权限修饰符
            int modifiers = field.getModifiers();
//            System.out.println(modifiers);
            System.out.print(Modifier.toString(modifiers) + "\t");

            // 数据类型
            Class<?> type = field.getType();
            System.out.print(type + "\t");

            // 变量名
            String name = field.getName();
            System.out.println(name);
        }

    }

    @Test
    public void test1() {
        Class<Human> clazz = Human.class;

        // getFields()：获取当前运行时类及其父类中声明为public的属性
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
//            System.out.println(field.getName());
        }
        System.out.println();

        // getDeclaredFields()：获取当前运行时类中声明的所有属性，不包含父类中声明的属性
        Field[] fields1 = clazz.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
    }
}
