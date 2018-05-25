/**  使用 LinkedList 类的 addFirst() 和 addLast() 方法在链表的开头和结尾添加元素 */
package Examples.Datastructure;

import java.util.LinkedList;

public class TestLinkedListAddFirstAndLast {
    public static void main(String[] args){
        LinkedList<String> lList =new LinkedList<>();
        lList.add("1");
        lList.add("3");
        lList.add("1");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);
        lList.addFirst("0");
        System.out.println(lList);
        lList.addLast("6");
        System.out.println(lList);


    }
}
