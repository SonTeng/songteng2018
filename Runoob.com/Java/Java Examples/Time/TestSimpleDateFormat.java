/** 使用SimpleDateFormat类的format(date)方法来格式化时间。*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
    public static void main(String[] args){
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        String strDateFormat1 = "HH:mm:ss yyyy-MM-dd";
        String strDateFormat2 = "HH:mm:ss MM-dd-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        SimpleDateFormat sdf1 = new SimpleDateFormat(strDateFormat1);
        SimpleDateFormat sdf2 = new SimpleDateFormat(strDateFormat2);
        System.out.println(sdf.format(date));
        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));
    }
}
-----------------
Output:
2018-05-23 19:20:14
19:20:14 2018-05-23
19:20:14 05-23-2018
