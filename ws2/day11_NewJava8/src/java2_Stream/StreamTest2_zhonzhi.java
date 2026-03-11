package java2_Stream;

import java1_Lambda.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Fcs
 * @description
 * @date 2024-11-10 14:41
 */
public class StreamTest2_zhonzhi {
    // 收集
    @Test
    public void test3() {
        // collect(Collector c)   将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream
        //练习1:查拔工资大于6000的员工，结果返回为一个List或set
        Person p1 = new Person("Tom", 23);
        Person p2 = new Person("Jerry", 24);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        // toList()
        List<Person> collect = list.stream().filter(e -> e.getAge() > 23).collect(Collectors.toList());
        //  System.out.println(collect);
        collect.forEach(System.out::println);

        // toSet()
        Set<Person> collect1 = list.stream().filter(e -> e.getAge() > 23).collect(Collectors.toSet());
        collect1.forEach(System.out::println);

    }

    // 归约
    @Test
    public void test2() {
        // reduce(T identity, BinaryOperator)  可以将流中元素反复结合起来，得到一个。返会T
        // 练习1:计算1-10的自然数的和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        // reduce(Binaryoperator)   可以将流中元素反复结合起来，得到一个值。返回Optional<T>
        // 练习2:计算所有人年龄的总和
        Person p1 = new Person("Tom", 23);
        Person p2 = new Person("Jerry", 24);
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);
        Stream<Integer> integerStream = list1.stream().map(e -> e.getAge());
//        Optional<Integer> sum1 = integerStream.reduce(Integer ::sum);
        Optional<Integer> sum1 = integerStream.reduce((i1, i2) -> i1 + i2);
        System.out.println(sum1);

    }

    // 匹配与查找
    @Test
    public void test1() {
        Person p1 = new Person("Tom", 23);
        Person p2 = new Person("Jerry", 24);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        // alLMatch(Predicate p)  检査是否匹配所有元素
        boolean b1 = list.stream().allMatch(e -> e.getAge() > 22);
        System.out.println(b1);

        // anyMatch(Predicate p)  检查是否至少匹配一个元素
        boolean b2 = list.stream().anyMatch(e -> e.getAge() > 23);
        System.out.println(b2);

        // noneMatch(Predicate p)  检查是否没有匹配的元素
        boolean b3 = list.stream().noneMatch(e -> e.getAge() == 23);
        System.out.println(b3);

        // findFirst  返回第一个元素
        Optional<Person> first = list.stream().findFirst();
        System.out.println("first：\n" + first);

        // findAny   返回当前流中的任意元素
        Optional<Person> any = list.stream().findAny();
        System.out.println("any：\n" + any);

        // count  返回流中元素的总个数
        long count = list.stream().count();
        System.out.println("count：\n" + count);

        // max(Comparator c)   返回流中最大值
//        Optional<Person> max = list.stream().max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
//        Optional<Person> max = list.stream().max(Comparator.comparingInt(Person::getAge));
        Optional<Integer> max1 = list.stream().map(e -> e.getAge()).max((e1, e2) -> Integer.compare(e1, e2));
//        Optional<Integer> max1 = list.stream().map(Person::getAge).max(Integer::compare);
//        System.out.println("max：\n" + max);
        System.out.println("max1：\n" + max1);

        // min(comparator c)  返回流中最小值
//        Optional<Person> min = list.stream().min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        Optional<Person> min = list.stream().min(Comparator.comparingInt(Person::getAge));
        System.out.println("min：\n" + min);
        System.out.println();

        // forEach(consumer c)  内部迭代
        list.stream().forEach(System.out::println);
        // 集合的遍历操作
        list.forEach(System.out::println);
    }
}
