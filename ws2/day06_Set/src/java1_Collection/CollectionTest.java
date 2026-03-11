package java1_Collection;

import org.junit.Test;

import java.util.*;

/**
 * @author Fcs
 * @description
 * @date 2024-10-22 20:38
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add("1");
        System.out.println(coll.size());
        System.out.println("---------------------");
        // colltains
        coll.add(new Person("Tom", 22));
        System.out.println(coll.contains(new Person("Tom", 22)));
        System.out.println("---------------------");

        Person p = new Person("Jerry", 21);
        coll.add(p);
        System.out.println(coll.contains(p));
        System.out.println("---------------------");

        // clear()
//        coll.clear();
        System.out.println(coll.size());
        System.out.println("---------------------");

        // containsAll()
        Collection coll2 = new ArrayList();
        coll2.add(1);
        System.out.println(coll.containsAll(coll2));
        System.out.println("---------------------");

        // remove()
        boolean remove = coll.remove(1);
        System.out.println(remove);
        System.out.println(coll);

        System.out.println("---------------------");
        List arr1 = Arrays.asList(123, 456);
        System.out.println(arr1.size());
        List arr2 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr2.size());
        List arr3 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr3.size());

    }
}
