package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
		reader.readLine();
		String str;
		while((str =reader.readLine())!=null)
		{
			System.out.println(str);
		}
	}

}
