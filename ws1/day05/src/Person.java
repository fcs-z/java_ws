/**
 * @author:Fcs
 * @className:Person
 * @description:
 * @date:2021/7/13 18:01
 * @version:0.1
 * @since:1.8
 */
public class Person {

    //属性
    private String name;
    private int age;

    //构造器
    public Person(){

    }
    public Person(int a){
        age = a;
    }

    //方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 年纪
     */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
