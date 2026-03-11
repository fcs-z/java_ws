package java9_NiMing;

/**
 * @author:Fcs
 * @className:NiMingTest
 * @description: 偶数和奇数 两个线程互相争抢输出
 * @date:2021/8/14 19:49
 * @version:0.1
 * @since:1.8
 */
public class NiMingTest {
    public static void main(String[] args) {
        //偶数
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 100 ; i++) {
                    if(i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        }.start();

        //奇数
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100 ; i++) {
                    if(i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }
        }).start();
    }
}

