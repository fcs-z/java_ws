/**
 * @author:Fcs
 * @className:InterfaceTest
 * @description:
 * @date:2021/8/3 16:10
 * @version:0.1
 * @since:1.8
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(4);
        ComparableCircle c2 = new ComparableCircle(3);

        // 子类对象调用父类方法，
        System.out.println(c1.getRadius());

        int compareValue = c1.compareTo(c2);
        if(compareValue > 0){
            System.out.println("c1大");
        }else if(compareValue < 0){
            System.out.println("c2大");
        }else {
            System.out.println("一样大");
        }

    }
}
