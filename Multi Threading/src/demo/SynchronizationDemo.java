package demo;

public class SynchronizationDemo {

    public static void main(String[] args) {
        
        Name name = new Name();
        Demo obj =  new Demo(name);
        Demo1 obj1 = new Demo1(name);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        
        /*
         * Name name = new Name(); Thread t3 = new Thread();
         */
        
        t1.start();
        t2.start();

    }

}
class Demo implements Runnable
{
    Name  name=null;
    
    public  Demo(Name name)
    {
         this.name = name;
    }
    @Override
    public void run()
    {
      
          name.method();
    }
    
}

class Demo1 implements Runnable{
      Name  name=null;
    
    public  Demo1(Name name)
    {
        this.name = name;
    }
         
    @Override
    public void run()
    {
        name.method();
        
    }
    
}
class Name {
    
     synchronized void method()
    {
        for(int i =0; i<=10; i++)
        {
            
            System.out.println(Thread.currentThread().getName()+" independent class "+i);
        }
    }
}
