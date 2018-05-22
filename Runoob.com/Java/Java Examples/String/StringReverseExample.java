/** 使用java 的反转函数reverse()将字符串反转，并使用StringBuffer来修改字符串 */

public class StringReverseExample {
    public static void main(String[] args){
        String str = "runoob";
        String reversedString = new StringBuffer(str).reverse().toString();
        String anotherreversedString = new StringBuilder(reversedString.replace('o','a')).reverse().toString();

        System.out.println("Before reversing,the string is: " + str);
        System.out.println("After reversing, the string is: " + reversedString);
        System.out.println("After another reversing, the string is:  " + anotherreversedString);
    }
}
  
----------  
Output:
Before reversing,the string is: runoob
After reversing, the string is: boonur
After another reversing, the string is:  runaab
