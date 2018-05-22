/** 使用StringTokenizer 设置不同的分隔符来分隔字符串，默认分隔符时：空格、制表符(\t)、换行符(\n)、回车符(\r)等。 */

import java.util.StringTokenizer;

public class EmpStringTokenizer {
    public static void main(String[] args){
        String str = "This is String,split by StringTokenizer,created by runoob";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("-------通过空格分隔------");
        while(st.hasMoreElements()){
            System.out.println(st.nextElement());
        }

        System.out.println("------通过逗号分隔------");
        StringTokenizer st2 = new StringTokenizer(str,",");

        while(st2.hasMoreElements()){
            System.out.println(st2.nextElement());
        }
    }
}
----------
Output:
This
is
String,split
by
StringTokenizer,created
 by
runoob
------通过逗号分隔------
This is String
split by StringTokenizer
created by runoob
