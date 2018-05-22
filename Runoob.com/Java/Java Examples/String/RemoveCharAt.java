/** 使用字符串函数substring()函数来删除字符串中的一个字符，并将功能封装在removeChatAt函数中 */
package Examples.String;

public class RemoveCharAt {
    public static void main(String[] args){
        String str = "this is java";
        System.out.println(removeCharAt(str,3));
    }

    public static String removeCharAt(String str,int pos){
        return str.substring(0,pos)+str.substring(pos+1);
    }
}
