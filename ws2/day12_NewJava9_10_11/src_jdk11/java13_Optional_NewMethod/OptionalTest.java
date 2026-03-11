package java13_Optional_NewMethod;

import org.junit.Test;

import java.util.Optional;

/**
 * @author Fcs
 * @description
 * @date 2024-11-16 16:20
 */
public class OptionalTest {
    // Optional新增的方法  orElseThrow()
    @Test
    public void test1() {
        Optional<Object> op = Optional.empty();
        System.out.println(op.isPresent()); // 判断内部的value是否存在
        System.out.println(op.isEmpty());   //  判断内部的value是否为空

        op = Optional.of("abc");
        // orElseThrow()：value非空，返回value；否则抛异常NoSuchElementException
        Object obj = op.orElseThrow();
        System.out.println(obj);

        Optional<String> op1 = Optional.of("hello");
        // op = Optional.empty();
        // or()：value非空，返回对应的Optional；value为空，返回形参封装的Optional
        Optional<Object> op2 = op.or(() -> op1);
        System.out.println(op2);  // op不为空，返回op，即：Optional[abc]
                                    // op为空，返回op1，即：Optional[hello]
    }
}
