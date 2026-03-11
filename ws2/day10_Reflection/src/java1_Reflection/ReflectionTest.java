package java1_Reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Fcs
 * @description
 * @date 2024-11-04 8:22
 */
public class ReflectionTest {
    // 通过反射
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 1. 通过反射，创建Person类对象
        Class clazz = Person.class;

        // 2. 通过反射，调用对象指定的构造器，属性，方法
        // 构造器
        Constructor cons = clazz.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Tom", 24);
        System.out.println(obj);
        Person p = (Person) obj;
        System.out.println(p);
        // 属性
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());
        // 方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        // 通过反射，调用私有的结构：构造器，方法，属性
        // 私有构造器
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person) cons1.newInstance("Tom");
        System.out.println(p1.toString());
        // 私有属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"Jerry");
        System.out.println(p1.toString());
        // 私有方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String str = (String) showNation.invoke(p1, "China");  // p1.showNation("China")
        System.out.println(str);



    }

    // 学习反射之前
    @Test
    public void test1() {
        Person p1 = new Person("Tom",24);

        p1.setAge(23);

        System.out.println(p1);
        p1.show();
    }
}
