package java2_TCP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Fcs
 * @description
 * @date 2024-11-03 10:32
 */
public class TCPTest3 {
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
        // 关闭数据的输出
        socket.shutdownOutput();

        // 4。接收服务端
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2 = 0;
        while ((len2 = is.read(buffer2)) != -1) {
            baos.write(buffer2, 0, len2);
        }
        System.out.println(baos.toString());

        // 5。关闭
        fis.close();
        os.close();
        socket.close();
        baos.close();
        is.close();
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
        FileOutputStream fos = new FileOutputStream("花火4.jpg");
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        System.out.println("传输完成");

        // 5。服务器端反馈客户端
        OutputStream os = socket.getOutputStream();
        os.write("服务器已经收到".getBytes());

        // 6.
        fos.close();
        is.close();
        socket.close();
        ss.close();
        os.close();
    }
}
