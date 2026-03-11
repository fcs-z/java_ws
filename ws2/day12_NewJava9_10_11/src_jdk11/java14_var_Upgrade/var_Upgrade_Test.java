package java14_var_Upgrade;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * @author Fcs
 * @description
 * @date 2024-11-16 16:53
 */
public class var_Upgrade_Test {
    // 局部变量类型推断的升级
    @Test
    public void test() {
        // 错误的形式：必须要有类型，可以加var
        // Consumer<String> con1 = (@Deprecated t) -> system.out.println(t.toUppercase());

        // 正确的形式：
        // 使用var的好处是在使用lambda表达式时给参数加上注解
        Consumer<String> con2 = (@Deprecated var t) -> System.out.println(t.toUpperCase());
    }
}
