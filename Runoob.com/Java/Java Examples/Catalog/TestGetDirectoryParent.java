/**使用 File 类的 file.getParent() 方法来获取文件的上级目录   */
package Examples.Catalog;

import java.io.File;

public class TestGetDirectoryParent {
    public static void main(String[] args){
        File file=new File("D:\\JetBrains\\Wspaces\\Runoob\\testdir\\新建文件夹");
        String strParentDirectory=file.getParent();
        System.out.println("文件的上级目录为 : " +strParentDirectory);
    }

}
