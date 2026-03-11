package java4_Set;

import org.junit.Test;

import java.util.*;

/**
 * @author Fcs
 * @description
 * @date 2024-10-23 13:42
 */
public class TreeSetTest {


    // TreeSet  自然排序
    @Test
    public void test2(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    return Integer.compare(p1.getAge(), p2.getAge());
                }else
                    throw new RuntimeException("类型不匹配");
            }
        };

        TreeSet treeSet = new TreeSet(com);
        treeSet.add(new Person("Tom", 18));
        treeSet.add(new Person("Bom", 18));
        treeSet.add(new Person("Aom", 19));
        treeSet.add(new Person("Aom", 20));

        for (Object o : treeSet) {
            System.out.println(o);
        }
    }

    // TreeSet  自然排序
    @Test
    public void test1() {
        Set set = new TreeSet();

//        set.add(1);
//        set.add(-3);
//        set.add(6);
        set.add(new Person("Tom", 18));
        set.add(new Person("Aom", 19));
        set.add(new Person("Aom", 20));

//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
