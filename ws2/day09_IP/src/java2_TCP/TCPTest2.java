package java2_TCP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Fcs
 * @description 客户端向服务端发送消息，输出内容保存一个文件
 * @date 2024-11-03 9:57
 */
public class TCPTest2 {
    @Test
    public void client() throws IOException {
        // 1。ip和端口号  socket
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        Socket socket = new Socket(inet, 1234);
        // 2。输出流
        OutputStream os = socket.getOutputStream();
        // 3。
        FileInputStream fis = new FileInputStream(new File("D:\\100_学习资料\\5_Code_Java\\two\\day08_IO\\花火.jpg"));
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        // 4。
        fis.close();
        os.close();
        socket.close();
    }

    @Test
    public void server() throws IOException {
        // 1。
        ServerSocket ss = new ServerSocket(1234);
        // 2。
        Socket socket = ss.accept();
        // 3。
        InputStream is = socket.getInputStream();
        // 4。
        FileOutputStream fos = new FileOutputStream("花火3.jpg");
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        System.out.println(fos.toString());
        // 5。
        fos.close();
        is.close();
        socket.close();
        ss.close();
    }
}
