/**
 * @author:Fcs
 * @className:Circle
 * @description:
 * @date:2021/7/20 14:26
 * @version:0.1
 * @since:1.8
 */
public class Circle {
    private double radius;

    //构造器

    public Circle() {
    }

    public Circle(double radius) {
        //radius = 1.0;
        this.radius = radius;
    }

    //
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
