/** 使用split(string)方法通过指定分隔符分割字符串 */

public class JavaStringSplitEmp {
    public static void main(String[] args){
        String str = "www-runoob-com";
        String[] temp;
        String delimeter = "-";
        temp = str.split(delimeter);

        for(int i = 0;i<temp.length;i++){
            System.out.println(temp[i]);
            System.out.println("");
        }

        System.out.println("------java for each循环输出的方法------");
        String str1 = "www.runoob.com";
        String[] temp1;
        String delimeter1 = "\\.";
        temp1=str1.split(delimeter1);
        for(String s :temp1){
            System.out.println(s);
            System.out.println("");
        }
    }
}
-------
Output:
www

runoob

com

------java for each循环输出的方法------
www

runoob

com
