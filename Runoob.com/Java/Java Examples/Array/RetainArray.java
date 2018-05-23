/** 使用retainAll()方法来计算两个数组的交集 /

import java.util.ArrayList;

public class RetainArray {
    public static void main(String[] args){
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        objArray.add(2,"notcommon2");
        System.out.println("array1 的元素："+objArray);
        System.out.println("array2 的元素："+objArray2);
        objArray.retainAll(objArray2);
        System.out.println("array1与array2的数组交集为："+objArray);
    }
}
-----------------------
Output:
array1 的元素：[common1, common2, notcommon2]
array2 的元素：[common1, common2, notcommon, notcommon1]
array1与array2的数组交集为：[common1, common2]