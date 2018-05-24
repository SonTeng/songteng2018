/**使用write()方法向文件中写入内容，
 * 创建成功后当前目录下就会生成一个名为runoob.txt的文件，并将“菜鸟教程”字符串写入该文件。
 */
package Examples.File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWrite {
    public static void main(String[] args){
        try{
            BufferedWriter out=new BufferedWriter(new FileWriter("runoob.txt"));
            out.write("菜鸟教程");
            out.close();
            System.out.println("文件创建成功！");
        }catch(IOException e){

        }
    }
}
