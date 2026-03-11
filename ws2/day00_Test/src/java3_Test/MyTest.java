package java3_Test;

import org.junit.Test;

/**
 * @author Fcs
 * @description
 * @date 2024-10-19 17:28
 */
public class MyTest {

    @Test
    public void test2() {
        int[] arr = new int[]{1, 2};
        System.out.println(arr.length);
    }

    @Test
    public void test1() {
        StringBuffer s = new StringBuffer(123);
        s.append("hello");
        s.append("world");
        s.append(1);
        System.out.println(s);
        System.out.println(s.length());

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }
}
