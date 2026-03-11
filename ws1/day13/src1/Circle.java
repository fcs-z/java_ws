/**
 * @author:Fcs
 * @className:Circle
 * @description:
 * @date:2021/7/30 10:34
 * @version:0.1
 * @since:1.8
 */
public class Circle {
    private double radius;
    private int id;

    private static int total;//创建对象的个数
    private static int init = 1001;

    //构造器
    public Circle(){
        id = init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }

    //
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }
}
