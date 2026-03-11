package java1_File;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Fcs
 * @description
 * @date 2024-10-30 21:44
 */
public class FileTest {
    @Test
    public void test2() throws IOException {
        File file = new File("D:\\100_学习资料\\5_Code_Java\\two\\day08_IO\\src\\java1_File\\createFile");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
    }

    @Test
    public void test1() throws IOException {
        File file = new File("hi.txt");
        System.out.println(file.getAbsolutePath());

        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
}
