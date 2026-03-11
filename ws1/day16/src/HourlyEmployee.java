/**
 * @author:Fcs
 * @className:HourlyEmployee
 * @description:
 * @date:2021/8/2 21:56
 * @version:0.1
 * @since:1.8
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private double hour;

    public HourlyEmployee(String name, int number,
                          MyDate birthday, double wage,
                          double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() + '}';
    }
}
