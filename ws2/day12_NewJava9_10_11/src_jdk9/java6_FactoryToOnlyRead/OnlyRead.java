package java6_FactoryToOnlyRead;

import org.junit.Test;

import java.util.*;

/**
 * @author Fcs
 * @description
 * @date 2024-11-14 18:33
 */
public class OnlyRead {
    //java9新特性八：集合工厂方法：创建只读集合
    @Test
    public void test4() {
        List<Integer> list = List.of(1, 2, 3);
        // list.add(4);   //不能添加
        System.out.println(list);

        Set<Integer> set = Set.of(12, 34, 3);
        // set.add(123);    //不能添加
        System.out.println(set);

        Map<String, Integer> map = Map.of("Tom", 23, "Jerry", 24);
        // map.put("asd",12);   //不能添加
        System.out.println(map);

        Map<String, Integer> map1 = Map.ofEntries(Map.entry("Tom", 23), Map.entry("Jerry", 24));
        // map1.put("asd",12);   //不能添加
        System.out.println(map1);
    }

    @Test
    public void test3() {
        // 此时得到的集合list也是一个只读集合
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // list.add(6);   // 报错
        System.out.println(list);
    }

    @Test
    public void test2() {
        List<Integer> list = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5)));

        //如下操作不适用于jdk8及之前版本,适用于jdk9
        Map<String, Integer> map = Collections.unmodifiableMap(new HashMap<>() {
            {
                put("a",1);
                put("b",2);
            }
        });

        // map.put("c",3);  // 不能添加
    }


    //java8中的写法：
    @Test
    public void test1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        // 返回的list1是一个只读的集合
        List<String> list1 = Collections.unmodifiableList(list);
        // list1.add("hi");     // 不能添加  报错
        System.out.println(list1);
    }
}
