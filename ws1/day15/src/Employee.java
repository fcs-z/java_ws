/**
 * @author:Fcs
 * @className:Employee
 * @description:
 * @date:2021/8/1 11:24
 * @version:0.1
 * @since:1.8
 */
public abstract class Employee {
    String name;
    int id;
    double salary;

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();
}
