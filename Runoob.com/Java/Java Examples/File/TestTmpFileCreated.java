/**使用File类的createTempFile(String prefix,String suffix)方法在默认临时目录来创建临时文件，参
 * 数prefix为前缀，suffix为后缀。
 */
package Examples.File;

import java.io.*;
public class TestTmpFileCreated {
    public static void main(String[] args) throws Exception{
        File tmp = File.createTempFile("testrunoobtmp",".txt");
        System.out.println("文件路径："+tmp.getAbsolutePath());
        tmp.deleteOnExit();
        BufferedWriter out=new BufferedWriter(new FileWriter(tmp));
        out.write("aStringaString");
        System.out.println("临时文件已创建。");
        out.close();

    }
}
