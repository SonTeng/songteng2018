/** 在数组初始化后对数组进行扩容 */

public class ExtendarrayLen {
    public static void main(String[] args){
        String[] names=new String[]{"A","B","C"};
        String[] extended = new String[6];
        extended[3]="D";
        extended[4]="E";
        extended[5]="f";
        System.arraycopy(names,0,extended,0,names.length);
        for(String str:extended){
            System.out.println(str);
        }
    }
}
--------------------------
Output:
A
B
C
D
E
f
