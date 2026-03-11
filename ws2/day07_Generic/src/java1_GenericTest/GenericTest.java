package java1_GenericTest;

import org.junit.Test;

import java.util.*;

/**
 * @author Fcs
 * @description
 * @date 2024-10-25 9:33
 */
public class GenericTest {

    // map
    @Test
    public void test1() {
        Map<String,Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // 法一
        Set<String> strings = map.keySet();
        for (String str : strings) {
            System.out.println(str + " : " + map.get(str));
        }
        System.out.println("--------------");

        // 法二
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
    // list
    @Test
    public void test(){
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(12);
        list.add(123);

        // 法一
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int element = iterator.next();
            System.out.println(element);
        }
        System.out.println("--------------");

        // 法二
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
