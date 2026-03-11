package java9_otherStrean;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author Fcs
 * @description
 * @date 2024-11-01 11:31
 */
public class PrinrStream_PrintWriter  {

    @Test
    public void test() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("hi_print.txt"));

        PrintStream ps = new PrintStream(fos,true);

        if(ps != null){
            System.setOut(ps);
        }

        for (int i = 0; i < 255; i++) {
            System.out.println((char)i);
            if(i % 50 == 0)
                System.out.println();
        }


        ps.close();
    }


}
