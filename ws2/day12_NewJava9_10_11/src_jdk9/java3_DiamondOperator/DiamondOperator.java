package java3_DiamondOperator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Fcs
 * @description
 * @date 2024-11-13 9:08
 */
// 钻石操作符的升级
public class DiamondOperator {
    @Test
    public void test() {
        //钻石操作符与匿名内部类在java8中不能共存，在java9可以
        Comparator<Object> com = new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        // jdk7中的新特性:类型推断
        ArrayList<Object> list = new ArrayList<>();
    }
}
