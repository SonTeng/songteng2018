/**  使用 System 类的 System.err.println() 来展示异常的处理方法 */
package Examples.Exception;

public class TestExceptionDemo {
    public static void main(String[] args){
        try{
            throw new Exception(" My Exception");
        }catch (Exception e){
            System.out.println("Caught Exception");
            System.out.println("getMessage():"+e.getMessage());
            System.out.println("getLocalizedMessage():"+e.getLocalizedMessage());

            System.out.println("toString()"+e);
            System.out.println("printStackTrace():");
            e.printStackTrace();

        }
    }
}
