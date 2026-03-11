package java4_ReflectionTest;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author Fcs
 * @description
 * @date 2024-11-06 11:51
 */
public class GetConstructorTest {
    @Test
    public void test() {
        Class<Human> clazz = Human.class;

        // getConstructors()：获取当前运行时类中声明为public的构造器
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println();
        // getDeclaredConstructors()：获取当前运行时类中声明的所有构造器
        Constructor<?>[] constructors1 = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors1) {
            System.out.println(constructor);
        }
    }
}
