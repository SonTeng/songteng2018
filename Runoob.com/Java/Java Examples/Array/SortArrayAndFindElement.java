/** 使用sort()方法对数组进行排序，及如何使用binarySearch()方法查找数组中的元素，
 * 并定义printArray()方法来打印数组
 */

import java.util.Arrays;

public class SortArrayAndFindElement {
    public static void main(String[] args){
        int array[]={2,5,-2,6,-3,8,0,-7,-9,4};
        indexOf(array,6);
        Arrays.sort(array);
        printArray("排序后的数组结果为：",array);
        int index1 = Arrays.binarySearch(array,6);
        System.out.println("元素6 在第"+index1+"个位置");
    }
    public static void indexOf(int[] array,int num){
        for(int i=0;i<array.length;i++) {
            if (array[i] == num) {
                System.out.println("元素6 在第" + i + "个位置");
            }
        };
    }
    public static void printArray(String message,int array[]){
        System.out.println(message +":[length:"+array.length+"]");
        for(int i=0;i<array.length;i++){
            if(i!=0){
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
----------
Output:
元素6 在第3个位置
排序后的数组结果为：:[length:10]
-9,-7,-3,-2,0,2,4,5,6,8
元素6 在第8个位置
