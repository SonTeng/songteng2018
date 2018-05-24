/**使用readLine()方法读取runoob.txt中的内容，其中runoob.txt中的内容为：菜鸟教程。 */
package Examples.File;

import java.io.*;
public class TestFileRead {
    public static void main(String[] args){
        try{
            BufferedReader in = new BufferedReader(new FileReader("runoob.txt"));
            String str;
            while((str=in.readLine())!=null){
                System.out.println(str);
            }
            System.out.println(str);
        }catch(IOException E){

        }
    }
}
