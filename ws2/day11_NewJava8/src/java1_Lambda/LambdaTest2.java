package java1_Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Fcs
 * @description
 * @date 2024-11-09 9:06
 */

/*
* java内置的4大核心函数式接口
            消费型接口 Consumer<T>       void accept(T t)
            供给型接口 Supplier<T>       T get()
            函数型接口 Function<T,R>      R apply(T t)
            断定型接口 Predicate<T>      boolean test(T t)
* */
public class LambdaTest2 {

    @Test
    public void test2() {
        List<String> list = Arrays.asList("北京", "天津", "南京");

        List<String> filterStrs = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterStrs);

        List<String> filterStrs1 = filterString(list, s -> s.contains("京"));
        List<String> filterStrs2 = filterString(list, s -> {return  s.contains("京");});
        System.out.println(filterStrs1);
        System.out.println(filterStrs2);
    }


     // 根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
    public ArrayList<String> filterString(List<String> list, Predicate<String> pre) {
        ArrayList<String> filterList = new ArrayList<>();
        for (String str : list) {
            if (pre.test(str)){
                filterList.add(str);
            }
        }
        return filterList;
    }


    @Test
    public void test1() {
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("打游戏：" + aDouble);
            }
        });

        happyTime(300,(money) -> System.out.println("打游戏花费：" + money));
    }

    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }
}
