/**  使用 clear() 方法来删除链表中的元素 */
package Examples.Datastructure;

import java.util.*;

public class TestLinkedListDeleteElem {
    public static void main(String[] args){
        LinkedList<String> lList =new LinkedList<>();
        lList.add("1");
        lList.add("8");
        lList.add("6");
        lList.add("4");
        lList.add("6");
        System.out.println(lList);

        System.out.println(lList.subList(2,4));
        lList.addLast("6");
        System.out.println(lList);

        lList.subList(2,4).clear();
        System.out.println(lList);


    }
}
