package java6_TongPeiFu;

import java5_UseGeneric.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fcs
 * @description
 * @date 2024-10-30 15:34
 */
public class TongPeiFu {
    /*
     有限制条件的通配符的使用
    ? extends A:
        G<? extends A> 可以作为G<A>和G<B>的父类，其中B是A的子类

    ? super A:
        G<? super A> 可以作为G<A>和G<B>的父类，其中B是A的父类
 */
    @Test
    public void test4() {
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Student> list3 = new ArrayList<Student>();
        List<Person> list4 = new ArrayList<Person>();
        List<Object> list5 = new ArrayList<Object>();

//        list1 = list3;   // list1≤  Person的对象，可能为Person 或者 Student，但list3为Student
        list1 = list4;
//        list1 = list5;

//        list2 = list3;
        list2 = list4;
        list2 = list5;

        //读取数据
        list1 = list4;
        Person p = list1.get(0);
        //编译不通过
//        Student s = list1.get(0);

        list2 = list4;
        Object obj = list2.get(0);
        //编译不通过
//        Person person = list2.get(0);

        //写入数据
        //编译不通过
//        list1.add(new Student());

        //编译通过
        list2.add(new Person());
//        list2.add(new Student());
    }

}
