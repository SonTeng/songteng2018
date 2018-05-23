import java.util.Scanner;

public class TestFibonacci {
    public static void main(String[] args){
        for(int counter =0;counter<=10;counter++){
           System.out.printf("Fbinacci of %d is: %d\n",counter,fibonacci(counter));

        }
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个数字，求其斐波那契数列值为：");
        if(scan.hasNextLong()){
            Long a=scan.nextLong();
            System.out.println(fibonacci(a));
        }
    }
    public static long fibonacci(long number){
        if((number==0)||(number==1))
            return number;
        else
            return fibonacci(number-1)+fibonacci(number-2);
    }
}
-----------------
Output:
Fbinacci of 0 is: 0
Fbinacci of 1 is: 1
Fbinacci of 2 is: 1
Fbinacci of 3 is: 2
Fbinacci of 4 is: 3
Fbinacci of 5 is: 5
Fbinacci of 6 is: 8
Fbinacci of 7 is: 13
Fbinacci of 8 is: 21
Fbinacci of 9 is: 34
Fbinacci of 10 is: 55
输入一个数字，求其斐波那契数列值为：
10
55
