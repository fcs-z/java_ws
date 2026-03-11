package java8_InputStreamReader_OutputStreamWriter;

import org.junit.Test;

import java.io.*;

/**
 * @author Fcs
 * @description
 * @date 2024-11-01 10:02
 */
public class InputStreamReaderTest {
    @Test
    public void test() throws IOException {
        FileInputStream fis = new FileInputStream(new File("hi.txt"));
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");

        char[] cbuf = new char[1024];
        int len = 0;
        while ((len = isr.read(cbuf)) != -1){
            String str = new String(cbuf,0,len);
            System.out.println(str);
        }

        isr.close();
    }
}
