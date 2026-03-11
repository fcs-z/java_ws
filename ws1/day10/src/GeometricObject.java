/**
 * @author:Fcs
 * @className:GeometricObject
 * @description:
 * @date:2021/7/22 12:20
 * @version:0.1
 * @since:1.8
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    //构造器
//    protected GeometricObject(){
//
//    }
    protected GeometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }

    //
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    //方法
    public double findArea(){
        return 0.0;
    }
}
