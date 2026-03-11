/**
 * @author:Fcs
 * @className:Test
 * @description:
 * @date:2021/7/29 10:29
 * @version:0.1
 * @since:1.8
 */
public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(2,"red",11);
        Circle c2 = new Circle(2,"red",12);

        Circle c3 = new Circle();
        Circle c4 = new Circle();

//        System.out.println(c1.color == c2.color);
        System.out.println("颜色是否相同:" + c1.getColor().equals(c2.getColor()));

        System.out.println("半径是否相同:" + c1.equals(c2));

//        System.out.println(c1);
        System.out.println(c1.toString());

//        System.out.println(c3.equals(c4));

    }
}
