package java3_Optional;

import org.junit.Test;

import java.util.Optional;

/**
 * @author Fcs
 * @description
 * @date 2024-11-10 22:08
 */
// Optional类：为了在程序中避免出现空指针异常而创建的
// 常用的方法： ofNullable(T t)
//            orElse(T t)
public class OptionalTest {

    // Optional.of(T t)：创建一个 0ptional 实例，t必须非空
    // Optional.ofNullable(T t)：t可以为null
    // Optional.empty()：创建一个空的 0ptional 实例

    @Test
    public void tes3() {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
        if(!empty.isPresent()) {
            System.out.println("数据为空");
        }
    }
    @Test
    public void test2() {
        Girl girl = new Girl();
        girl = null;  // ofNullable(r t)：t可以为null
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        System.out.println(optionalGirl);

        // orElse(T t1)：如果当前的optional内部封装的t是非空的，则返回内部的t，即optionalGirl不为null
        // 如果内部的t是空的，则返回orElse()方法中的参数t1，即返回new Girl("Tom")
        Girl girl1 = optionalGirl.orElse(new Girl("Tom"));
        System.out.println(girl1);
    }

    @Test
    public void test1() {
        Girl girl = new Girl("Tom");
//        girl = null;   // of(T t)：保证t是非空的
        Optional<Girl> optionalGirl = Optional.of(girl);
        Girl girl1 = optionalGirl.get();
        System.out.println(girl1);
    }
}
