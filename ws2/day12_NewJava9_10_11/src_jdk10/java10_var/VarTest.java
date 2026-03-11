package java10_var;

import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Fcs
 * @description
 * @date 2024-11-16 8:25
 */
// 局部变量的类型推断
public class VarTest {
    @Test
    public void test3() {
        // 情况1:没有初始化的局部变量声明
//        var s = null;

        // 情况6:catch块
        /*try{

        }catch (var e){
            e.printStackTrace();
        }*/

    }

    // 情况2:方法的返回类型
    /*public var method(){
        return 0;
    }*/

    // 情况3:方法的参数类型
   /* public int method1(var num){
        return 0;
    }*/

    // 情况4:构造器的参数类型

    /*public VarTest(var i){

    }*/

    // 情况5:属性
//    var num = 10;

    @Test
    public void test2() {
        // 局部变量不赋值，或赋值为null， 就不能实现类型推断
        // var num;
        // var s = null;

        // lambda表示式中，左边的函数式接口不能声明为var
        Supplier<Double> sup = ()->Math.random();
        // var sup1 = ()-> Math.random();

        // 方法引用中，左边的函数式接口不能声明为var
        Consumer<String> con = System.out::println;
        // var con1 = System.out::println;

        // 数组的静态初始化中，注意如下的情况也不可以
         int[] arr = {1,2,3,4};
         var arr1 = new int[]{1,2,3,4};
         // var arr2 = {1,2,3,4};
    }

    @Test
    public void test1() {
        // 1. 声明变量时，根据所附的值，推断变量的类型
        var num = 10;
        var str = "abc";
        var list = new ArrayList<Integer>();
        list.add(1);

        // 2. 遍历操作
        for(var i : list){
            System.out.println(i);
        }

        // 3. 普通遍历操作
        for (var i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }
}
