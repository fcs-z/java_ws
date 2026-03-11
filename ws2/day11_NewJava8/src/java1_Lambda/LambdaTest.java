package java1_Lambda;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author Fcs
 * @description
 * @date 2024-11-08 8:09
 */
public class LambdaTest {

    @Test
    public void test2() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare1 = com1.compare(12, 21);
        System.out.println(compare1);

         // Lambda
        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
        int compare2 = com2.compare(12, 21);
        System.out.println(compare2);

        // 方法引用
        Comparator<Integer> com3 = Integer :: compare;
        int compare3 = com3.compare(12, 21);
        System.out.println(compare3);
    }

    @Test
    public void test1() {
        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("天安门");
            }
        };
        r1.run();

        Runnable r2 = () -> System.out.println("故宫");
        r2.run();
    }
}
