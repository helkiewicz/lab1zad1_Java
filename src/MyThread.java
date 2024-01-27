public class MyThread extends Thread
{
    public void run()
    {
        System.out.println(this.getName());
    }
    public static void main(String args[])
    {
        new MyThread().start();
        new MyThread().start();
    }
}
