import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(input);
		System.out.println("enter your fucking name");
		String name = buffer.readLine();
		
		System.out.println(name);
		BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
		String arr[] = {"ragu","rahul","anothony","aravind","akon"};
		
		writer.write("hello my name is niranjan and now i'm unemployement ");
		for(int i=0; i<arr.length;i++)
		{
			writer.write("\n" +arr[i]);
		}
		writer.close();
		
		BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
		String str;
		while((str = reader.readLine()) != null)
		{
			System.out.println(str);
		}
		reader.close();
	}

}
