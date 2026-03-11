package java2_RunnableTest;

import static java.lang.Thread.sleep;

/**
 * @author:Fcs
 * @className:Window3
 * @description:
 * @date:2021/8/14 17:54
 * @version:0.1
 * @since:1.8
 */
public class Window3 implements Runnable{
    private  int ticket = 100;

    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(ticket > 0){
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}

class MyThread{
    public static void main(String[] args) {
        Window3 w = new Window3();

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
