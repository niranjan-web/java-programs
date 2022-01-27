package recursion;

import java.util.Scanner;

public class RecursioDemo {

    public static void main(String[] args) {
        /*
         * Scanner scan = new Scanner(System.in);
         * System.out.println("enter the number"); long num = scan.nextInt();
         * System.out.println(method(num));
         */
       method1(1);

    }
    public static long method(long num)
    {
        if(num==0)
        return 1;
        else
        return num * method(num-1);
    }
    
    public static void method1(int num)
    {
        System.out.println(num);
        num++;
        if(num<=5)
        method1(num);
        
            
    }

}
