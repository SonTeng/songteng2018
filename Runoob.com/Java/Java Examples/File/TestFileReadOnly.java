/**使用File类的file.setReadOnly()和file.canWrite()方法来设置文件只读。   */
package Examples.File;

import java.io.File;
public class TestFileReadOnly {
    public static void main(String[] args){
        File file = new File("D:/JavaToChange.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}
