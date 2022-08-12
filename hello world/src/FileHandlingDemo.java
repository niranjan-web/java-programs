import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {
	public static void main(String[] args) throws IOException {
		FileWriter obj = new FileWriter("C:\\Users\\Niranjan\\Documents");
		obj.write("THIS ARE THE THINGS I CAN MODIFIED");
		
		
	}

}
