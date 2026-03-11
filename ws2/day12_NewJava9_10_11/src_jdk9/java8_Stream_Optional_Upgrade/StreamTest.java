package java8_Stream_Optional_Upgrade;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Fcs
 * @description
 * @date 2024-11-14 19:22
 */
public class StreamTest {
    // java9新特性十：Stream API的加强
    @Test
    public void test2() {
        // of()参数中的多个元素，可以包含null值
        Stream<Integer> stream1 = Stream.of(1, 2, 3, null);
        stream1.forEach(System.out::println);
        // of()参数不能存储单个null值。否则，报异常
        // Stream<Object> stream2 = Stream.of(null);
        // stream2.forEach(System.out::println);
        System.out.println();

        // ofNullable()：形参变量是可以为null值的单个元素
        Integer i = 1;
        i = null;
        Stream<Integer> stream3 = Stream.ofNullable(i);
        stream3.forEach(System.out::println);

        // jdk8
        Stream.iterate(1, x -> x + 1).limit(5).forEach(System.out::print);
        System.out.println();
        // jdk9 新增重载方法
        Stream.iterate(1,  x -> x < 5, x -> x + 1).forEach(System.out::print);
    }

    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(2, 3, 1, 5, 4, 6);

        // takeWhile()   返回从开头开始的按照指定规则尽量多的元素
        // list.stream().takeWhile(x -> x < 5).forEach(System.out::println); // 2 3 1

        // dropWhile()   与takeWhile相反，返回剩余的元素
        list.stream().dropWhile(x -> x < 5).forEach(System.out::println); // 5 4 6
    }
}
