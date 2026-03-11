/**
 * @author:Fcs
 * @className:Bank
 * @description:
 * @date:2021/7/15 10:49
 * @version:0.1
 * @since:1.8
 */
public class Bank {
    private Customer[] customers;
    private int numOfCustomers;

    //构造器
    public Bank() {
        customers = new Customer[10];
    }

    //
    public int getNumOfCustomers() {
        return numOfCustomers;
    }

    //方法
    public void addCustomers(String f,String l){
//        Customer cust = new Customer(f,l);
//        customers[numOfCustomers] = cust;
        customers[numOfCustomers] = new Customer(f,l);
        numOfCustomers++;
    }

    public Customer getCustomer(int index){
        if(index >= 0 && index <numOfCustomers) {
            return customers[index];
        }
        return  null;
    }

}
