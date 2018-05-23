/** 使用List类的Arrays.toString()方法和list.addAll()方法将两个数组合并为一个数组*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArray {
    public static void main(String[] args){
        String[] a={ "A","E","I"};
        String[] b={"O","U"};
        List list = new ArrayList(Arrays.asList(b));
        list.addAll(Arrays.asList(a));
        Object[] c=list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
------------
Output:
[O, U, A, E, I]
