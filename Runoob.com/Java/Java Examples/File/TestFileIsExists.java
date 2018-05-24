/** 使用File类的file.exists()方法来检测文件是否存在   */
package Examples.File;

import java.io.File;

public class TestFileIsExists {
    public static void main(String[] args){
        File file = new File("D:/JavaToChange.txt");
        System.out.println(file.exists());
    }
}
