/**使用remove()方法来删除数组元素 */

import java.util.ArrayList;

public class DelArrElem {
    public static void main(String[] args){
        ArrayList<String> objArray = new ArrayList<String>();
        objArray.clear();
        objArray.add(0,"第0个元素");
        objArray.add(1,"第1个元素");
        objArray.add(2,"第2个元素");
        System.out.println("数组删除元素之前："+objArray);
        objArray.remove(1);
        objArray.remove("第0个元素");
        System.out.println("数组删除后："+ objArray);
    }
}

--------------------
Output:
数组删除元素之前：[第0个元素, 第1个元素, 第2个元素]
数组删除后：[第2个元素]
