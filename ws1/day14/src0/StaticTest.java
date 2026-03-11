/**
 * @author:Fcs
 * @className:StaticTest
 * @description:
 * @date:2021/8/2 10:41
 * @version:0.1
 * @since:1.8
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();

        //非静态
        c1.age = 1;
        c1.eat();
//        Chinese.age = 1; //错误
//        Chinese.eat();   //错误

        //静态
        c1.nation = "china";
        c1.show();
        Chinese.nation = "CHINA";
        Chinese.show();

    }
}
