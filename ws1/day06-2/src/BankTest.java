/**
 * @author:Fcs
 * @className:BankTest
 * @description:
 * @date:2021/7/15 11:00
 * @version:0.1
 * @since:1.8
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomers("jane","smith");

        Account acct = new Account(2000);
        bank.getCustomer(0).setAccount(acct);
        //bank.getCustomer(0).setAccount(new Account(2000));

        bank.getCustomer(0).getAccount().withdraw(500);

        double banlance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("用户：" + bank.getCustomer(0).getLastName() + " "
                + bank.getCustomer(0).getFirstName() + "余额：" + banlance);
    }
}
