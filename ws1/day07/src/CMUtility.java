import java.util.Scanner;

/**
 * @author:Fcs
 * @className:CMUtility
 * @description:
 * @date:2021/7/16 16:26
 * @version:0.1
 * @since:1.8
 */
public class CMUtility {
    private  static Scanner scanner = new Scanner(System.in);

    //用于界面菜单选择，读取键盘,  switch case 选择
    public static char readMenuSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if(c != '1' && c != '2' && c != '3'
                    && c != '4' && c != '5'){
                System.out.println("选择错误，请重新输入：");
            }
            else
                break;
        }
        return c;
    }

    //*************************************************

    //从键盘读取一个字符，并将其作为方法的返回值
    //性别
    public static char readChar(){
        String str = readKeyBoard(1,false);
        return str.charAt(0);
    }

    //从键盘读取一个字符，并将其作为方法的返回值
    //性别
    //如果用户不输入字符，而直接回车，方法将以defaultValue作为返回值。
    public static char readChar(char defaultValue){
        String str = readKeyBoard(1,true);
        return (str.length() == 0 ? defaultValue :str.charAt(0));
    }

    //从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值
    //年龄，修改的客户序号，以及 -1 退出
    public static int readInt(){
        int n;
        for(;;){
            String str = readKeyBoard(2,false);
            try{
                n = Integer.parseInt(str);
                break;
            }
            catch (NumberFormatException e){
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

     //从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值
    //年龄
    //如果用户不输入字符，而直接回车，方法将以defaultValue作为返回值。
     public static int readInt(int defaultValue){
        int n;
        for(;;){
            String str = readKeyBoard(2,true);
            if(str.equals("")){
                return defaultValue;
            }
            try{
                n = Integer.parseInt(str);
                break;
            }
            catch (NumberFormatException e){
                System.out.print("数字输入错误，请重新输入：");
            }
        }
            return n;
    }

    //从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值。
    //姓名，电话，邮箱
    public static String readString(int limit){
        return readKeyBoard(limit,false);
    }

    //从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值
    //姓名，电话，邮箱
    //如果用户不输入字符，而直接回车，方法将以defaultValue作为返回值。
    public static String readString(int limit,String defaultValue){
        String str = readKeyBoard(limit,true);
        return str.equals("") ? defaultValue : str;
    }

    //*****************************************************

    //退出确认操作
    public  static char readConfirmSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1,false).toUpperCase();
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

    //定义readKeyBoard方法，限制输入长度
    private static String readKeyBoard(int limit,boolean blankReturn){
        String line = "";

        while (scanner.hasNext()){
            line = scanner.nextLine();
            if (line.length() == 0) {
                if(blankReturn)
                    return line;
                else
                    continue;
            }
            if (line.length() < 1 || line.length() > limit){
                System.out.print("输入长度错误（不大于" + limit +"）");
                continue;
            }
             break;
        }
        return line;
    }
}
