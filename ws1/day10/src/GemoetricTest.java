/**
 * @author:Fcs
 * @className:GemoetricTest
 * @description:
 * @date:2021/7/22 12:33
 * @version:0.1
 * @since:1.8
 */
public class GemoetricTest {
    public static void main(String[] args) {
        GemoetricTest test = new GemoetricTest();

        Circle circle = new Circle(2,"红色",10);
        MyRectangle myRectangle = new MyRectangle(5,5,"蓝色",20);

        System.out.println("面积是否相等：" + test.equalsArea(circle,myRectangle));

        test.displayGeometirObject(circle);
        test.displayGeometirObject(new Circle(1,"蓝色",2));
        test.displayGeometirObject(myRectangle);
    }

    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        boolean isEquals = o1.findArea() == o2.findArea() ? true : false;
        return isEquals;
    }

    public void displayGeometirObject(GeometricObject o){
        System.out.println("面积为" + o.findArea());
    }
}
