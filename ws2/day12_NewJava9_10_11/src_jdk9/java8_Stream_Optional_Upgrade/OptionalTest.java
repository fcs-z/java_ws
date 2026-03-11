package java8_Stream_Optional_Upgrade;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Fcs
 * @description
 * @date 2024-11-14 19:45
 */
public class OptionalTest {
    // java9新特性十一：Optional提供了新的方法stream()
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Tim");
        Optional<List<String>> optional = Optional.ofNullable(list);
        // stream()
        Stream<List<String>> stream = optional.stream();
//        System.out.println(stream.count());  // 1

        // long count = stream.flatMap(x -> x.stream()).count();
        // System.out.println(count);    // 3

        stream.flatMap(x -> x.stream()).forEach(System.out::println);

    }
}
