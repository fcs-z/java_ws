/**
 * @author:Fcs
 * @className:LanHan
 * @description:
 * @date:2021/8/1 10:03
 * @version:0.1
 * @since:1.8
 */
public class LanHan {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);
    }
}

class Order{
    private Order(){
    }

    private static Order instance = null;

    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}
