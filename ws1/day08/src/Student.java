/**
 * @author:Fcs
 * @className:Student
 * @description:
 * @date:2021/7/18 18:25
 * @version:0.1
 * @since:1.8
 */
public class Student extends Person{
    private int id;

//    public Student() {
//    }

    public Student(int id,String name ,int age) {
        super(name,age);
//        setName(name);
//        setAge(age);
        this.id = id;
//        this.setName("jerry");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
