package java1_StringReverseTest;

/**
 * @author:Fcs
 * @className:StringDemo
 * @description: 翻转字符串中，指定位置的字符串，并返回
 * @date:2021/8/18 19:58
 * @version:0.1
 * @since:1.8
 */
public class StringDemo {
    //方法一
    public String reverse(String str,int startIndex,int endIndex){
       char[] chars = str.toCharArray();
       for(int i = startIndex,j = endIndex;i < j;i++,j--){
           char temp = chars[i];
           chars[i] = chars[j];
           chars[j] = temp;
       }
       /*String s = new String(chars);
        return s;*/
       return new String(chars);
    }

    //方法二
    public String reverse1(String str,int startIndex,int endIndex){
        String reverseStr = str.substring(0,startIndex);
        for (int i = endIndex; i >= startIndex; i--) {
            reverseStr += str.charAt(i);
        }
        reverseStr += str.substring(endIndex+1);
        return reverseStr;
    }

    //方法三
    public String reverse2(String str,int startIndex,int endIndex){
        StringBuilder builder = new StringBuilder(str.length());
        builder.append(str.substring(0,startIndex));
        for (int i = endIndex; i >=startIndex ; i--) {
            builder.append(str.charAt(i));
        }
        builder.append(str.substring(endIndex+1));
        return builder.toString();
    }
    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        System.out.println(stringDemo.reverse("abcd", 1, 2));

        System.out.println(stringDemo.reverse1("abcd", 1, 2));

        System.out.println(stringDemo.reverse2("abcd", 1, 2));

    }
}

