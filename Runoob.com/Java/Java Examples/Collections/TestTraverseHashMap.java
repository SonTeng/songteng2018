/**  使用 Collection 类的 iterator() 方法来遍历集合 */
package Examples.Collection;

import java.util.*;

public class TestTraverseHashMap {
    public static void main(String[] args){
        HashMap<String,String> hMap=new HashMap<>();
        hMap.put("1","1st");
        hMap.put("2","2nd");
        hMap.put("3","3rd");
        hMap.put("4","3rd");
        Collection c1=hMap.values();

        Iterator itr=c1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
