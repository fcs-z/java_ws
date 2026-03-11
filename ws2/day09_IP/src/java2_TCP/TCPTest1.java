package java2_TCP;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Fcs
 * @description 客户端向服务端发送消息，输出内容显示在控制台
 * @date 2024-11-02 22:01
 */
public class TCPTest1 {
    // 客户端
    @Test
    public void client() throws IOException {
        // 1. 提供ip和端口号
        InetAddress inet = InetAddress.getLocalHost();
        Socket socket = new Socket(inet, 1234);
        // 2. 提供输出流
        OutputStream os = socket.getOutputStream();
        // 3。写数据
        os.write("你好，这里是客户端".getBytes());
        // 4. 关闭
        os.close();
        socket.close();

    }

    // 服务端
    @Test
    public void server() throws IOException {
        // 1. 提供端口号
        ServerSocket ss = new ServerSocket(1234);
        // 2. 调用accept() 接受数据
        Socket socket = ss.accept();
        // 3. 提供输入流
        InputStream is = socket.getInputStream();
        // 4. 读取输入流中数据
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = is.read(buf)) != -1) {
            baos.write(buf, 0, len);
        }
        System.out.println(baos.toString());
        System.out.println("收到来自：" + socket.getInetAddress().getHostAddress() + "的数据");
        // 5. 关闭
        baos.close();
        is.close();
        socket.close();
        ss.close();
    }
}
