/**
 * @author:Fcs
 * @className:AccountTest
 * @description:
 * @date:2021/7/31 17:56
 * @version:0.1
 * @since:1.8
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();
        Account acct2 = new Account("123",1);

        System.out.println(acct1);
        System.out.println(acct2);

        Account.setMinMoney(1);
        Account.setInterestRte(0.012);

        //AccountTest test = new AccountTest();
        acct1.setMinMoney(12); //这里点不出来setMinMoney()
                              // 和setInterestRte(),手写
        System.out.println(acct2.getMinMoney());  //12

        Account.setMinMoney(14);
        System.out.println(Account.getMinMoney());
    }
}
