package java4_URL;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Fcs
 * @description  没开启Tomcat服务，代码url暂时不对
 * @date 2024-11-03 12:31
 */
public class URLTest {
    @Test
    public void test() throws IOException {
        URL url = new URL("http://www.baidu.com");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getQuery());

        URLConnection urlConnection = url.openConnection();

        urlConnection.connect();

        InputStream is = urlConnection.getInputStream();
        FileOutputStream fos = new FileOutputStream("花火5.jpg");

        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = is.read(buffer)) != -1)
            fos.write(buffer, 0, len);

        System.out.println("下载完成");

        fos.close();
        is.close();

        }
    }
