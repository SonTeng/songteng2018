/**java中标签是为循环设计的，是为了在多重循环中发辫的使用break和continue，跳到指定的标签处。 */

public class TestLabel {
    public static void main(String[] args){
        String strSearch = "This is the string in which you have to search for a substring.";
        String substring = "substring";
        boolean found=false;
        int max =strSearch.length()-substring.length();
        testlbl: //Lebel
        for(int i=0;i<=max;i++){
            int length = substring.length();
            int j=i;
            int k=0;
            while(length-- !=0){
                if(strSearch.charAt(j++) !=substring.charAt(k++)){
                    continue testlbl;
                }
            }
            found = true;
            break testlbl;
        }
        if(found){
            System.out.println("发现子字符串。");
        }else{
            System.out.println("字符串中没有发现子字符串。");
        }
    }
}
-------------
Output:
发现子字符串。


