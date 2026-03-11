package java10_ObjectInputStream_ObjectOutputStream;

import org.junit.Test;

import java.io.*;

/**
 * @author Fcs
 * @description
 * @date 2024-11-02 9:22
 */
public class ObjectInputStream_ObjectOutputStream {
    @Test
    public void test1() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"));

        oos.writeObject(new String("你好"));
        oos.flush();
        oos.writeObject(new Person("Tom",23));
        oos.flush();

        oos.close();
    }

    @Test
    public void test2() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"));

        Object o = ois.readObject();
        System.out.println(o);
        String str = (String) o;
        System.out.println(str);

        Person p = (Person) ois.readObject();
        System.out.println(p);
        ois.close();
    }
}
