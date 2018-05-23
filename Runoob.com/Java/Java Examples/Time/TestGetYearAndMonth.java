/**使用Calendar类来输出年份、月份等。  */

import java.util.Calendar;

public class TestGetYearAndMonth {
    public static void main(String[] args){
        Calendar cal=Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        int dom=cal.get(Calendar.DAY_OF_MONTH);
        int doy=cal.get(Calendar.DAY_OF_YEAR);

        System.out.println("当前时间：" + cal.getTime());
        System.out.println("日期：" + day);
        System.out.println("月份：" + month);
        System.out.println("年份："+year);
        System.out.println("一周的第几天：" +dow );
        System.out.println("一月中的第几天：" +dom );
        System.out.println("一年的第几天：" + doy);

    }
}
----------------------
Output:
当前时间：Wed May 23 19:38:19 CST 2018
日期：23
月份：5
年份：2018
一周的第几天：4
一月中的第几天：23
一年的第几天：143



