/**
 * @author:Fcs
 * @className:GeometricObject
 * @description:
 * @date:2021/7/29 10:13
 * @version:0.1
 * @since:1.8
 */
public class GeometricObject {
    protected String color;
    protected double weight;


    //构造器

    public GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    //
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
