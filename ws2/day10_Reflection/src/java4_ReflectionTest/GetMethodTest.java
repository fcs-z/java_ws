package java4_ReflectionTest;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Fcs
 * @description 获取当前运行时类的方法
 * @date 2024-11-06 7:37
 */
public class GetMethodTest {

    // @Xxx
    // 杈限修饰符 返回值类型  方法名(参数类型1 形参名1,...) throws XxxException{}
    @Test
    public void test2() {
        Class<Human> clazz = Human.class;

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            // 注解
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
//                System.out.println(annotation);
            }

            // 杈限修饰符
            int modifiers = method.getModifiers();
//            System.out.println(modifiers);
            System.out.print(Modifier.toString(modifiers) + "\t");

            // 返回值类型
            Class<?> returnType = method.getReturnType();
            System.out.print(returnType + "\t");

            // 方法名
            String name = method.getName();
            System.out.print(name + "(");

            // 形参列表
            Class<?>[] parameterTypes = method.getParameterTypes();
            for(int i = 0; i < parameterTypes.length; i++){
                System.out.print(parameterTypes[i].getName() + "  args" + i + ",  " );
            }

            // 抛出的异常
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            for(int i = 0; i < exceptionTypes.length; i++){
                System.out.print(exceptionTypes[i].getName());
            }


            System.out.println();

        }
    }


    @Test
    public void test1() {
        Class<Human> clazz = Human.class;

        //getMethods()： 获取当前运行时类及其所有父类中声明为public的方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println();

        // getDeclaredMethods()：获取当前运行时类中声明的所有方法，不包含父类中声明的方法
        Method[] methods1 = clazz.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
    }
}
