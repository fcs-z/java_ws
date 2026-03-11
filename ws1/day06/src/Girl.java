/**
 * @author:Fcs
 * @className:Girl
 * @description:
 * @date:2021/7/14 17:21
 * @version:0.1
 * @since:1.8
 */
public class Girl {
    private String name;
    private int age;

    //构造器
    public Girl(){

    }
    public Girl(String name,int age){
        this.name = name;
        this.age = age;
    }

    //
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    //方法
    public void marry(Boy boy,Girl girl){
        System.out.println(girl.name + "嫁给"+boy.getName());
//        System.out.println(girl.getName() + "嫁给"+boy.getName());
        boy.marry(this);    //boy.marry(girl);
    }
    public int compare(Girl girl){
        return this.age - girl.age;
    }
}
