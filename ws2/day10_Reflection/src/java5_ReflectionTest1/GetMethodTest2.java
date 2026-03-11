package java5_ReflectionTest1;

import java1_Reflection.Person;
import java4_ReflectionTest.Human;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Fcs
 * @description 如何操作运行时类中指定的方法
 * @date 2024-11-06 16:59
 */
public class GetMethodTest2 {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Human> clazz = Human.class;

        Human h = clazz.newInstance();

        // getDeclaredMethod((参数1, 参数2)：获取指定的方法
        // 参数1：获取的方法名称  参数2：获取方法的形参列表
        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        // invoke(参数1, 参数2)：参数1：方法的调用者， 参数2：给方法形参赋值的实参
        // invoke()的返回值即为对应类中调用的方法的返回值
        show.invoke(h,"China");
        Object returnValue = show.invoke(h, "China");
        System.out.println(returnValue);

        System.out.println("调用静态方法");

        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        // 如果调用的运行时类中的方法没有返回值，则此invoke()返回null
        // String desc = (String) showDesc.invoke(Person.class);
        // 或者
        String desc = (String) showDesc.invoke(null);
        System.out.println(desc); // null
    }
}
