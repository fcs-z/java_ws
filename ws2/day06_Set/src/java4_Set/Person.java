package java4_Set;

import java.util.Objects;

/**
 * @author Fcs
 * @description
 * @date 2024-10-23 19:04
 */
public class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            int compare = this.name.compareTo(p.name);
            if (compare != 0) {
                return compare;
            }else
                return this.age - p.age;
        }
//        return 0;
        throw new RuntimeException("类型不匹配");
    }
}
