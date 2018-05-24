/**使用delete()方法将文件删除   */
package Examples.File;

import java.io.File;

public class TestFileDelete {
    public static void main(String[] args){
        try{
            File file = new File("D:\\test2018.txt");
            if(file.delete()){
                System.out.println(file.getName()+"文件已被删除！");
            }else{
                System.out.println("文件删除失败！");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
