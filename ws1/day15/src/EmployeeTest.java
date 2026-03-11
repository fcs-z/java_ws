/**
 * @author:Fcs
 * @className:EmployeeTest
 * @description:
 * @date:2021/8/1 11:34
 * @version:0.1
 * @since:1.8
 */
public class EmployeeTest {
    public static void main(String[] args) {

//        Employee e = new Employee();

        Manager manager = new Manager("张三",1001,1200,1000);
        //多态
        Employee manager1 = new Manager("asd",1002,1000,1000);
        manager1.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
