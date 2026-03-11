/**
 * @author:Fcs
 * @className:Test
 * @description:
 * @date:2021/7/20 14:37
 * @version:0.1
 * @since:1.8
 */
public class Test {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(2,2);
        //c1.setRadius(2);
        //c1.setLength(2);

       Circle c2 = new Circle(2);
//        c2.setRadius(2);
        //System.out.println("底面积：" + c2.findArea());

//        Circle c2 = (Circle) c1;
//        System.out.println(c2.findArea()) ;    调用的是子类

        System.out.println("底面积(Cylinder)：" + c1.find());//就是这里
        System.out.println("底面积(Circle)：" + c2.findArea());

        System.out.println("表面积：" + c1.findArea());
        System.out.println("体积：" + c1.findVolume());
    }
}
