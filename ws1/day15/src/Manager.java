/**
 * @author:Fcs
 * @className:Manager
 * @description:
 * @date:2021/8/1 11:26
 * @version:0.1
 * @since:1.8
 */
public class Manager extends Employee{
    int bonus;

    public Manager(String name, int id, double salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Manager");
    }
}
