/**  使用 swap() 函数来旋转向量 */
package Examples.Datastructure;

import java.util.Collections;
import java.util.Vector;

public class TestSwapVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        System.out.println(v);
        Collections.swap(v, 0, v.size()-1);
        System.out.println("旋转后");
        System.out.println(v);
    }


}
