/** 使用File类的oldName.renameTo(newName)方法来重命名文件，
 * 注：执行程序前应该先创建文件
 */
package Examples.File;

import java.io.File;

public class TestFileRename {
    public static void main(String[] args){
        File oldName = new File("D:/Java.txt");
        File newName = new File("D:/JavaToChange.txt");
        if(oldName.renameTo(newName)){
            System.out.println("已经重命名。");
        }else{
            System.out.println("Error");
        }
    }

}
