/**
 * @author:Fcs
 * @className:Utility
 * @description:
 * @date:2021/7/2 16:03
 * @version:0.1
 * @since:1.8
 */
import  java.util.Scanner;
import java.io.*;
import java.util.*;
public class Utility {
    private static Scanner scanner = new Scanner(System.in);

    //界面菜单选择
    public  static  char readMenuSelection(){
        char c;
        for (;;){
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if(c != '1' && c != '2' && c != '3' && c != '4')
                System.out.print("选择错误，重新输入");
            else
                break;
        }
        return c;
    }

    //收入和支出 金额的输入
    public static int readNumber(){
        int n;
        for (;;){
            String str = readKeyBoard(4);
            try{
                n = Integer.parseInt(str);
                break;
            }
            catch(NumberFormatException e){
                System.out.print("数字输入错误，重新输入");
            }
        }
        return n;
    }

    //收入和支出 说明的输入
    public static String readString(){
        String str = readKeyBoard(8);
        return str;
    }

    //确认退出
    public  static char readConfirmSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if(c == 'Y' || c == 'N'){
                break;
            }
            else
            {
                System.out.print("选择错误，重新输入");
            }
        }
        return c;
    }

    ////定义readKeyBoard方法，限制输入长度
    private static String readKeyBoard(int limit){
        String line = "";
        while (scanner.hasNext()){
            line = scanner.nextLine();
            if (line.length() < 1 ||line.length() > limit){
                System.out.print("输入长度错误（不大于" + limit +"）");
                continue;
            }
            else break;
        }
        return line;
    }
}

