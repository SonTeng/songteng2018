/**使用SimpleDateFormat类的format()方法将时间戳转换成时间 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFormatTime {
    public static void main(String[] args){
        Long timeStamp =System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));

        System.out.println(sd);
    }
}
-----------------
Output:
2018-05-23
