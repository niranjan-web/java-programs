package datastructure;



public class StackDemo {
	public static void main(String[] args) {
		Stack obj = new Stack();
//		 obj.push(2);
//		 obj.push(3);
//		 obj.push(4);
//		 obj.push(5);
//		 obj.push(6);
//		 obj.push(7);
		System.out.println(obj.pop()); 
	}
}

class Stack{
	
	int arr[] = new int[10];
	int lastElement;
	
	Stack() {
		
		lastElement = -1;
	}
	
	public void push(int num)
	{
		//lastElement = lastElement+1;
		if(lastElement == 9)
		System.out.println("the stack is full");
		else 
			arr[++lastElement] = num;
		System.out.println(arr[lastElement]);
	}
	
	public int pop()
	{
		if(lastElement >0)
		return arr[--lastElement];
		else
			System.out.println("the stack is empty");
			return -1;
	}
}
