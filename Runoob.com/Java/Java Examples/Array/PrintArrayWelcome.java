/** 循环输出数组*/

public class PrintArrayWelcome {
    public static void main(String[] args){
        String[] greeting=new String[3];
        greeting[0]="Welcome";
        greeting[1]="to";
        greeting[2]="China";
        for(int i =0;i<greeting.length;i++){
            System.out.println(greeting[i]);
        }
    }
}
-------------
Output:
Welcome
to
China
