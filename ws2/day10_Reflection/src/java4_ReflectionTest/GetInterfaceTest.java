package java4_ReflectionTest;

import org.junit.Test;

/**
 * @author Fcs
 * @description
 * @date 2024-11-06 12:14
 */
public class GetInterfaceTest {


    @Test
    public void test() {
        Class<Human> clazz = Human.class;

        // getInterfaces()：获取运行时类实现的接口
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> i : interfaces) {
            System.out.println(i);
        }

        System.out.println();

        // 获取运行时类的父类实现的接口
        Class<?>[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for (Class<?> i : interfaces1) {
            System.out.println(i);
        }
    }
}
