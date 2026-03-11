import java.util.Objects;

/**
 * @author:Fcs
 * @className:Order
 * @description:
 * @date:2021/7/29 9:32
 * @version:0.1
 * @since:1.8
 */
public class Order {
    int orderld;
    String orderName;

    //构造器
    public Order(int orderld, String orderName) {
        this.orderld = orderld;
        this.orderName = orderName;
    }

    //
    public int getOrderld() {
        return orderld;
    }

    public void setOrderld(int orderld) {
        this.orderld = orderld;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    //equals()重写
   /* @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }*/

   //手写
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Order){
            Order order = (Order)obj;
            return this.orderld == order.orderld && this.orderName.equals(order.orderName);
//            return this.orderld == o.orderld && this.orderName == o.orderName;   //错误的
        }
        return false;
    }

//    //自动
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Order order = (Order) o;
//        return orderld == order.orderld && Objects.equals(orderName, order.orderName);
//    }
}
