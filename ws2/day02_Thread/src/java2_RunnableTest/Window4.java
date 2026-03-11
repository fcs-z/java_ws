package java2_RunnableTest;

import static java.lang.Thread.sleep;

/**
 * @author:Fcs
 * @className:Window4
 * @description:
 * @date:2021/8/14 18:02
 * @version:0.1
 * @since:1.8
 */
public class Window4 implements Runnable{
    private  int ticket = 100;

    @Override
    public  void run() {
        while(true){
            show();
        }
    }
    private synchronized void show(){
        if(ticket > 0){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + ticket);
            ticket--;
        }
    }
}

class MyThread1{
    public static void main(String[] args) {
        Window4 w = new Window4();

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