package java2_TreeSet_GenericTest;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Fcs
 * @description
 * @date 2024-10-24 8:32
 */
public class TreeSetTest {

    // 按照MyDate年龄排序
    @Test
    public void test2(){
        Comparator com = new Comparator<Employee>() {


            @Override
            public int compare(Employee e1, Employee e2) {

//                    return Integer.compare(e1.getAge(), e2.getAge());

                MyDate b1 = e1.getBirthDate();
                MyDate b2 = e2.getBirthDate();

            // 方式一
//                if(b1.getYear() != b2.getYear()){
//                    return b1.getYear() - b2.getYear();
//                }
//                if(b1.getMonth() != b2.getMonth()){
//                    return b1.getMonth() - b2.getMonth();
//                }
//                return b1.getDay() - b2.getDay();

            // 方式二
            return b1.compareTo(b2);
            }

        };

        Set<Employee> set = new TreeSet<Employee>(com);
        Employee e1 = new Employee("Tom",22,new MyDate(1985,2,2));
        Employee e2 = new Employee("Aom",21,new MyDate(1985,2,12));
        Employee e3 = new Employee("ABm",23,new MyDate(2005,3,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    // 按照名字顺序排序
    @Test
    public void test() {
        Set<Employee> set = new TreeSet<Employee>();
        Employee e1 = new Employee("Tom",22,new MyDate(1955,2,2));
        Employee e2 = new Employee("Aom",21,new MyDate(1985,12,12));
        Employee e3 = new Employee("ABm",22,new MyDate(2005,3,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);

        for (Employee employee : set) {
            System.out.println(employee);
        }
    }
}
