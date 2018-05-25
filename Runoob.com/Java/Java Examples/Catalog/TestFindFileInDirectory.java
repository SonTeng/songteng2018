/**  使用 File 类的 dir.list() 方法在指定目录中查找所有文件列表 */
package Examples.Catalog;

import java.io.File;

public class TestFindFileInDirectory {
    public static void main(String[] args){
        File dir=new File("./testdir");
        String[] children = dir.list();
        if(children==null){
            System.out.println("该目录不存在");
        }else{
            for(int i=0;i<children.length;i++){
                String filename=children[i];
                System.out.println(filename);
            }
        }
    }
}
