import org.junit.jupiter.api.Test;

/**
 * @author:Fcs
 * @className:Circle
 * @description:
 * @date:2021/7/29 10:20
 * @version:0.1
 * @since:1.8
 */
public class Circle extends GeometricObject {
    private double radius;

    //构造器
    public Circle(){
        super();
        radius = 1.0;
    }
    public Circle(double radius) {
        this();
        this.radius = radius;
    }
    public Circle( double radius,String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    //
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //计算圆的面积
    public double findArea(){
        return Math.PI * radius * radius;
    }

    //重写equals(),比较半径是否相同
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof  Circle){
            Circle circle = (Circle)obj;
            return this.radius == circle.radius;
        }
        return false;
    }

    //重写toString() 输出圆的半径
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
