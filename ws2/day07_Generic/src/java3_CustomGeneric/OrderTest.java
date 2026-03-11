package java3_CustomGeneric;

import org.junit.Test;

/**
 * @author Fcs
 * @description
 * @date 2024-10-29 8:53
 */
public class OrderTest {
    @Test
    public void test4() {
        // 子类SubOrder1：使用自定义泛型，public class SubOrder1<T> extends Order<T>
        SubOrder1<Integer> subOrder1 = new SubOrder1<>("qwe",123);
        System.out.println(subOrder1.getOrderT());
    }

    @Test
    public void test3() {
        // 子类SubOrder：public class SubOrder extends Order<String>
        SubOrder subOrder = new SubOrder("qwe","123");
        System.out.println(subOrder.getOrderT());
    }

    @Test
    public void test2() {
        // 类Order：使用自定义的泛型
        Order<Integer> order = new Order<>("qwe",123);
        System.out.println(order.getOrderT());
    }

    @Test
    public void test1() {
        // 类Order：不使用泛型
        Order order = new Order();
        order.setOrderT("qwe");
        System.out.println(order.getOrderT());

    }
}
