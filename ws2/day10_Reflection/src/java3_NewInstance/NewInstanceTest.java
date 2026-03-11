package java3_NewInstance;

import java1_Reflection.Person;
import org.junit.Test;

import java.util.Random;

/**
 * @author Fcs
 * @description
 * @date 2024-11-05 7:53
 */
public class NewInstanceTest {
    @Test
    public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        int num = new Random().nextInt(3);
        String classPath = "";
        switch (num) {
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.lang.Object";
                break;
            case 2:
                classPath = "java1_Reflection.Person";
                break;
        }
        Object instance = getInstance(classPath);
        System.out.println(instance);

    }

    public Object getInstance(String classPath) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }


    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        // newInstance()：调用此方法，创建对应的运行时类的对象
        // 要求：
        // 1.运行时类必须提供空参的构造器；
        // 2.空参构造器的访问权限得够，通常设置为public

        // 在javabean中要求提供-个public的空参构造器。原因:
        //1.便于通过反射，创建运行时类的对象
        //2.便于子类继承此运行时类时，默认调用super()时，保证父类有此构造器
        Person p = clazz.newInstance();
        System.out.println(p);


    }
}
