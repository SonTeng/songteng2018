package Examples.Catalog;
/** 在 F 盘中查找以字母 'O' 开头的所有文件  */
import java.io.File;

public class TestPrintAllFilesFromDirectory {
    public static void main(String[] args) {
        File dir = new File("F:");
        String[] children = dir.list();
        if (children == null) {
            System.out.println( "目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
