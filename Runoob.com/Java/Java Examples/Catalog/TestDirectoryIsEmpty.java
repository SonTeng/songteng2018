/**   使用 File 类的 file.isDirectory() 和 file.list() 方法来判断目录是否为空。*/
package Examples.Catalog;

import java.io.File;
import java.util.Arrays;

public class TestDirectoryIsEmpty {
    public static void main(String[] args){
        File file = new File("./testdir");

        if(file.isDirectory()){
            if(file.list().length>0){
                System.out.println("Isnot empty!");
            }else{
                System.out.println("Is empty!");
            }
        }else{
            System.out.println("Isnot a directory!");
        }

        if(file.isDirectory()){
            String[] a=new String[10];
            a=file.list();
            System.out.println(Arrays.asList(a));
        }
    }
}
