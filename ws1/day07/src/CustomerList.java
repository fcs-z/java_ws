/**
 * @author:Fcs
 * @className:CustomerList
 * @description:
 * @date:2021/7/16 17:07
 * @version:0.1
 * @since:1.8
 */
public class CustomerList {
    private Customer[] customers;  //客户列表
    private int total;             //客户总数

    //构造器
    /**
     * 初始化customers数组
     * @param totalCustomer 指定数组的长度
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    //方法
    /**
     * 将指定的客户添加到数组中
     * @param customer
     * @return trur:添加成功 false：添加失败
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){    //total用户总数
            return false;
        }
        customers[total] = customer;  //把加入的 客户 ，放入数组中
        total ++;
        return true;
    }

    /**
     * 修改指定索引位置的客户信息
     * @param index
     * @param cust
     * @return true：修改成功 false：修改失败
     */
    public boolean replaceCustomer(int index,Customer cust){
        if(index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;    //创建对象时，在堆里，新开辟一个cust，
                                    // 地址指向原来的数组某个
        return true;
    }

    /**
     * 删除指定索引位置的客户
     * @param index
     * @return true:删除成功 false:删除失败
     */
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }
        for (int i = 0;i < total - 1;i++){
            customers[i] = customers[i + 1];
        }
        customers[total - 1] = null;
        total -- ;
        return true;
    }

    //
    /**
     * 获取所有客户的信息
     * @return
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total]; //重新创建custs数组，
                                   // 并把customers数组的地址给custs数组
        for (int i = 0;i < total;i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if(index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    /**
     * 获取客户的数量
     * @return
     */
    public int getTotal(){
        return total;
    }
}
