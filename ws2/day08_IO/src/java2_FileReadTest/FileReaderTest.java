package java2_FileReadTest;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Fcs
 * @description
 * @date 2024-10-30 21:55
 */
public class FileReaderTest {

    // read(char[] cbuf)
    @Test
    public void test3() throws IOException {
        File file = new File("hi.txt");
        FileReader fr = new FileReader(file);

        char[] cbuf = new char[5];
        int len;
        while ((len = fr.read(cbuf)) != -1){
            // 方式一
//            for (int i = 0; i < len; i++) {           // 错误: for (int i = 0; i < cbuf.length(); i++) {
//                System.out.print(cbuf[i]);
//            }

            // 方式二
//            String str = new String(cbuf);  // 错误
            String str = new String(cbuf, 0, len);
            System.out.print(str);
        }
        fr.close();

    }

    // read()
    @Test
    public void test2() {
        java.io.FileReader fr = null;
        try {
            File file = new File("hi.txt");
            fr = new FileReader(file);

            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void test1() throws IOException {
        File file = new File("hi.txt");
        FileReader fr = new FileReader(file);

        // 方式一
//        int data = fr.read();
//        while (data != -1) {
//            System.out.print((char) data);
//            data = fr.read();
//        }

        // 方式二
        int data;
        while ((data = fr.read()) != -1) {
            System.out.print((char) data);
        }

        fr.close();

    }
}
