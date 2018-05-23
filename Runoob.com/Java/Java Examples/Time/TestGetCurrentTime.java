/** 使用Date类和SimpleDateFormat类的format(date)方法来输出当前时间*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestGetCurrentTime {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a"); //a做am/pm的标记；
        Date date =new Date();
        System.out.println("现在时间："+sdf.format(date));
    }
}
---------------------
Output:
现在时间：2018-05-23 19:27:41 下午
