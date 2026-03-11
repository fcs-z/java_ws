package java3_FileWriteTest;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Fcs
 * @description
 * @date 2024-10-31 8:00
 */
public class FileWriterTest {
    @Test
    public void test1() throws IOException {
        File file = new File("hello.txt");

        FileWriter fw = new FileWriter(file);

        fw.write("good\n");
        fw.write("yes");

        fw.close();
    }
}
