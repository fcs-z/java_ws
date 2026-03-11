/**
 * @author:Fcs
 * @className:Boy
 * @description:
 * @date:2021/7/14 17:02
 * @version:0.1
 * @since:1.8
 */
public class Boy {
    private String name;
    private int age;

    //构造器
    public Boy() {
    }
    public Boy(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    //方法
    public void marry(Girl girl){
        System.out.println(this.getName()+ "想娶"+girl.getName());
    }
    public void shout(){
        if(this.age > 22){
            System.out.println("可以结婚了");
        }
        else{
            System.out.println("先谈恋爱");
        }
    }
}
