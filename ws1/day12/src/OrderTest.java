/**
 * @author:Fcs
 * @className:OrderTest
 * @description:
 * @date:2021/7/29 9:35
 * @version:0.1
 * @since:1.8
 */
public class  OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(12,"Tom");
        Order o2 = new Order(12,new String("Tom"));//"Tom"

        System.out.println(o1.equals(o2));

        String str1 = "AA";
        String str2 = "AA";
        System.out.println(str1 == str2);  //true
    }
}
