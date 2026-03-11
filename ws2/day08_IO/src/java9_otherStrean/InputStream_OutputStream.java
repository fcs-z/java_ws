package java9_otherStrean;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * @author Fcs
 * @description 字符串转大写
 * @date 2024-11-01 11:05
 */
public class InputStream_OutputStream {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            System.out.println("输入字符串：");
            String data = br.readLine();
            if("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
                System.out.println("程序结束");
                break;
            }
            String upperCase = data.toUpperCase();
            System.out.println(upperCase);
        }
        br.close();
    }

    @Test
    public void test() {

    }
}
