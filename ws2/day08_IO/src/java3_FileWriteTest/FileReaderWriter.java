package java3_FileWriteTest;

import org.junit.Test;

import java.io.*;

/**
 * @author Fcs
 * @description
 * @date 2024-10-31 9:00
 */
public class FileReaderWriter {
    @Test
    public void test() throws IOException {
        // 1. 提供文件
        File srcFile = new File("hi.txt");
        File destFile = new File("hello.txt");
        // 2. 提供流
        FileReader fr = new FileReader(srcFile);
        FileWriter fw = new FileWriter(destFile);
        // 3. 读出，写入
        char[] cbuf = new char[5];
        int len;
        while ((len = fr.read(cbuf)) != -1) {
            fw.write(cbuf, 0, len);
        }
        // 关闭
        fr.close();
        fw.close();
    }
}
