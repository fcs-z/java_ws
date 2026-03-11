/**
 * @author:Fcs
 * @className:PersonTest
 * @description:
 * @date:2021/7/8 18:35
 * @version:0.1
 * @since:1.8
 */
public class PersonTest {
    public static  void main(String[] args){
        Person p1 = new Person();

        System.out.println(p1.age);
        p1.name = "张三";
        System.out.print(p1.name);
        p1.sleep();
        p1.speak("English");

        Person p2 = new Person();
        System.out.println(p2.name);   //null

        Person p3 = p1;
        System.out.println(p3.name);   //张三

        p3.age = 10;
        System.out.println(p1.age);     //10
    }
}

class   Person{
    String name;
    int age = 1;

    public void sleep(){
        System.out.print("睡觉");
    }
    public void speak(String language){
        System.out.println("讲 " + language);
    }
}
