/** 使用 listname.add() 和 listname.set() 方法来修改链接中的元素  */
package Examples.Datastructure;

import java.util.LinkedList;

public class TestSetListElem {
    public static void main(String[] a) {
        LinkedList officers = new LinkedList();
        officers.add("B");
        officers.add("B");
        officers.add("T");
        officers.add("H");
        officers.add("P");
        System.out.println(officers);
        officers.set(2, "M");
        System.out.println(officers);
    }

}
