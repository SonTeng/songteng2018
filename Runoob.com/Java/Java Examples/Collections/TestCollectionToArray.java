package Examples.Collection;

import java.util.*;
public class TestCollectionToArray {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.runoob.com");
        String[] s1 = list.toArray(new String[0]);
        for(int i = 0; i < s1.length; ++i){
            String contents = s1[i];
            System.out.print(contents);
        }
        System.out.println();

        System.out.println("---------------------");
        String[] s2=new String[list.size()];
        s2=list.toArray(s2);

        for(int i = 0; i < s2.length; ++i){
            String contents = s2[i];
            System.out.print(contents);
        }
    }
}
