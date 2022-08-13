
public class MultiThreadingDemo {

    public static void main(String[] args) {
        Demo obj = new Demo();    //newborn state
        Demo1 obj1 = new Demo1();
        Demo2 obj2 = new Demo2();
        
        Thread t1 = new Thread(obj);
        t1.start();//runnable state
        obj1.start();
        obj2.start();
        

    }

}

class Demo implements Runnable{
    synchronized
     public void run()                   //running state
    {
        System.out.println("1 started");
        
        for(int i =0; i<1; i++ )
        {
            System.out.println("1 running");

          System.out.println(i+" hello world");  
        }
        System.out.println("1 existed");

        System.out.println();
    }
}

class Demo1 extends Thread{
    @Override
    public void run() 
    {
        System.out.println("2 started");

        try {
            Demo1.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i =0; i<1; i++ )
        {
            System.out.println("2 running");

          System.out.println(i+" hi from Demo1");  
        }
        System.out.println("2 exited");

        System.out.println();
    }
}

class Demo2 extends Thread{
    
    public void run() 
    {
        System.out.println("3 started");

        for(int i =0; i<1; i++ )
        {
            System.out.println("3 running");

          System.out.println(i+" hello from Demo2");  
        }
        System.out.println("3 exited");
        System.out.println();
    }
}