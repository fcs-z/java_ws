package java5_TreeSetTest;

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
        Comparator com = new Comparator() {

            // 方式一
//            @Override
//            public int compare(Object o1, Object o2) {
//                if(o1 instanceof Employee && o2 instanceof Employee){
//                    Employee e1 = (Employee)o1;
//                    Employee e2 = (Employee)o2;
////                    return Integer.compare(e1.getAge(), e2.getAge());
//
//                    MyDate b1 = e1.getBirthDate();
//                    MyDate b2 = e2.getBirthDate();
//
//                    if(b1.getYear() != b2.getYear()){
//                        return b1.getYear() - b2.getYear();
//                    }
//                    if(b1.getMonth() != b2.getMonth()){
//                        return b1.getMonth() - b2.getMonth();
//                    }
//                    return b1.getDay() - b2.getDay();
//                }
//                return 0;
//            }
            // 方式二
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;
                    MyDate b1 = e1.getBirthDate();
                    MyDate b2 = e2.getBirthDate();
                    return b1.compareTo(b2);
                }
                return 0;
            };

        };

        Set set = new TreeSet(com);
        Employee e1 = new Employee("Tom",22,new MyDate(1985,2,2));
        Employee e2 = new Employee("Aom",21,new MyDate(1985,2,12));
        Employee e3 = new Employee("ABm",23,new MyDate(2005,3,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    // 按照名字顺序排序
    @Test
    public void test() {
        Set set = new TreeSet();
        Employee e1 = new Employee("Tom",22,new MyDate(1955,2,2));
        Employee e2 = new Employee("Aom",21,new MyDate(1985,12,12));
        Employee e3 = new Employee("ABm",22,new MyDate(2005,3,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
