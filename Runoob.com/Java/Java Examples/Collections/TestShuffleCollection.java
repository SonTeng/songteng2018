/**  使用 Collections 类 Collections.shuffle() 方法来打乱集合元素的顺序 */
package Examples.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestShuffleCollection {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println("打乱前顺序： "+list);

        for(int i=1;i<6;i++){
            System.out.println("第"+i+"次打乱");
            Collections.shuffle(list);
            System.out.println(list);
        }
    }
}
