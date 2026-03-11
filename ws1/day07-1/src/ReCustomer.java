/**
 * @author:Fcs
 * @className:ReCustomer
 * @description:
 * @date:2021/7/22 13:40
 * @version:0.1
 * @since:1.8
 */
public class ReCustomer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    //构造器

    public ReCustomer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
