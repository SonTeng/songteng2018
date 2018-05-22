/**通过使用format()方法来格式化字符串，还可以制定地区来格式化 */

import java.util.Locale;

public class StringFormat {
    public static void main(String[] args){
        double e =Math.E;
        System.out.format("%s%n",e);
        System.out.format(Locale.CHINA,"%-10.4f%n%n",e);
    }
}
---------
Output:
2.718281828459045
2.7183
