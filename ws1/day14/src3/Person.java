/**
 * @author:Fcs
 * @className:Person
 * @description:
 * @date:2021/8/1 10:18
 * @version:0.1
 * @since:1.8
 */
public class Person {
    String name;
    int age;
    static String desc = "一个人";

    //构造器
    public Person(){

    }

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //代码块
    static {
        desc = "人";
        System.out.println("static");
    }

    {
        age = 1;
        //desc = "非 人";
        System.out.println("非 static");
    }
    //方法
    public  void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
