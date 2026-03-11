package java4_ReflectionTest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author Fcs
 * @description
 * @date 2024-11-05 21:29
 */
@Target({TYPE, FIELD,METHOD,CONSTRUCTOR,LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {
    String value() default "hello";
}
