package java11_RandomAccessFile;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Fcs
 * @description
 * @date 2024-11-02 11:48
 */
public class RandomAccessFileTest {

    // 实现数据的插入
    @Test
    public void test2() throws FileNotFoundException, IOException {
        RandomAccessFile raf = new RandomAccessFile("hi.txt", "rw");

        // 保存插入位置后面的数据
        StringBuilder sb = new StringBuilder((int) new File("hi.txt").length());
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = raf.read(buffer)) != -1){
            sb.append(new String(buffer,0,len));
        }

        // 插入数据
        raf.seek(3);
        raf.write("xyz".getBytes());

        // 添入插入后面的数据
        raf.write(sb.toString().getBytes());

        raf.close();

    }

    @Test
    public void test1() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("花火.jpg", "r");
        RandomAccessFile raf2 = new RandomAccessFile("花火2.jpg", "rw");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = raf1.read(buffer))!=-1){
            raf2.write(buffer,0,len);
        }

        raf1.close();
        raf2.close();
    }
}
