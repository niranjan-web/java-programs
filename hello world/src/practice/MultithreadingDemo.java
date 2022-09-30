package practice;

public class MultithreadingDemo {
	public static void main(String[] args) throws InterruptedException {
		Tables tables = new Tables();
		Print print = new Print();
		
		Runnable  message = 

			()-> System.out.println("this is from runnable interface");
				
			
			
		
		Thread t1 = new Thread(message);
		t1.start();
		print.start();
		tables.start();
//		print.join();
//		tables.join();
//		t1.join();
	
		System.out.println("hello");
		
	}
}

class Tables extends Thread
{
	public void run()
	{
		for (int i = 0; i <=10; i++) {
			System.out.println(2*i);;
			
		}
	}
}
class Print extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}


