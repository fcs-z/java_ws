package java6_Map;

import org.junit.Test;

import java.util.*;

/**
 * @author Fcs
 * @description
 * @date 2024-10-24 18:31
 */
public class MapTest {

    @Test
    public void test1(){
        Map map = new LinkedHashMap();

        map.put("C", 3);
        map.put("A", 1);
        map.put("B", 2);

        System.out.println(map);

        // 遍历
        // 法一
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("----------------------");
        // 法二
        Set keySet = map.keySet();
        Iterator iterator2 = keySet.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key+":"+value);
        }
    }

    @Test
    public void test() {
        Map map = new HashMap();

        map.put("C", 3);
        map.put("A", 1);
        map.put("B", 2);

        System.out.println(map);
        for (Object o : map.keySet()) {
            System.out.println(o);
        }
    }
}
