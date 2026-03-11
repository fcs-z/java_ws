package java8_InputStreamReader_OutputStreamWriter;

import org.junit.Test;

import java.io.*;

/**
 * @author Fcs
 * @description
 * @date 2024-11-01 10:17
 */
public class InputStreamReader_OutputStreamWriter {
    @Test
    public void test() throws IOException {
        File file1 = new File("hi.txt");
        File file2 = new File("hi_gbk.txt");

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");

        char[] cbuf = new char[1024];
        int len = 0;
        while ((len = isr.read(cbuf)) != -1){
            osw.write(cbuf,0,len);
        }

        isr.close();
        osw.close();
    }
}
