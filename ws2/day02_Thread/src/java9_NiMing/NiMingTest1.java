package java9_NiMing;

/**
 * @author:Fcs
 * @className:NiMingTest1
 * @description:
 * @date:2021/8/14 19:52
 * @version:0.1
 * @since:1.8
 */
public class NiMingTest1 {
    public static void main(String[] args) {
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
