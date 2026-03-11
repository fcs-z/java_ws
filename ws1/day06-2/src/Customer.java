/**
 * @author:Fcs
 * @className:Customer
 * @description:
 * @date:2021/7/15 10:47
 * @version:0.1
 * @since:1.8
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

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

}
