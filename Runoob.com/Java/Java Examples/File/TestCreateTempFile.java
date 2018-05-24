/**使用createTempFile(String prefix,String suffix,File directory)中的directory参数来指定临时文件的目录。
 * 注：执行此程序两次，会发现临时文件的命名不同。
 */
package Examples.File;

import java.io.File;

public class TestCreateTempFile {
    public static void main(String[] args){
        File f =null;
        try{
            // 创建临时文件
            f=File.createTempFile("tmp",".txt",new File("D:/"));
            //输出绝对路径
            System.out.println("File path:"+f.getAbsolutePath());
            //终止后删除临时文件
            f.deleteOnExit();
            f=File.createTempFile("tmp",null,new File("E:/"));
            System.out.println("File path:"+f.getAbsolutePath());
            // f.deleteOnExit(); // 若无此句，则临时文件将继续存在
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
