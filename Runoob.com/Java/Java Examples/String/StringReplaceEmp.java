/** 使用java String类的replace方法来替换字符串中的字符 */


public class StringReplaceEmp {
    public static void main(String[] args){
        String str = "Hello World  Hello World";
        System.out.println(str.replace('H','W'));
        System.out.println(str.replaceFirst("He","Wa"));
        System.out.println(str.replaceAll("He","Ha"));
    }
}  

-----------------
Output:  
Wello World  Wello World  
Wallo World  Hello World  
Hallo World  Hallo World

