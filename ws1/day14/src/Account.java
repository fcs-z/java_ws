/**
 * @author:Fcs
 * @className:Account
 * @description:
 * @date:2021/7/31 17:50
 * @version:0.1
 * @since:1.8
 */
public class  Account {
    private int id;
    private String pwd;
    private double balance;

    public static double interestRte;
    private static double minMoney = 1.0;
    private static int init = 1001;

    //构造器
    public Account() {
        id = init++;
    }

    public Account(String pwd,double balance) {
        this();
        this.pwd = pwd;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }

    //
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getPwd() {

        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public static double getInterestRte() {
        return interestRte;
    }

    public static void setInterestRte(double interestRte) {
        Account.interestRte = interestRte;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

}
