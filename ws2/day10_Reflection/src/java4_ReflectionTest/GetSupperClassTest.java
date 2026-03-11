package java4_ReflectionTest;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Fcs
 * @description
 * @date 2024-11-06 11:56
 */
public class GetSupperClassTest {

    // 获取运行时类的带泛型的父类的泛型
    @Test
    public void test3() {
        Class<Human> clazz = Human.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        // 获取泛型类型
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(actualTypeArguments[0]);
        System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class)actualTypeArguments[0]).getName());

    }

    // getGenericSuperclass()：获取运行时类的带泛型的父类
    @Test
    public void test2() {
        Class<Human> clazz = Human.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }


    // getSuperclass()：获取运行时类的父类
    @Test
    public void test1() {
        Class<Human> clazz = Human.class;

        Class<? super Human> superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }
}
