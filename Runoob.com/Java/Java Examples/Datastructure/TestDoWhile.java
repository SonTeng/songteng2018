/** 使用do...while结构求0~100的整数数字之和。  */
package Examples.Datastructure;

public class TestDoWhile {
    public static void main(String[] args){
        int limit =100;
        int sum=0;
        int i=1;
        do{
            sum=sum+i;
            i++;
        }while(i<=limit);
        System.out.println("Sum: "+ sum);

    }
}
