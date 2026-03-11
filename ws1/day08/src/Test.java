/**
 * @author:Fcs
 * @className:Test
 * @description:
 * @date:2021/7/18 18:27
 * @version:0.1
 * @since:1.8
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(123,"je",12);
        s1.setAge(20);
        //s1.setName("Tom");
        System.out.println(s1.getAge() + "\n" + s1.getName());
    }
}
