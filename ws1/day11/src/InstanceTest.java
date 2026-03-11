/**
 * @author:Fcs
 * @className:InstanceTest
 * @description:
 * @date:2021/7/23 11:07
 * @version:0.1
 * @since:1.8
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Person());
        System.out.println("*****************");
        test.method(new Student());
        System.out.println("*****************");
        test.method(new Graduate());
    }
    public void method(Person e){
        //if(e instanceof Graduate){
          //  System.out.println("a graduated student\na student\na person");
        //}
        //else if(e instanceof Student){
          //  System.out.println("a student\na person");
        //}
        //else if(e instanceof Person){
          //  System.out.println("a person");
        //}

        System.out.println(e.getinfo());

        if(e instanceof Graduate){
            System.out.println("a graduated student");
            e.getinfo();
        }
        if(e instanceof Student){
            System.out.println("a student");
        }
        if(e instanceof Person){
            System.out.println("a person");
        }
    }
}
