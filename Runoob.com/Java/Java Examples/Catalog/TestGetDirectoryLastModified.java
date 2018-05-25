package Examples.Catalog;

import java.io.File;
import java.util.Date;

public class TestGetDirectoryLastModified {
    public static void main(String[] args){
        File file=new File("D:\\JetBrains\\Wspaces\\Runoob\\testdir\\新建文件夹");
        Date date=new Date(file.lastModified());
        System.out.println("最后修改时间："+date);

    }
}
