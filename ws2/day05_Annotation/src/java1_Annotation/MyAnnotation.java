package java1_Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * @author Fcs
 * @description
 * @date 2024-10-22 8:08
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE})
public @interface MyAnnotation {
//    String value();
    String value() default "hello";
}
