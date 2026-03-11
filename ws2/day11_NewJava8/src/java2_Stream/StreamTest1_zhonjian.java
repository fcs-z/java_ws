package java2_Stream;

import java1_Lambda.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Fcs
 * @description Stream的中间操作
 * @date 2024-11-10 14:29
 */
public class StreamTest1_zhonjian {
    // 排序
    @Test
    public void test3() {
        // sorted()   自然排序
        List<Integer> list = Arrays.asList(4, 3, 2, 7);
        list.stream().sorted().forEach(System.out::println);

        // sorted(Comparator com)  定制排序
        Person p1 = new Person("Tom", 23);
        Person p2 = new Person("Jerry", 24);
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);

        list1.stream().sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).forEach(System.out::println);
        list1.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);
    }

    // 映射
    @Test
    public void test2() {
        // map(Function f)  接收一个函教作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成一个新的元素
        List<String> list = Arrays.asList("a", "bbb", "c");
        Stream<String> stream = list.stream();
//        stream.map(str -> str.toUpperCase()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println();

        // flatMap(Function f)   接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
        list.stream().flatMap(StreamTest1_zhonjian::fromStringToStream).forEach(System.out::println);
    }

    public static Stream<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<Character>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    // 筛选与切片
    @Test
    public void test1() {
        Person p1 = new Person("Tom", 23);
        Person p2 = new Person("Jerry", 24);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        // filter(Predicate p）   接收 Lambda，从流中排除某些元素
        Stream<Person> stream = list.stream();
        stream.filter(p -> p.getAge() == 24).forEach(System.out::println);
        System.out.println();

        // Limit(n)    截断流，使其元素不超过给定数量
        Stream<Person> stream1 = list.stream();
        stream1.limit(1).forEach(System.out::println);
        System.out.println();

        // skip(n)   跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit(n)互补
        Stream<Person> stream2 = list.stream();
        stream2.skip(1).forEach(System.out::println);
        System.out.println();

        // distinct()  筛选，通过流所生成元素的 hashcode()和 equals()去除重复元素
        list.add(new Person("Tom", 23));
        list.stream().distinct().forEach(System.out::println);
    }
}
