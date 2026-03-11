/**
 * @author:Fcs
 * @className:Person
 * @description:
 * @date:2021/8/1 13:00
 * @version:0.1
 * @since:1.8
 */
abstract class Person{
    String name;
    int age;

    //构造器
    public Person() {
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //方法
    public abstract void eat();
    public abstract void breath();

    public void walk(){
        System.out.println("走路");
    }
}