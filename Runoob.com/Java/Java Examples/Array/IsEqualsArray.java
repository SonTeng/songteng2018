/** 使用equals()方法来判断数组是否相等。*/


import java.util.Arrays;

public class IsEqualsArray {
    public static void main(String[] args){
        int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        System.out.println("数组ary是否与数组ary1相等？："+Arrays.equals(ary,ary1));
        System.out.println("数组ary是否与数组ary1相等？："+Arrays.equals(ary,ary2));
    }
}
------------------
Output:
数组ary是否与数组ary1相等？：true
数组ary是否与数组ary1相等？：false
