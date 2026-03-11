/**
 * @author:Fcs
 * @className:Customer
 * @description:
 * @date:2021/7/14 20:03
 * @version:0.1
 * @since:1.8
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;  //自己创造的类 的 私有。首先堆里有三个属性，
                              // 其中account，构造器形参里没有它，存的是null
                              //后来存入acct 的地址，以此来访问账户信息
                              //栈里先有cust，后有acct

    //构造器
    public Customer(String f,String l) {
        firstName = f;
        lastName = l;
    }

    //
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    //方法

}
