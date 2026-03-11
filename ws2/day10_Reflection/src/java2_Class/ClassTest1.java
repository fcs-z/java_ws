package java2_Class;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Fcs
 * @description
 * @date 2024-11-04 18:26
 */
public class ClassTest1 {

    @Test
    public void test2() throws IOException {
        Properties pros = new Properties();

        // 方式一： 此时文件默认在当前module下
//        FileInputStream fis = new FileInputStream("jdbc.properties");
//        FileInputStream fis = new FileInputStream("src\\jdbc1.properties"); // 或者
//        pros.load(fis);

        // 方式二： 使用ClassLoader  文件默认在module的src下
        ClassLoader classLoader = ClassTest1.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println("ueser = " + user + ", password = " + password);

    }

    @Test
    public void test1() {
        ClassLoader classLoader = ClassTest1.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);

        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);

        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader3);

    }
}
