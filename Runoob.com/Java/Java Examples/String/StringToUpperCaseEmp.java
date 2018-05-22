/**使用String toUpperCase()方法将字符串从小写转为大写 */

public class StringToUpperCaseEmp {
    public static void main(String[] args){
        String str = "string runoob";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符串："+ str);
        System.out.println("转为大写后："+ strUpper);

        // more test
        String strLowerAndAppend = new StringBuffer(str).append(" HELLO WORLD").toString().toLowerCase();
        System.out.println("After test : " + strLowerAndAppend);
    }
}
------
Output:  
原始字符串：string runoob  
转为大写后：STRING RUNOOB  
After test : string runoob hello world
