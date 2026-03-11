package java6_BufferedInputStream_BufferedOutputStream;

import org.junit.Test;

import java.io.*;

/**
 * @author Fcs
 * @description
 * @date 2024-10-31 13:55
 */
public class BufferedInputStream_BufferedOutputStream {
    @Test
    public void test() throws IOException {
        File srcFile = new File("C:\\Users\\19065\\Desktop\\隐藏快捷\\1_壁纸\\花火.jpg");
        File destFile = new File("花火2.jpg");

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] buff = new byte[1024];
        int len;
        while ((len = bis.read(buff)) != -1){
            bos.write(buff,0,len);
        }

        bis.close();
        bos.close();
        fis.close();
        fos.close();
    }
}
