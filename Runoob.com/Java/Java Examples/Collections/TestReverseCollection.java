/**   使用 Collection 和 Listiterator 类的 listIterator() 和 collection.reverse() 方法来反转集合中的元素*/
package Examples.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TestReverseCollection {
    public static void main(String[] args) {
      String[] coins = { "A", "B", "C", "D", "E" };
      List l = new ArrayList();
      for (int i = 0; i < coins.length; i++)
         l.add(coins[i]);
      ListIterator liter = l.listIterator();
      System.out.println("反转前");
      while (liter.hasNext())
         System.out.print(liter.next()+" ");
      System.out.println();
      Collections.reverse(l);
      liter = l.listIterator();
      System.out.println("反转后");
      while (liter.hasNext())
         System.out.print(liter.next()+" ");
   }
}
