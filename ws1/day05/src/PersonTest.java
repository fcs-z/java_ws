/**
 * @author:Fcs
 * @className:PersonTest
 * @description:
 * @date:2021/7/13 18:01
 * @version:0.1
 * @since:1.8
 */
public class PersonTest {
    public static void main(String[] args) {  //psvm
        Person p = new Person();
        Person p1 = new Person(12);
        System.out.println(p1.getAge());   //sout     注意：这里有注释，鼠标放到getAge()上
        p1.setAge(20);
        System.out.println(p1.getAge());
    }
}
