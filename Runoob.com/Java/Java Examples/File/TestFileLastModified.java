/**使用File类的fileToChang.lastModified()和fileToChang.setLastModified()方法来修改文件的最后修改日期   */
package Examples.File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFileLastModified {
    public static void main(String[] args) throws IOException {
        File fileToChange=new File("D:/myjavafile.txt");
        fileToChange.createNewFile();
        Date filetime=new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        //过一段时间后再查询文件的上次修改时间
        long sum=0;
        for(long i=0;i<6000000;i++){
            sum+=i;
        }
        System.out.println(sum);

        filetime=new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
    }
}
