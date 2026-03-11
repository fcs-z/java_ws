/**
 * @author:Fcs
 * @className:Employee
 * @description:
 * @date:2021/8/2 19:25
 * @version:0.1
 * @since:1.8
 */
abstract public class Employee {
     String name;
    private int number;
    private MyDate birthday;

     public abstract double earnings();

     //构造器
    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString();
    }
}
