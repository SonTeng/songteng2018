/**   将字符串转换为集合并使用 Collection 类的 Collection.min() 和 Collection.max() 来比较集合中的元素*/
package Examples.Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestMinMaxCollection {
    public static void main(String[] args){
        String[] coins ={"Penny","nickel","dim","Qutater","dollar"};
        Set<String> set=new HashSet<>();
        for(int i=0;i<coins.length;i++){
            set.add(coins[i]);
        }
        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set,String.CASE_INSENSITIVE_ORDER));

        for (int i = 0; i <= 10; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));
    }
}
