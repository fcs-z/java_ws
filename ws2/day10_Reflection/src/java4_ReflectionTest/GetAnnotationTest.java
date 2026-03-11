package java4_ReflectionTest;

import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * @author Fcs
 * @description
 * @date 2024-11-06 15:31
 */
public class GetAnnotationTest {

    // 获取运行时类所在的注解
    @Test
    public void test() {
        Class<Human> clazz = Human.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
