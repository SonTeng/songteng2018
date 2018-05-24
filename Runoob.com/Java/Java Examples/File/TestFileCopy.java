/**使用BufferedWriter类的read和write方法将文件中的内容复制到另一个文件。   */
package Examples.File;

import java.io.*;
public class TestFileCopy {
    public static void main(String[] args) throws Exception{
        BufferedWriter out1=new BufferedWriter(new FileWriter("srcfile"));
        out1.write("string to be copied\n");
        out1.close();
        InputStream in = new FileInputStream(new File("srcfile"));
        OutputStream out=new FileOutputStream(new File("destnfile"));
        byte[] buf =new byte[1024];
        int len;
        while((len=in.read(buf))>0){
            out.write(buf,0,len);
        }
        in.close();
        out.close();
        // File is copied..
        BufferedReader in1=new BufferedReader(new FileReader("destnfile"));
        String str;
        while((str=in1.readLine())!=null){
            System.out.println(str);
        }
        in.close();
    }
}
