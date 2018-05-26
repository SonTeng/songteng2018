package Examples.Net;

import java.net.URL;
import java.net.URLConnection;

public class TestGetFileSizeRemote {
    public static void main(String[] args) throws Exception {
        int size;
        URL url = new URL("http://file.ituring.com.cn/SmallCover/17085b120d9bf26c208a");
        URLConnection conn = url.openConnection();
        size = conn.getContentLength();
        if (size < 0)
            System.out.println("无法获取文件大小。");
        else
            System.out.println("文件大小为：" + size + " bytes");
        conn.getInputStream().close();
    }
}
