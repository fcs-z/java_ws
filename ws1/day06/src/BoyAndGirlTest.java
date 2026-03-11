/**
 * @author:Fcs
 * @className:BoyAndGirlTest
 * @description:
 * @date:2021/7/14 17:26
 * @version:0.1
 * @since:1.8
 */

public class BoyAndGirlTest {
    public static void main(String[] args) {

        Boy boy = new Boy("罗密欧",20);
        Girl girl = new Girl("朱丽叶",18);
        Girl girl1 = new Girl("祝英台",20);

        boy.shout();
        int compare = girl.compare(girl1);  //girl->this  girl1->girl
        girl.marry(boy,girl);

        if(compare > 0){
            System.out.println(girl.getName() + "大");
        }
        else if(compare < 0){
            System.out.println(girl1.getName() + "大");
        }
        else{
            System.out.println("一样大");
        }
    }
}