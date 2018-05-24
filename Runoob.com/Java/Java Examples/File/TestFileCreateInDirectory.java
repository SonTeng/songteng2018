/**  使用 File 类的 file.createTempFile() 方法在指定目录中创建文件 */
package Examples.File;

import java.io.File;
import java.io.*;
public class TestFileCreateInDirectory  {
    public static void main(String[] args) throws Exception{
        File file =null;
        File dir = new File("D:/");
        file=File.createTempFile("JavaTemp",".javatemp",dir);
        System.out.println(file.getPath());

    }
}
