/**  使用File类的file.exists()和file.length()方法来获取文件大小，以字节计算(1K=1024字节) */
package Examples.File;

import java.io.File;

public class TestGetFileSize {
    public static void main(String[] args){
        Long size = getFileSize("D:/Java.txt");
        System.out.println("Java.txt文件大小为："+size);
    }
    public static long getFileSize(String filename){
        File file = new File(filename);
        if(!file.exists()||!file.isFile()){
            System.out.println("文件不存在！");
            return -1;
        }
        return file.length();
    }
}
