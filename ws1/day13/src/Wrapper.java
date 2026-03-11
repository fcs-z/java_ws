import java.util.Scanner;
import java.util.Vector;

/**
 * @author:Fcs
 * @className:Wrapper
 * @description:
 * @date:2021/7/29 13:46
 * @version:0.1
 * @since:1.8
 */
public class Wrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector v = new Vector();
        int maxScore = 0;
        for (;;){
            System.out.print("输入学生成绩（负数代表结束）：");
            int score = scanner.nextInt();
            if(score < 0){
                break;
            }
            if(score > 100){
                System.out.println("数据非法，重新输入");
                continue;
            }

            /*Integer inScore = new Integer(score);
               //Integer inScore = score;//自动装箱
            v.addElement(inScore);*/

            v.addElement(score);  //自动装箱

            if(maxScore < score){
                maxScore = score;
            }
        }
        System.out.println("成绩最高为：" + maxScore);

        char level;
        for(int i = 0;i < v.size();i++){
            Object obj = v.elementAt(i);

            /*Integer inScore = (Integer)obj;//obj调用不了intValue，故先向下转型
            int score = inScore.intValue();*/

            /*Integer inScore = (Integer)obj;  // 向下转型
            int score = inScore; //自动拆箱，若直接等于obj，等号两边类型不匹配，故先向下转型*/

            int score = (int)obj;

            if(maxScore - score <= 10){
                level = 'A';
            }else if(maxScore - score <= 20){
                level = 'B';
            }else if(maxScore - score <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("student - " + i + " score is " + score
            + ",grade is " + level);
        }
    }
}
