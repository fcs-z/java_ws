package java3_List;

import org.junit.Test;

import java.util.*;

/**
 * @author Fcs
 * @description
 * @date 2024-10-23 8:58
 */
public class ListTest {

    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(new User("Tom", 21));
        list.add(new User("Tom", 22));
        list.add(new User("Tom", 22));

        for (Object o : list) {
            System.out.println(o);
        }
        // 自定义类重写equals()，因为使用了contains()
        System.out.println(list.contains(new User("Tom", 21)));

    }

    @Test
    public void test() {
        List li = new ArrayList();
        ArrayList list = new ArrayList(10);
        LinkedList  linkedList = new LinkedList();
        Vector vector = new Vector(10);

        list.add(1);
        list.add(2);
        for (Object o : list) {
            System.out.println(o);
        }

        vector.add(3);
        for (Object o : vector) {
            System.out.println(o);
        }
    }


}
