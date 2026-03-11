/**
 * @author:Fcs
 * @className:FamilyAccount
 * @description:
 * @date:2021/7/2 16:24
 * @version:0.1
 * @since:1.8
 */
public class FamilyAccount {
    public  static void main (String[] args){
        boolean isFlag = true;
        String details = "收支 \t 账户余额 \t 收支金额 \t 说明\n";
        int balance = 10000;

        while(isFlag){

            System.out.println("----------家庭收支记账软件----------");
            System.out.println("            1.收支明细");
            System.out.println("            2.登记收入");
            System.out.println("            3.登记支出");
            System.out.println("            4.退  出");
            System.out.print("            请选择（1-4）：");
            char selection = Utility.readMenuSelection();

            switch (selection){
                case '1':
                    System.out.println("     当前收支明细记录");

                    System.out.println(details);

                    System.out.println("-----------------------------------");
                    break;

                case '2':
                    System.out.println("本次收入金额：");
                    int addmoney= Utility.readNumber();
                    System.out.println("本次收入说明：");
                    String addinfo = Utility.readString();
                    balance += addmoney;
                    details += "收入\t\t "+balance+"\t\t "+addmoney+'\t'+'\t'+' '+addinfo+"\n";
                    System.out.println("----------登记完成---------");
                    break;

                case '3':
                    System.out.println("本次支出金额：");
                    int minmoney= Utility.readNumber();
                    System.out.println("本次支出说明：");
                    String info = Utility.readString();
                    if(balance >= minmoney){
                        balance-=minmoney;
                        details += "支出\t\t "+balance+"\t\t "+minmoney+'\t'+'\t'+' '+info+"\n";
                        System.out.println("----------登记完成---------");
                    }
                    else
                       System.out.println("支出超出账户额度，支付失败");
                    break;

                case '4':
                    System.out.print("确认是否退出（Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
            }
        }
    }

}
