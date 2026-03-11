/**
 * @author:Fcs
 * @className:ReCustomerList
 * @description:
 * @date:2021/7/22 13:40
 * @version:0.1
 * @since:1.8
 */
public class ReCustomerList {
    ReCustomer[] customers;
    int total;

    //构造器
    public ReCustomerList(){
        customers = new ReCustomer[10];
    }

    public boolean addCustomer(ReCustomer customer){

        return true;
    }
    public boolean deleteCustomer(int index){
        if(index < 0 || index > total){
            return false;
        }
        return true;
    }
    public void modifyCustomer(ReCustomer customer){

    }
    public ReCustomer getCustomer(int index){
        if(index < 0 || index > total){       //   >=
            System.out.println("客户不存在");   //return null;
        }
        return customers[index];
    }
    public int getCustomerTotal(){
        return customers.length;  //return total;
    }
}
