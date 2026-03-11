package java8_ThreadPoolTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:Fcs
 * @className:ThreadPool
 * @description:
 * @date:2021/8/14 19:40
 * @version:0.1
 * @since:1.8
 */
class Window implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
class Window1 implements Callable {
    @Override
    public Object call() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
        return null;
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        //设置线程池的属性
        /*ThreadPoolExecutor service1 = (ThreadPoolExecutor)service;
        service1.setCorePoolSize(15);
        service1.setKeepAliveTime();*/

//        service.execute(new Window());


        service.submit(new Window1());
        service.shutdown();
    }
}
