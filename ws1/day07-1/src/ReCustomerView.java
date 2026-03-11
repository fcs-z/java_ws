/**
 * @author:Fcs
 * @className:ReCustomerView
 * @description:
 * @date:2021/7/22 13:41
 * @version:0.1
 * @since:1.8
 */
public class ReCustomerView {
    private ReCustomerList reCustomerList = new ReCustomerList();
    public void printMenu(){
        boolean isFlag = true;
        while (isFlag){
            System.out.println("----------欢迎进入----------");
            System.out.println("1.增加客户信息");
            System.out.println("2.删除客户信息");
            System.out.println("3.修改客户信息");
            System.out.println("4.显示客户信息");
            System.out.println("5.退出（Y/N）:");
            System.out.println(" 请选择（1-5）：");
            char read = Utility.readMenuSelection();
            switch (read){
                case '1':
                    add();
                    break;
                case '2':
                    delete();
                    break;
                case '3':
                    modify();
                    break;
                case '4':
                    check();
                    break;
                case '5':
                    System.out.println("是否确认退出（Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit == 'Y'){
                    isFlag = false;
                    }
            }
        }
    }

    //增加
    public void add(){
        System.out.println("----------增加客户信息----------");

        System.out.print("姓名：" );
        String name = Utility.readString(3);
        System.out.print("性别：");
        char gender = Utility.readChar();
        System.out.print("年龄：");
        int age = Utility.readInt();
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.print("邮箱：");
        String email = Utility.readString(20);

        ReCustomer reCustomer = new ReCustomer(name,gender,age,phone,email);
        boolean isSccuess = reCustomerList.addCustomer(reCustomer);
        if(isSccuess){
            System.out.println("添加成功");
        }
        else{
            System.out.println("添加失败");
        }
    }

    //删除
    public void delete(){
        System.out.println("----------删除客户信息----------");
        System.out.println("输入删除的编号：");
        int index = Utility.readInt();

    }

    //修改
    public void modify(){
        System.out.println("----------修改客户信息----------");

    }

    //查看
    public void check(){
        System.out.println("----------查看客户信息----------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
        for(int i = 1;i < total; i++){
            System.out.println("i" + );
        }
        System.out.println("客户列表显示完成");
    }

    //
    public static void main(String[] args) {
        ReCustomerView test = new ReCustomerView();
        test.printMenu();

    }
}
