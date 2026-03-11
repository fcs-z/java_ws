/**
 * @author:Fcs
 * @className:PersonTest
 * @description:
 * @date:2021/8/1 12:49
 * @version:0.1
 * @since:1.8
 */
public class PersonTest {
    public static void main(String[] args) {

        method(new Student());//匿名对象

        Worker worker = new Worker();
        method1(worker);//非匿名类的非匿名对象
        System.out.println("***********************");
        method1(new Worker());//非匿名类的匿名对象

        System.out.println("***********************");

        //创建了一匿名子类的对象：p
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("吃东西");
            }
            @Override
            public void breath() {
                System.out.println("呼吸");
            }
        };
        method1(p);

        System.out.println("***********************");

        //创建匿名子类的匿名对象
        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("吃好吃的东西");
            }

            @Override
            public void breath() {
                System.out.println("呼吸新鲜的空气");
            }
        });
    }

    public static void method1(Person p){
        p.eat();
        p.walk();//非static
        p.breath();
    }

    public static void method(Student s){

    }
}





