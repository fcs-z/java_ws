package java4_FileInputStream_FileOutputStream;

import org.junit.Test;

import java.io.*;

/**
 * @author Fcs
 * @description
 * @date 2024-10-31 13:26
 */
public class FileInputStream_FileOutputStream {
    @Test
    public void test1() throws IOException {
        File srcFile = new File("C:\\Users\\19065\\Desktop\\隐藏快捷\\1_壁纸\\花火.jpg");
        File destFile = new File("花火.jpg");

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1){
            fos.write(buffer,0,len);
            fos.flush();
        }

        fis.close();
        fos.close();
    }

    @Test
    public void test2() throws IOException {
        String srcFilePath = "C:\\Users\\19065\\Desktop\\隐藏快捷\\1_壁纸\\花火.jpg";
        String destFilePath = "花火1.jpg";
        copyFileStream(srcFilePath,destFilePath);
    }


    public void copyFileStream(String srcFilePath, String destFilePath) throws IOException {

        FileInputStream fis = new FileInputStream(srcFilePath);
        FileOutputStream fos = new FileOutputStream(destFilePath);

        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }

        fis.close();
        fos.close();
    }
}
