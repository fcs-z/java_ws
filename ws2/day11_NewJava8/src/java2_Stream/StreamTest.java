package java2_Stream;

import java1_Lambda.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Fcs
 * @description
 * @date 2024-11-09 14:42
 */

/*
1. stream关注的是对数据的运算，与CPU打交道，集合关注的是数据的存储，与内存打交道
2.  Stream自己不会存储元素
    Stream不会改变源对象。相反，他们会返回一个持有结果的新stream。
    Stream操作是延迟执行的。这意味着他们会等到需要结果的时候才执行
3. Stream 执行流程
    stream的实例化
    一系列的中间操作(过滤、映射、.·)
    终止操作
4. 说明:
    一个中间操作链，对数据源的数据进行处理
     一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会被使用
*/
public class StreamTest {
    //创建stream方式四：创建无限流
    @Test
    public void test() {

        // 迭代：public static<T> Stream<T> iterate(final T seed, final Unaryoperator<T> f)
        Stream.iterate(0, i -> i + 1).limit(5).forEach(System.out::println);

        //生成：public static<T> stream<T> generate(supplier<T> s)
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

    }


    //创建stream方式三：通过Stream的of
    @Test
    public void test3() {
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4);

        Person p1 = new Person("Tom", 23);
        Person p2 = new Person("Jerry", 24);
        Person[] arr1 = {p1, p2};
        Stream<Person> arr2 = Stream.of(arr1);

    }

    //创建stream方式二：通过数组
    @Test
    public void test2() {
        int[] arr = {1, 2, 3, 4};
        IntStream stream1 = Arrays.stream(arr);

        Person p1 = new Person("Tom", 23);
        Person p2 = new Person("Jerry", 24);
        Person[] arr1 = {p1, p2};
        Stream<Person> stream2 = Arrays.stream(arr1);
    }

    //创建stream方式一：通过集合
    @Test
    public void test1() {

        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // default stream<E>stream()：返回一个顺序流
        Stream<Object> stream = list.stream();
        // default stream<E>parallelstream()：返回一个并行流
        Stream<Object> parallelStream = list.parallelStream();

    }
}
