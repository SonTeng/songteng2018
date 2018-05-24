/**  使用filewriter方法向文件中追加数据 */
package Examples.File;

import java.io.*;

public class TestFileAppend {
    public static void main(String[] args) throws Exception{
        try{
            BufferedWriter out=new BufferedWriter(new FileWriter("filename1"));
            out.write("sTring1\n");
            out.close();
            out = new BufferedWriter(new FileWriter("filename1",true));
            out.write("aString2");
            out.close();
            // File is appended!
            BufferedReader in =new BufferedReader(new FileReader("filename1"));
            String str;
            while((str=in.readLine())!=null){
                System.out.println(str);
            }
            in.close();
        }catch(Exception e){
            System.out.println("exception occoured"+e);
        }
    }
}
