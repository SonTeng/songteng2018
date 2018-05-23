public class TestFactorial {
    public static void main(String[] args){
        for(int counter =0;counter<=10;counter++){
            System.out.printf("%d!= %d\n",counter,factorial(counter));

        }
    }
    public static long factorial(long number){
        if(number<=1) {
            return 1;
        }
        else{
                return number*factorial(number-1);

        }
    }
}
----------------------
Output:
0!= 1
1!= 1
2!= 2
3!= 6
4!= 24
5!= 120
6!= 720
7!= 5040
8!= 40320
9!= 362880
10!= 3628800
