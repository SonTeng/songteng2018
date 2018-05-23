/** 通过Collections.max()等方法来查找数组中的最大值和最小值，
 * Integer自动装箱，以及显示类型转换，
 * 关于数组和列表的转换，使用Arrays.asList()方法。
 */

import java.util.Arrays;
import java.util.Collections;

public class MaxAndMinOfArray {
    public static void main(String[] args){
        Integer[] numbers = {8,2,7,1,4,9,5};
        int min=(int) Collections.min(Arrays.asList(numbers));
        int max = (int)Collections.max(Arrays.asList(numbers));
        System.out.println("最大值："+max);
        System.out.println("最小值："+ min);
    }
}
----------
Output:
最大值：9
最小值：1
