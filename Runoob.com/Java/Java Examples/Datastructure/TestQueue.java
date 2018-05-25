package Examples.Datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();

        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String str:queue){
            System.out.print(str+"  ");
        }
        System.out.println();
        System.out.println("==========");
        System.out.println("POLL= "+queue.poll());  //返回第一个元素，并在队列中删除
        for(String q:queue){
            System.out.print(q+"  ");
        }
        System.out.println();
        System.out.println("==========");
        System.out.println("element= "+queue.element()); //返回第一个元素
        for(String q:queue){
            System.out.print(q+"  ");
        }
        System.out.println();
        System.out.println("==========");
        System.out.println("peek= "+queue.peek());  // 返回第一个元素
        for(String q:queue){
            System.out.print(q+"  ");
        }
    }
}
