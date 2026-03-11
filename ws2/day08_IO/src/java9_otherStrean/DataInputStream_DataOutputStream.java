package java9_otherStrean;

import org.junit.Test;

import java.io.*;

/**
 * @author Fcs
 * @description
 * @date 2024-11-01 11:44
 */
public class DataInputStream_DataOutputStream {

    // 写入
    @Test
    public void test1() throws IOException {
//        DataOutputStream dos = new DataOutputStream(new FilterOutputStream(new File("hello2.txt")));
        File file = new File("hello2.txt");
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("风");
        dos.flush();
        dos.writeInt(24);
        dos.flush();

        dos.close();
    }

    // 读
    @Test
    public void test2() throws IOException {
        File file = new File("hello2.txt");

        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);

        String str = dis.readUTF();
        int age = dis.readInt();
        System.out.println(str + "\t" + age);
    }
}
