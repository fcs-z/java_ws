package java7_Collections;

import org.junit.Test;

import java.util.*;

/**
 * @author Fcs
 * @description
 * @date 2024-10-24 22:33
 */
public class CollectionsTest {
    @Test
    public void test() {
        Map map = new HashMap();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.reverse(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 线程安全
        List list1 = Collections.synchronizedList(list);
        Map map1 = Collections.synchronizedMap(map);

        Set set = new HashSet();
        Set set1 = Collections.synchronizedSet(set);

        Collection coll = Collections.synchronizedCollection(list);
        Collection coll1 = Collections.synchronizedCollection(set);
    }
}
