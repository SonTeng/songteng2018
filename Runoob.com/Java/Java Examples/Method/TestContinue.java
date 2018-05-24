/**Java 中continue语句用来接收当前循环，并进入下一次循环，
 * 即仅仅这一次循环结束了，不是所有循环结束了，后面的循环依旧。
 */

public class TestContinue {
    public static void main(String[] args){
        StringBuffer searchtr = new StringBuffer("hello how are you?");
        int length=searchtr.length();
        int count =0;
        for(int i=0;i<length;i++){
            if(searchtr.charAt(i) != 'h')
               continue;
            count++;
              // searchtr.setCharAt(i,'h');
        }
        System.out.println("发现 "+count +"个 h字符。");
        System.out.println(searchtr);
    }
}
-------------
Output:
发现 2个 h字符。
hello how are you?
