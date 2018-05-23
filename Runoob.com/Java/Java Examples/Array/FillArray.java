/** 使用java util类的Arrays.fill(arrayname,value)方法和Arrays.fill(arrayname,starting index,ending index,value)方法向数组中填充元素。*/

import java.util.Arrays;

public class FillArray {
    public static void main(String[] args){
        int array[] = new int[6];
        Arrays.fill(array,100);
        for(int i=0,n=array.length;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("----------------分割线------------------------");
        Arrays.fill(array,3,6,50);
        for(int i=0,n=array.length;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
---------------
Output:
100 100 100 100 100 100
----------------分割线------------------------
100 100 100 50 50 50 
