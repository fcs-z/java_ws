/**
 * @author:Fcs
 * @className:CustomerTest
 * @description:
 * @date:2021/7/14 20:08
 * @version:0.1
 * @since:1.8
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");
        Account acct = new Account(1000,2000,0.0123);

        cust.setAccount(acct);     //关键
        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);

        System.out.println("顾客:" + cust.getLastName() + " " + cust.getFirstName() + "的id：" + cust.getAccount().getId()
                + ",年利率：" + cust.getAccount().getAnnualInterestRate() * 100 + "%," + "余额：" + cust.getAccount().getBalance());
    }
}
