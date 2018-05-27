package Examples.Thread;

public class TestGetThreadName extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            printMsg();
        }
    }
    public void printMsg(){
        Thread t=Thread.currentThread();
        String name=t.getName();
        System.out.println("name=" +name);
    }
    public static void main(String[] args) {
        TestGetThreadName tt = new TestGetThreadName();
        tt.start();
        for (int i = 0; i < 10; i++) {
            tt.printMsg();
        }
    }
}
