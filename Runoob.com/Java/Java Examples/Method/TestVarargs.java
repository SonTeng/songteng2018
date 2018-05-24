/** Varargs 即可变长度的参数。
 * 定义实参个数可变的方法：只要在一个形参的“类型”与“参数名”之间加上三个连接的“。”，
 * 就可以让它和不确定个数实参相匹配。
 */
package Examples.Method;

public class TestVarargs {
    public static void main(String[] args){
        int sum=0;
        sum = sumvarargs(new int[]{10,12,33,50,1});
        System.out.println("数字相加之和："+sum);
    }
    static int sumvarargs(int... intArrays){
        int sum,i;
        sum=0;
        for(i=0;i<intArrays.length;i++){
            sum+=intArrays[i];
        }
        return(sum);
    }

}
-------------
Output:
数字相加之和：106
