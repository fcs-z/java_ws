import java.util.Calendar;
import java.util.Scanner;

/**
 * @author:Fcs
 * @className:PayrollSystem
 * @description:
 * @date:2021/8/2 21:59
 * @version:0.1
 * @since:1.8
 */
public class PayrollSystem {
    public static void main(String[] args) {
        //方式一
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("请输入生日月份：");
        int month = scanner.nextInt();
        System.out.print("请输入生日在几日：");
        int day = scanner.nextInt();*/

        //方式二
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;//获取当前的月份
        int day = calendar.get(Calendar.DATE);
        System.out.println("现在是:" + year + "年" + month + "月" + day + "日");
        System.out.println();

        Employee[] employee = new Employee[2];

        employee[0] = new SalariedEmployee("Tom",1001,
                new MyDate(2000,8,3),1000);

        employee[1] = new HourlyEmployee("Jerry",1002,
                new MyDate(2001,3,3),1000,10);

        for (int i = 0;i < employee.length;i++){
            System.out.println(employee[i].toString());
            System.out.println("月工资为：" + employee[i].earnings());

            //方式一
            /*if(month == employee[i].getBirthday().getMonth()
                    && day == employee[i].getBirthday().getDay()){
                System.out.println("生日快乐");
            }*/

            //方式二
            if(month == employee[i].getBirthday().getMonth()
                    && day == employee[i].getBirthday().getDay()) {
                System.out.println("生日快乐");
            }
            System.out.println();
        }
    }
}
