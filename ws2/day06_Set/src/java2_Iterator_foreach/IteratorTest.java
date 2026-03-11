package java2_Iterator_foreach;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Fcs
 * @description
 * @date 2024-10-23 8:39
 */
public class IteratorTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add("123");

        // next() hasNext()
        Iterator iter = coll.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("---------------------");
        // remove()
        iter = coll.iterator();
        while (iter.hasNext()){
            if(iter.next() == "123"){
                iter.remove();
            }
        }
        iter = coll.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
