package java4_try_Upgrade;

import org.junit.Test;

import java.io.*;

/**
 * @author Fcs
 * @description
 * @date 2024-11-13 23:30
 */
public class TryTest {
    public static void main(String[] args) throws FileNotFoundException {
        // jdk8之前
        /*InputStreamReader reader = new InputStreamReader(System.in);
        try {
             reader = new InputStreamReader(System.in);
            int len;
            char[] cbuf = new char[1024];
            while ((len = reader.read(cbuf)) != -1){
                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/

        // jdk8
        /*try(InputStreamReader reader = new InputStreamReader(System.in)) {
            int len;
            char[] cbuf = new char[1024];
            while ((len = reader.read(cbuf)) != -1){
                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // jkd9
         InputStreamReader reader = new InputStreamReader(System.in);
         OutputStreamWriter writer = new OutputStreamWriter(System.out);
        try(reader;writer) {
            int len;
            char[] cbuf = new char[1024];
            while ((len = reader.read(cbuf)) != -1){
                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void test1() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\19065\\Desktop\\隐藏快捷\\1_壁纸\\花火.jpg");
        FileOutputStream fos = new FileOutputStream("花火.jpg");
//        BufferedInputStream bis = new BufferedInputStream(fis);
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        try(fis; fos) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
                fos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\19065\\Desktop\\隐藏快捷\\1_壁纸\\花火.jpg");
        FileOutputStream fos = new FileOutputStream("花火1.jpg");
        fis.transferTo(fos);
    }
}
