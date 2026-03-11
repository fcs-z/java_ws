/**
 * @author:Fcs
 * @className:MyRectangle
 * @description:
 * @date:2021/7/22 12:29
 * @version:0.1
 * @since:1.8
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    //构造器
    public MyRectangle(double width, double height,String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    //
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //方法

    @Override
    public double findArea() {
        return getWidth() * getHeight();
    }
}
