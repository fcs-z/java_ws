/**
 * @author:Fcs
 * @className:MainDemo
 * @description:
 * @date:2021/8/1 9:46
 * @version:0.1
 * @since:1.8
 */
public class MainDemo {
    public static void main(String[] args) {
        for (int i = 0;i < args.length;i++){

            // 右键 -> More Run/Debug -> Modify Run Configuration -> 在Program argments 中填入信息
            // 输入信息表示String[] args，空格表示一个
            System.out.println("*** " + args[i]);

//            int num = Integer.parseInt(args[i]);
//            System.out.println("### " + num);
        }
    }
}
