/** 使用Collections.reverse(ArrayList)数组进行反转 */

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        arrayList.add("G");
        arrayList.add("H");
        System.out.println( "反转前的数组排序"+arrayList);
        Collections.reverse(arrayList);
        System.out.println( "反转后的数组排序"+arrayList);
    }
}
------------
Output:
反转前的数组排序[A, B, C, D, E, F, G, H]
反转后的数组排序[H, G, F, E, D, C, B, A]
