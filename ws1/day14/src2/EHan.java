/**
 * @author:Fcs
 * @className:EHan
 * @description:
 * @date:2021/8/1 9:59
 * @version:0.1
 * @since:1.8
 */
public class EHan {
    public static void main(String[] args) {

        //法一
//        Bank bank3 = new Bank();   // 私有构造器，new不了
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        //法二
//        Bank bank1 = Bank.instance;
//        Bank bank2 = Bank.instance;
//
//        System.out.println(bank1 == bank2);
    }
}
class Bank{
    private Bank(){
    }

    //法一
    private static Bank instance = new Bank();

    public  static Bank getInstance() {
        return instance;
    }

    //法二   其中final防止用户设置 Bank.instance = null;
//    public static final Bank instance = new Bank();


}

