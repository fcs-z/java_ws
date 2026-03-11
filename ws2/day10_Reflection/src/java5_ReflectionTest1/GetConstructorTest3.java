package java5_ReflectionTest1;

import java4_ReflectionTest.Human;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Fcs
 * @description
 * @date 2024-11-06 17:17
 */
public class GetConstructorTest3 {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Human> clazz = Human.class;

        // getDeclaredConstructor(参数)：获取指定的构造器  参数：指明构造器的参数列表
        Constructor<Human> con = clazz.getDeclaredConstructor(String.class,int.class);
        con.setAccessible(true);
        // 调用此构造器创建运行时类的对象
        Human hu = con.newInstance("Tom",24);
        System.out.println(hu);


    }
}
