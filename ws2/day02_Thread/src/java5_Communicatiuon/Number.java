package java5_Communicatiuon;

/**
 * @author:Fcs
 * @className:Number
 * @description: 线程1和线程2 轮流输出1-100
 * @date:2021/8/14 18:34
 * @version:0.1
 * @since:1.8
 */
public class Number implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                notify();
                if(number <= 100){
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}
class CommunicationTest{
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
