import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDemo {
	 public static void main(String[] args) throws Exception {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("enter what ever you want");
//		String name = reader.readLine();
//		int num = Integer.parseInt(name);
//		System.out.println(num);
		
		//filereader in java
		 
		
		 String name[] = {"niranjan","naresh","pradeep","thomson"}; 
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		writer.write("hello every one my name is madan gowri");
		for(String names:name)
		{
			writer.write("\n"+ names);
		}
		
		
		writer.close();
		
		//filereader in java
		
		BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
		
		String str;
		while((str = reader.readLine()) !=null)
		{
			System.out.println(str);
		}
		//System.out.println(reader.readLine());
		reader.close();
	}
	 
}
