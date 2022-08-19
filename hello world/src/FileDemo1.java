import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo1 {
	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
//		String arr[]  =   new String[10];
//		for(int i =0;i<arr.length;i++)
//		{
//			System.out.println("enter the value");
//			arr[i] = reader.readLine();
//		}
//		FileWriter write = new FileWriter("temp.txt");
//		for (int i=0; i<arr.length;i++)
//		{
//			write.write(" \n" +arr[i]);
//		}
//		write.close();
		BufferedReader read = new BufferedReader(new FileReader("temp.txt"));
		String str;
		while((str=read.readLine()) != null)
		{
			System.out.println(str);
		}
	
	}
}
