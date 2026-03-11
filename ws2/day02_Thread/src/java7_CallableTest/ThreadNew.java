package java7_CallableTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author:Fcs
 * @className:ThreadNew
 * @description:
 * @date:2021/8/14 19:24
 * @version:0.1
 * @since:1.8
 */
/**
 * 偶数
 */
class Window implements Callable{
    @Override
    public Object call() {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

/**
 * 奇数
 */
class Window1 implements Callable{
    @Override
    public Object call() {
        int sum1 = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 2 != 0){
                System.out.println(i);
                sum1 += i;
            }
        }
        return sum1;
    }
}
public class ThreadNew {
    public static void main(String[] args) {
        Window w = new Window();
        FutureTask futureTask = new FutureTask(w);
        new Thread(futureTask).start();

        //输出返回值
        Object sum = null;
        try {
            sum = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("总合为：" + sum);

        //奇数
        Window1 w1 = new Window1();
        FutureTask futureTask1 = new FutureTask(w1);
        new Thread(futureTask1).start();

        Object sum1 = null;
        try {
                sum1 = futureTask1.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("总合为：" + sum1);
    }
}
