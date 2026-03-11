package java5_BufferedReader_BufferedWriter;

import org.junit.Test;

import java.io.*;

/**
 * @author Fcs
 * @description
 * @date 2024-10-31 13:53
 */
public class BufferedReader_BufferedWriter {
    @Test
    public void test() throws IOException {
        File srcFile = new File("hi.txt");
        File destFile = new File("hello1.txt");

        FileReader fis = new FileReader(srcFile);
        FileWriter fos = new FileWriter(destFile);
        BufferedReader br = new BufferedReader(fis);
        BufferedWriter bw = new BufferedWriter(fos);

        char[] cbuf = new char[1024];
        int len;
        while ((len = br.read(cbuf)) != -1){
            bw.write(cbuf,0,len);
        }

        br.close();
        bw.close();
        fis.close();
        fos.close();
    }
}
