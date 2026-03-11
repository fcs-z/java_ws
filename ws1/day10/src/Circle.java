/**
 * @author:Fcs
 * @className:Circle
 * @description:
 * @date:2021/7/22 12:16
 * @version:0.1
 * @since:1.8
 */
public class Circle extends GeometricObject{
    private double radius;

    //构造器
    public Circle (double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }

    //
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    //方法

    @Override
    public double findArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
