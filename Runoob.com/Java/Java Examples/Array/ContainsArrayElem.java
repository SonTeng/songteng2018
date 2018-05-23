/** 使用contains()方法来查找数组在的指定元素。 */

import java.util.ArrayList;

public class ContainsArrayElem {
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
        System.out.println("objArray 是否包含字符串aommon2? :"+objArray.contains("common2"));
        System.out.println("objArray2 是否包含字符串objArray? :"+objArray2.contains(objArray));

    }
}
----------------------
Output:
array1 的元素：[common1, common2, notcommon2]
array2 的元素：[common1, common2, notcommon, notcommon1]
objArray 是否包含字符串aommon2? :true
objArray2 是否包含字符串objArray? :false

