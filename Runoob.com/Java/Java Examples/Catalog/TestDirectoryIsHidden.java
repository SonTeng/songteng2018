/**  使用 File 类的 file.isHidden() 方法来判断文件是否隐藏。 */
package Examples.Catalog;

import java.io.File;

public class TestDirectoryIsHidden {
    public static void main(String[] args) {
        File file = new File("./testdir/1.txt");
        System.out.println(file.isHidden());
    }
}
