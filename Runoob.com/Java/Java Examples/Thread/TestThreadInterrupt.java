package Examples.Thread;

public class TestThreadInterrupt extends Thread {
    public void run()
    {
        try
        {
            sleep(50000);  // 延迟50秒
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws Exception
    {
        Thread thread = new TestThreadInterrupt();
        thread.start();
        System.out.println("在50秒之内按任意键中断线程!");
        System.in.read();
        thread.interrupt();
        thread.join();
        System.out.println("线程已经退出!");
    }
}
