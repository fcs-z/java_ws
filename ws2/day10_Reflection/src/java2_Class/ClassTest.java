package java2_Class;

import java1_Reflection.Person;
import org.junit.Test;

import java.lang.annotation.ElementType;

/**
 * @author Fcs
 * @description
 * @date 2024-11-04 16:07
 */
public class ClassTest {

    @Test
    public void test2() {
        Class c = Object.class;
        Class<Comparable> c2 = Comparable.class;
        Class<String[]> c3 = String[].class;
        Class<int[][]> c4 = int[][].class;
        Class<ElementType> c5 = ElementType.class;
        Class<Override> c6 = Override.class;
        Class<Integer> c7 = int.class;
        Class<Void> c8 = void.class;
        Class<Class> c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        System.out.println(c10 == c11);

    }
    @Test
    public void test1() throws ClassNotFoundException {
        // 方式一：调用运行时类的对象
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        // 方式二：通过运行时类的对象
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);

        // 方式三：调用Class的静态方法：forName(String classPath)
        Class clazz3 = Class.forName("java1_Reflection.Person");
        System.out.println(clazz3);
        clazz3 = Class.forName("java.lang.String");

        // 方式四： 使用类的加载器：ClassLoader
        ClassLoader classLoader = ClassTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("java1_Reflection.Person");
        System.out.println(clazz4);
    }
}
