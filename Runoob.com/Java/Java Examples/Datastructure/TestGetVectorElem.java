/** 使用 Collections 类的 sort() 方法对向量进行排序并使用 binarySearch() 方法来获取向量元素的索引值  */
package Examples.Datastructure;

import java.util.Collections;
import java.util.Vector;

public class TestGetVectorElem {
    public static void main(String[] args){
        Vector v=new Vector();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("AC");
        v.add("B");
        v.add("O");

        Collections.sort(v);
        System.out.println(v);

        int index=Collections.binarySearch(v,"D");
        System.out.println("元素D的索引值为："+index);
    }
}
