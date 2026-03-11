package java3_LockTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author:Fcs
 * @className:Window5
 * @description:
 * @date:2021/8/14 18:08
 * @version:0.1
 * @since:1.8
 */
public class Window5 implements Runnable{
    private  int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();

//    @Override
//    public  void run() {
//        while(true){
//           try {
//               lock.lock();
//               if(ticket > 0){
//                   try {
//                       sleep(10);
//                   } catch (InterruptedException e) {
//                       e.printStackTrace();
//                   }
//                   System.out.println(Thread.currentThread().getName() + ":" + ticket);
//                   ticket--;
//               }
//           }finally {
//               lock.unlock();
//           }
//        }
//    }

    @Override
    public  void run() {
        while(true){
                lock.lock();
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                    ticket--;
                }
                lock.unlock();
        }
    }
}

class MyThread1 {
    public static void main(String[] args) {
        Window5 w = new Window5();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
