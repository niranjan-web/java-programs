package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileLoopDemo {
public static void main(String[] args) throws IOException {
    
    //whileMethod(100);
    //doWhileMethod(10);
    int[] arr = new int[10];
    for(int i =0; i<10; i++)
    {
        System.out.println(arr[i]=i+1);
    }
    String name;
    do {
        InputStreamReader input = new InputStreamReader(System.in);
        
        BufferedReader scan = new BufferedReader(input);
        System.out.println("enter the number");
        name = scan.readLine();
    
       //name = Integer.parseInt(num);
       System.out.println(name);
    }   while(name != "exit");
    
    
//    String check = file.exists() ? "success" : "failed";
//    System.out.println(check);
}

private static void doWhileMethod(int num) {
    do {
        System.out.println(num + " hello niranjan");
        num++;
    } while (num<=10);
}

private static void whileMethod(int num) {
    
    while(num>=0)
    {
        System.out.print(num+" ");
         num-=1;
    }
    
}
}
