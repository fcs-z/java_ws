package java1_ThreadTest;

/**
 * @author:Fcs
 * @className:Window1
 * @description:
 * @date:2021/8/14 17:48
 * @version:0.1
 * @since:1.8
 */
public class Window1 extends Thread{
    private static int ticket = 100;

    @Override
    public  void run() {
        while(true){
            show();
        }
    }
    private static synchronized void show(){
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
        Window1 t1 = new Window1();
        Window1 t2 = new Window1();
        Window1 t3 = new Window1();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}