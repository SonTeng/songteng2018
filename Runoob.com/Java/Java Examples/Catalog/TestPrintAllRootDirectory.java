/** 使用 File 类的 listRoots() 方法来输出系统所有根目录  */
package Examples.Catalog;

import java.io.File;

public class TestPrintAllRootDirectory {
    public static void main(String[] args){
        File[] roots = File.listRoots();
        System.out.println("ALL ROOT DIRECTORIES: ");
        for(int i=0;i<roots.length;i++){
            System.out.println(roots[i].toString());
        }
    }


}
