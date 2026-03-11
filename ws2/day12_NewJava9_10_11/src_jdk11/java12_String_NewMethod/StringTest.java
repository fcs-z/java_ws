package java12_String_NewMethod;

import org.junit.Test;

/**
 * @author Fcs
 * @description
 * @date 2024-11-16 16:01
 */
public class StringTest {
    // String中新增的方法
    @Test
    public void test1() {
        //  isBlank()：判断字符串是否为空白
        System.out.println("   ".isBlank());   // true
        System.out.println("  \t  \n ".isBlank());  // true

        // strip()：去除首尾空白
        System.out.println("---" + "\t abc \t  \n".strip() + "---");
        System.out.println("---" + "\t abc \t  \n".trim() + "---");

        // stripTrailing()：去除尾部空格
        System.out.println("---" + "\t abc \t  \n".stripTrailing() + "---");

        // stripLeading()：去除首部空格
        System.out.println("---" + "\t abc \t  ".stripLeading() + "---");

        // repeat(int count)：复制字符串
        String str1 = "abc";
        String str2 = str1.repeat(3);
        System.out.println(str2);

        // lines().count()：计算字符串的行数
        String str3 = "a\nb\nc";
        System.out.println(str3.lines().count());
    }
}
