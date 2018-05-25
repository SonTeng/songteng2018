/** 使用 File 类的 FileUtils.sizeofDirectory(File Name) 来获取目录的大小  */
package Examples.Catalog;

import java.io.File;


public class TestGetDirectorySize {
    public static void main(String[] args){
        long size=sizeOfDirectory(new File("./testdir"));
        System.out.println("Size:"+size+"bytes");
    }
    public static long sizeOfDirectory(File file){
        long size=0;
        String[] result =new String[10];
        if(file.isDirectory()){
            result=file.list();
        }
        size=(long)result.length;
        return size;
    }
}
