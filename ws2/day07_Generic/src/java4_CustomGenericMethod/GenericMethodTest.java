package java4_CustomGenericMethod;

import org.junit.Test;

import java.util.List;

/**
 * @author Fcs
 * @description
 * @date 2024-10-29 20:05
 */
public class GenericMethodTest {
    @Test
    public void test() {
        Order order = new Order();
        Integer[] arr = new Integer[]{1,2,3};
        List<Integer> list = order.copyFromArrayToList(arr);
        System.out.println(list);

    }
}
