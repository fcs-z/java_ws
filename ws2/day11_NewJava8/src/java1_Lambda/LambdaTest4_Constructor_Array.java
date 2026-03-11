package java1_Lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Fcs
 * @description
 * @date 2024-11-09 13:58
 */

/*b
* 1. 构造器引用
*       和方法引用类似，函数式接口的抽象方法的形参列表和构造器的形参列表一致
*       抽象方法的返回值类型即为构造器所属的类的类型
* 2. 数组引用
*       可以把数组看做是一个特殊的类，则写法与构造器引用一致
* */
public class LambdaTest4_Constructor_Array {

    // 数组引用
    //Function中的R appLy(T t)
    @Test
    public void test4() {
        Function<Integer, String[]> fun = length -> new String[length];
        String[] arr = fun.apply(4);
        System.out.println(Arrays.toString(arr));

        Function<Integer, String[]> fun1 = String[]::new;
        String[] arr1 = fun1.apply(8);
        System.out.println(Arrays.toString(arr1));
    }


    // 构造器引用
    //BiFunction中的R apply(T t,U u)
    @Test
    public void test3() {
        BiFunction<String,Integer,Person> fun = (name,age) -> new Person(name,age);
        System.out.println(fun.apply("Tom",20));

        BiFunction<String,Integer,Person> fun1 = Person::new;
        System.out.println(fun1.apply("Jerry",23));
    }

    //Function中的R apply(T t)
    @Test
    public void test2() {
        Function<Integer,Person> fun = age -> new Person(age);
        System.out.println(fun.apply(23));

        Function<Integer,Person> fun1 = Person::new;
        Person p = fun1.apply(24);
        System.out.println(p);
    }

    //supplier中的T get()
    //Person的空参构造器：Person()
    @Test
    public void test1() {
        Supplier<Person> sup = new Supplier<Person>() {

            @Override
            public Person get() {
                return new Person();
            }
        };

        Supplier<Person> sup2 = () -> new Person();

        Supplier<Person> sup3 = Person::new;

        System.out.println(sup3.get());
    }
}
