package java7_InputStream_tranferTo;

import org.junit.Test;

import java.io.*;

/**
 * @author Fcs
 * @description
 * @date 2024-11-14 19:11
 */
public class InputStream_transferToTest {
    @Test
    public void test2() {
        ClassLoader cl = this.getClass().getClassLoader();
        try(InputStream is = cl.getResourceAsStream("hello.txt");
            OutputStream os = new FileOutputStream("src\\hello2.txt")) {
            // 把输入流中的所有数据直接自动地复制到输出流中
            is.transferTo(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() throws IOException {
        ClassLoader cl = this.getClass().getClassLoader();
        InputStream is = cl.getResourceAsStream("hello.txt");
        OutputStream os = new FileOutputStream("src\\hello1.txt");
        is.transferTo(os);
    }

    @Test
    public void test3() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\19065\\Desktop\\隐藏快捷\\1_壁纸\\花火.jpg");
        FileOutputStream fos = new FileOutputStream("花火1.jpg");
        fis.transferTo(fos);
    }
}
