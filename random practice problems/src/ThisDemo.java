import java.util.Arrays;

public class ThisDemo {
	String name;
	int rollNo;
	boolean isStudent;
	
	ThisDemo(String name,int rollNo,boolean isStudent)
	{
		name = this.name;
		rollNo = this.rollNo;
		isStudent = this.isStudent;
		
	}
	
	public  void display() { System.out.println(name+rollNo+isStudent);}
	

	public static void main(String[] args) {
		
		//display();
		ThisDemo obj = new ThisDemo("niranjan",2929,true);
		obj.display();
		
		int a[] = {10,11,12,13};
		int b[] = a;
		
		a[0] = 21;
		System.out.println(Arrays.toString(b));
		
		

	}

}
