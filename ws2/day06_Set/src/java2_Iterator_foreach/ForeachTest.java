package java2_Iterator_foreach;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Fcs
 * @description
 * @date 2024-10-23 8:58
 */
public class ForeachTest {
    @Test
    public void test2() {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add("123");
        for (Object o : coll) {
            System.out.println(o);
        }
        System.out.println("---------------------");

        int[] arr = new int[]{1,2,3};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
