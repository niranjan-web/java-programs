import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncrementExample {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader reader =new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(reader);
		
		System.out.println("enter your fucking number");
		String numb = buffer.readLine();
		int number = Integer.parseInt(numb);
		
		System.out.println(number);
		if(number>0)
		{
			System.out.println("your number is greater than zero");
		}
		else
			System.out.println("your number is not greater than zero");
		
		String result = number>0?"your number is greater than zero":"your number is not greater than zero";
		System.out.println(result);
		
		
		
		int num = 10;
		int num1 = ++num;
		
		System.out.println(num1);
		String name = "niranjan";
		name = "hello Niranjan";
		String name1 = "niranjan";
		String name2 = new String("niranjan");
		
		System.out.println(name==name1);
		System.out.println(name.equals(name2));
		System.out.println(name==name2);
		
		StringBuffer buffer1 = new StringBuffer("hello niranjan");
		buffer1.append(" jello");
		System.out.println(buffer);
		
		StringTokenizer token = new StringTokenizer(name," ");
		while(token.hasMoreElements())
		{
			System.out.println(token.nextElement());
		}

	}

}
