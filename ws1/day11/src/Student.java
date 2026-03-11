/**
 * @author:Fcs
 * @className:Student
 * @description:
 * @date:2021/7/23 11:06
 * @version:0.1
 * @since:1.8
 */
public class Student extends Person {
    protected String school = "pku";
    public String getinfo(){
        return  "Name:" + name + "\nAge:" + age + "\nschool:" + school;
    }
}
