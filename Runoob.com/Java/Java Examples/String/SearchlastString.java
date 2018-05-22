/** 字符串函数strOrig.lastIndexOf(Stringname)来查找字符串Stringname 在 strOrig中出现的位置 */



public class SearchlastString {
    public static void main(String[] args){
        String strOrig = "Hello world,Hello Runoob";
        int lastIndex = strOrig.lastIndexOf("Runoob");
        if(lastIndex == -1){
            System.out.println("没找到字符串Runoob");
        }else{
            System.out.println("Runoob字符串最后出现的位置索引为："+lastIndex);
        }

    }
}
---------
Output:
Runoob字符串最后出现的位置索引为：18
