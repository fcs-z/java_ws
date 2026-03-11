/**
 * @author:Fcs
 * @className:CustomerView
 * @description:
 * @date:2021/7/16 17:35
 * @version:0.1
 * @since:1.8
 */
public class CustomerView {

    //由Customers类的构造器 创建 对象，同时创建了customers数组，大小为10
    private CustomerList customerList = new CustomerList(10);
    public void enterMainMenu(){
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("----------客户信息管理软件----------");
            System.out.println("           1 添加客户 ");
            System.out.println("           2 修改客户 ");
            System.out.println("           3 删除客户 ");
            System.out.println("           4 客户列表 ");
            System.out.println("           5 退 出 \n");
            System.out.print("        请选择（1-5）：");

            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N):");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
            }
        }
    }

    /**
     * 添加客户的操作
     */
    public void addNewCustomer(){
        int total = customerList.getTotal();
        //if (total < customerList.getAllCustomers().length) {
            System.out.print("客户姓名：");
            String name = CMUtility.readString(10);

            System.out.print("客户性别：");
            char gender = CMUtility.readChar();

            System.out.print("客户年龄：");
            int age = CMUtility.readInt();

            System.out.print("客户电话：");
            String phone = CMUtility.readString(11);

            System.out.print("客户邮箱：");
            String email = CMUtility.readString(15);

            //   new  添加 用户 创建对象 堆里开辟空间
            Customer cust = new Customer(name, gender, age, phone, email);
            boolean isSccuess = customerList.addCustomer(cust);
            if (isSccuess) {
                System.out.println("-----------------添加成功-----------------\t");
            } else {
                System.out.println("-----------客户列表已满，添加失败-------------\t");
            }
        //}
    }

    /**
     * 修改客户的操作
     */
    private void modifyCustomer() {
        System.out.println("-----------------修改客户-----------------");
        int index;
        Customer cust;  //创建对象,得到要修改的对象
        //Customer cust = new Customer();
        for (; ; ) {
            System.out.println("请输入要修改的客户序号(输入-1退出)");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            index--;   //用户输入的，和数组的序号
            cust = customerList.getCustomer(index);  //获取指定索引的客户
            if (cust == null) {
                System.out.println("无法找到客户!");
            } else {
                break;
            }
        }
            //修改填入
            System.out.print("姓名（"+cust.getName()+"）：");
            String name = CMUtility.readString(10, cust.getName());

            System.out.print("性别（"+cust.getGender()+"）：");
            char gender = CMUtility.readChar( cust.getGender());

            System.out.print("年龄（"+cust.getAge()+"）：");
            int age = CMUtility.readInt(cust.getAge());

            System.out.print("电话（"+cust.getPhone()+"）：");
            String phone = CMUtility.readString(11, cust.getPhone());

            System.out.print("邮箱（"+cust.getEmail()+"）：");
            String email = CMUtility.readString(15, cust.getEmail());

            // new 把新修改的 客户 给 新创建的对象，堆里面新创个空间
            Customer newCust = new Customer(name,gender,age,phone,email);
            //把修改好的对象 地址 放到customers数组中
            boolean isReplaced = customerList.replaceCustomer(index, newCust);
            if (isReplaced) {
                System.out.println("-----------------修   改  成  功-----------------\t");
            } else {
                System.out.println("-----------------修   改  失  败-----------------\t");
            }
    }

    /**
     * 删除客户的操作
     */
    private void deleteCustomer(){
            System.out.println("-----------------删除客户-----------------");
            Customer customer; //创建对象,得到删除序号，赋给customer
            int number;
            for (;;) {
                System.out.print("请输入要删除的客户序号(输入-1退出):");
                number = CMUtility.readInt();
                if (number == -1) {
                    return;
                }
                number--;
                customer = customerList.getCustomer(number);
                if (customer == null) {
                    System.out.println("无法找到客户!");
                } else {
                    break;
                }
            }
            System.out.print("是否确认删除（Y/N）");
            char isDelete = CMUtility.readConfirmSelection();
            if (isDelete == 'Y') {
                boolean deleteSuccess = customerList.deleteCustomer(number);
                if (deleteSuccess) {
                    System.out.println("-----------------删  除  成  功-----------------\t");
                } else {
                    System.out.println("删除失败，请输入正确序号:1->"+customerList.getTotal());
                }
            }
    }

    /**
     * 显示客户列表的操作
     */
    private void listAllCustomer() {
            System.out.println("----------客户列表----------");
            int total = customerList.getTotal();
            if (total == 0) {
                System.out.println("没有客户记录");
            }
            else {
                System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t\t\t邮箱");
                Customer[] custs = customerList.getAllCustomers();
                for (int i = 0; i < custs.length; i++) {
                    System.out.println((i + 1) + "\t" + custs[i].getName() + "\t" +
                            custs[i].getGender() + "\t" + custs[i].getAge() + "\t" +
                              custs[i].getPhone() + "\t\t" + custs[i].getEmail() + "\t");
                }
            }
            System.out.println("-----------------客户列表完成-----------------\n");
    }
    public static void main(String[] args) {
            CustomerView CV = new CustomerView();
            CV.enterMainMenu();
    }
}
