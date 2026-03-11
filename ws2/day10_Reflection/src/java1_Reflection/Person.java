package java1_Reflection;

import java.util.Objects;

/**
 * @author Fcs
 * @description
 * @date 2024-11-04 8:23
 */
public class Person {
    private String name;
    public int age;

    public void show(){
        System.out.println("一个人");
    }
    private String showNation(String nation){
        System.out.println("国籍是：" + nation);
        return nation;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private Person(String name) {
        this.name = name;
    }

    public Person() {
        System.out.println("调用空参的构造器");
    }

    public Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
