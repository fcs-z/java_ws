/**
 * @author:Fcs
 * @className:ComparableCircle
 * @description:
 * @date:2021/8/3 16:17
 * @version:0.1
 * @since:1.8
 */
public class ComparableCircle extends Circle implements CompareObject{

    //构造器
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
            if(this.getRadius() > c.getRadius()){
                return 1;
            }else if(this.getRadius() < c.getRadius()){
                return -1;
            }else{
                return 0;
            }
        }
        return 0;//throw new RuntimeException("传入的数据类型不匹配");
    }
}
