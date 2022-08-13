import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
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
