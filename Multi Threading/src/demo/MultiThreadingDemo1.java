 package demo;

public class MultiThreadingDemo1 {

    public static void main(String[] args) throws InterruptedException {
        Table table = new Table(); 
        Thread t1  = new Thread() {
        public void run()
        {
            try {table.printTable(9); } catch (InterruptedException e) {}
        }
    };
    Thread t2 = new Thread() {
    public void run()
    {
        try {table.printTable(8); } catch (InterruptedException e) {}
    }
};
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        
        System.out.println("hello world");

    }

}
class Table
{
    synchronized public void printTable(int num) throws InterruptedException
    {
            for (int i = 1; i<=10; i++)
                System.out.println(num*i);
            Thread.sleep(1000);
    }
}