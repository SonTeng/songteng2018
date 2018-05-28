package Examples.Thread;

public class TestThreadSetPriority extends Thread {
    private int countDown = 5;
    private volatile double d = 0;
    public TestThreadSetPriority(int priority) {
        setPriority(priority);
        start();
    }
    public String toString() {
        return super.toString() + ": " + countDown;
    }
    public void run() {
        while(true) {
            for(int i = 1; i < 100000; i++)
                d = d + (Math.PI + Math.E) / (double)i;
            System.out.println(this);
            if(--countDown == 0) return;
        }
    }
    public static void main(String[] args) {
        new TestThreadSetPriority(Thread.MAX_PRIORITY);
        for(int i = 0; i < 5; i++)
            new TestThreadSetPriority(Thread.MIN_PRIORITY);
    }
}
