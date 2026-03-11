/**
 * @author:Fcs
 * @className:CircleTest
 * @description:
 * @date:2021/7/30 10:36
 * @version:0.1
 * @since:1.8
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(11);
        Circle c2 = new Circle(12);

        System.out.println(c1.getId() + " " + c1.getRadius());
        System.out.println(c2.getId());
        System.out.println(Circle.getTotal());
    }
}
