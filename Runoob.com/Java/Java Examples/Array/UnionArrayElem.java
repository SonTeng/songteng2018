/**使用union()方法来计算两个数组的并集 */

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class UnionArrayElem {
    public static void main(String[] args){
        String[] arr1={"1","2","3","2"};
        String[] arr2={"4","4","5","6"};
        String[] result_union=union(arr1,arr2);
        System.out.println("并集的结果如下：");
        for (String str:result_union){
            System.out.print(str + " ");
        }

    }
    public static String[] union(String[] arr1,String[] arr2){
        Set<String> set=new HashSet<String>();
        for(String str:arr1){
            set.add(str);
        }
        for(String str:arr2){
            set.add(str);
        }
        String[] result ={ };
        return set.toArray(result);
    }
}
------------------------
Output:
并集的结果如下：
1 2 3 4 5 6 
