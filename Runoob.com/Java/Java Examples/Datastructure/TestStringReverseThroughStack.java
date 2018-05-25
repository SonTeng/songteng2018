package Examples.Datastructure;

import java.io.IOException;

public class TestStringReverseThroughStack {
    private String input;
    private String output;
    public TestStringReverseThroughStack(String in){
        input=in;
    }
    public String deRev(){
        int stackSize=input.length();
        Stack theStack=new Stack(stackSize);
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            theStack.push(ch);
        }
        output ="";
        while(!theStack.isEmpty()){
            char ch=theStack.pop();
            output=output+ch;
        }
        return output;
    }

    class Stack {
        private int maxSize;
        private char[] stackArray;
        private int top;
        public Stack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }
        public void push(char j) {
            stackArray[++top] = j;
        }
        public char pop() {
            return stackArray[top--];
        }
        public char peek() {
            return stackArray[top];
        }
        public boolean isEmpty() {
            return (top == -1);
        }
    }

    public static void main(String[] args) throws IOException{
        String input="www.123456788.com";
        String output;
        TestStringReverseThroughStack theRev=new TestStringReverseThroughStack(input);
        output=theRev.deRev();
        System.out.println("反转前："+input);
        System.out.println("反转后："+output);

    }

}
