package java4_ReflectionTest;

import java1_Reflection.Person;

/**
 * @author Fcs
 * @description
 * @date 2024-11-05 21:15
 */
@MyAnnotation(value = "hi")
public class Human extends Creature<String> implements Comparable<String>,MyInterface{

    private String name;
    int age;
    public int id;

    private static void showDesc(){
        System.out.println("静态方法");
    }

    @MyAnnotation
    private String show(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }

    public String display(String interest,int age) throws Exception{
        return interest;
    }

    public Human() {
    }

    @MyAnnotation(value = "abc")
    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
