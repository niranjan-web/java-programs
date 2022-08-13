import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NiranjanDemo {

    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter the sentences...");
//        
//        String name = input.nextLine();
//        
//        int num = input.nextInt();
//        short num1 = input.nextShort();
//        byte num2 = input.nextByte();
//        char ch = input.next().charAt(0);
//        double num3 = input.nextDouble();
//        long num4 = input.nextLong();
//        
//        System.out.println(name);
//        System.out.println(num);
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        System.out.println(ch);
//        System.out.println(num4);
//        
//        
        //inputstreamreader
        
        InputStreamReader scan = new InputStreamReader(System.in);
        BufferedReader input  = new BufferedReader(scan);
        System.out.println("enter the num");
        String str = input.readLine();
        int num = Integer.parseInt(str);
        try {
            do
            {
            System.out.println("enter the number:");
            String name  = input.readLine();
        
            int num2 =  Integer.parseInt(name);
            
            System.out.println("enter the second number:");
            String name2 = input.readLine();
            int num1 = Integer.parseInt(name2);
            
            int sum = num2 + num1;
            System.out.println("the sum is " +sum);
            
            //throw new Exception();
            }
            while(num ==0);
        
    }catch(Exception ex) {
        System.err.println("there is an error "+ ex);
    }
        

}
}






