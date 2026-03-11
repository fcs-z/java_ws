/**
 * @author:Fcs
 * @className:Student
 * @description:
 * @date:2021/8/1 13:00
 * @version:0.1
 * @since:1.8
 */
class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Student eat");
    }

    public void breath(){
        System.out.println("Student breath");
    }
}