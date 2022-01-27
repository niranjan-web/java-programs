package multithreading;

public class MultithreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Resources obj =  new Resources();
        Thread t1 = new Thread() {
            @Override
            public void run()
            {
                obj.method(5);
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run()
            {
                obj.method(6);
            }
        };
        Runnable run = ()->  obj.method(11);
        Runnable run1 =()-> obj.method(4);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run1);
        t1.start();
        System.out.println(t1.getPriority());
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        
        System.out.println("hello world");

    }

}
class Resources
{
   synchronized public void method(int num)
    {
        for(int i=1; i<=10; i++)
        {
           
            System.out.println(Thread.currentThread().getName()+" "+num*i);
        }
    }
    
}