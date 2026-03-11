/**
 * @author:Fcs
 * @className:MainTest
 * @description:
 * @date:2021/8/1 9:36
 * @version:0.1
 * @since:1.8
 */
public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[100]);
    }
}
class Main {
    public static void main(String[] args) {
        for(int i = 0;i < args.length;i++){
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}