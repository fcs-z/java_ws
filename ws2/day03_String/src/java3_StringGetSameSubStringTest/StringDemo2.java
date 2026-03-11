package java3_StringGetSameSubStringTest;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author:Fcs
 * @className:StringDemo2
 * @description: 获取 主串中最大的相同子串
 * @date:2021/8/18 20:41
 * @version:0.1
 * @since:1.8
 */
public class StringDemo2 {
    //方法一  一个最大相同子串
    public String getMaxSameString(String str1,String str2){
        String maxStr = str1.length() >= str2.length() ? str1:str2;
        String minStr = str1.length() < str2.length() ? str1:str2;
        int length = minStr.length();
        for (int i = 0; i < length; i++) {
            for(int x = 0,y = length - i;y <= length;x++,y++){
                String subStr = minStr.substring(x,y);
                if(maxStr.contains(subStr)){
                    return subStr;
                }
            }
        }
        return null;
    }

    //方法二  多个长度一致的最大相同子串
    public String[] getMaxSameString1(String str1, String str2){
        if(str1 != null && str2 != null){
            StringBuffer sBuffer = new StringBuffer();
            String maxStr = str1.length() >= str2.length() ? str1:str2;
            String minStr = str1.length() < str2.length() ? str1:str2;

            int len = minStr.length();
            for(int i = 0;i <= len;i++){
                for(int x = 0,y = len - i;y <= len;x++,y++){
                    String subStr = minStr.substring(x,y);
                    if(maxStr.contains(subStr)){
                        sBuffer.append(subStr + ",");
                    }
                }
                System.out.println(sBuffer);
                if(sBuffer.length() != 0){
                    break;
                }
            }
            String[] split = sBuffer.toString().replaceAll(",$","").split("\\,");
            return split;
        }
        return null;
    }

    public static void main(String[] args) {
        StringDemo2 stringDemo2 = new StringDemo2();
        System.out.println(stringDemo2.getMaxSameString("123456789", "3456"));

        System.out.println(Arrays.stream(stringDemo2.getMaxSameString1("asdfghjklsdfgl", "sdfgl")).toString());
    }

    @Test
    public void testGetMaxSameString(){
        System.out.println(getMaxSameString("asdfghjklsdfgl", "sdfgl"));

        String[] maxSameStrings = getMaxSameString1("asdfghjklsdfgl", "sdfgl");
        System.out.println(Arrays.toString(maxSameStrings));
    }

}
