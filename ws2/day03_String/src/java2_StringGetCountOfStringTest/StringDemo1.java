package java2_StringGetCountOfStringTest;

/**
 * @author:Fcs
 * @className:StringDemo1
 * @description: 获取两个字符串中最大相同子串
 * @date:2021/8/18 20:22
 * @version:0.1
 * @since:1.8
 */
public class StringDemo1 {
    public int getCount(String mainStr,String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if(mainLength >= subLength){
            //方式一
            /*while ((index = mainStr.indexOf(subStr)) != -1){//主串中存在子串
                count++;
                mainStr = mainStr.substring(index + subStr.length());
            }*/
            //方式二
            while ((index = mainStr.indexOf(subStr,index)) != -1){
                count++;
                index += subLength;
            }
        }else {
            return 0;
        }
        return count;
    }

    public static void main(String[] args) {
        StringDemo1 stringDemo1 = new StringDemo1();
        System.out.println(stringDemo1.getCount("abcbcd", "bc"));
    }
}
