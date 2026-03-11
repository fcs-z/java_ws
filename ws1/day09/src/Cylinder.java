/**
 * @author:Fcs
 * @className:Cylinder
 * @description:
 * @date:2021/7/20 14:31
 * @version:0.1
 * @since:1.8
 */
public class Cylinder extends  Circle{
    private double length;

    //构造器
    public Cylinder(double length,double radius) {
        super(radius);       //setRadius(radius);
        //length = 1.0;
        this.length = length;
    }

    //
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return super.findArea() * getLength();
    }



    @Override   //圆柱表面积
    public double findArea() {
        return super.findArea() * 2 + 2 * Math.PI * getRadius() * getLength();
    }

    public double find(){
        return super.findArea();
    }
}
