/**
 * @author:Fcs
 * @className:Account
 * @description:
 * @date:2021/7/15 10:41
 * @version:0.1
 * @since:1.8
 */
public class Account {
    private double balance;

    //构造器
    public Account(double init_balance) {
        this.balance = init_balance;
    }

    //
    public double getBalance() {
        return balance;
    }

    //方法
    public void despoit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("存钱成功");
        }
    }

    public void withdraw(double amt){
        if(balance >= amt){
            balance -=amt;
            System.out.println("取钱成功");
        }
        else{
            System.out.println("余额不足");
        }
    }
}
