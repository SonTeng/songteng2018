/**  通过创建用于插入元素的自定义函数 push() 方法和用于弹出元素的 pop() 方法来实现栈 */
package Examples.Datastructure;

public class TestStack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    public TestStack(int s){
        maxSize=s;
        stackArray=new long[maxSize];
        top=-1;
    }
    public void push(long j){
        stackArray[++top]=j;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return(top==-1);
    }
    public boolean isFull(){
        return (top==maxSize-1);
    }
    public static void main(String[] args){
        TestStack tStack=new TestStack(10);
        tStack.push(10);
        tStack.push(20);
        tStack.push(30);
        tStack.push(40);
        tStack.push(50);
        tStack.push(60);
        while(!tStack.isEmpty()){
            long value =tStack.pop();
            System.out.print(value+" ");
        }




    }
}
