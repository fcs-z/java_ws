package java4_ReflectionTest;

import org.junit.Test;

/**
 * @author Fcs
 * @description
 * @date 2024-11-06 15:30
 */
public class GetPackageTest {

     // 获取运行时类所在的包
    @Test
    public void test() {
        Class<Human> clazz = Human.class;
        Package pack = clazz.getPackage();
        System.out.println(pack);
    }
}
