/** 使用sort()方法对数组进行排序，及如何使用insertElemnet()方法向数组插入元素，
 *  并定义printArray()方法打印数组
 */

import java.util.Arrays;

public class InsertElementToArray {
    public static void main(String[] args){
        int [] array={2,5,-2,6,-3,8,0,-7,-9,4};
        Arrays.sort(array);
        printArray("数组排序",array);
        int index=Arrays.binarySearch(array,1);
        System.out.println("元素 1 所在位置(负数为不存在)："+index);
        int newIndex=-index-1;
        array=insertElement(array,1,newIndex);
        printArray("数组添加元素 1",array);
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
    private static int[] insertElement(int original[],int element,int index){
        int length=original.length;
        int destination[]=new int[length+1];
        System.arraycopy(original,0,destination,0,index);
        destination[index]=element;
        System.arraycopy(original,index,destination,index+1,length-index);
        return destination;
    }
}

----------------
Output:
数组排序:[length:10]
-9,-7,-3,-2,0,2,4,5,6,8
元素 1 所在位置(负数为不存在)：-6
数组添加元素 1:[length:11]
 -9,-7,-3,-2,0,1,2,4,5,6,8
