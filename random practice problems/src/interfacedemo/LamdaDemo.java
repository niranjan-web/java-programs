package interfacedemo;

import java.util.Scanner;

public class LamdaDemo {
    
    @FunctionalInterface 
    interface Demo 
    {
       abstract void fun();
    }

public static void main(String[] args) {

        Demo myObj = ()->
        {
          Scanner in = new Scanner (System.in);
          System.out.println("enter the number");
            int num1 = in.nextInt();
        if(num1 %2 ==0) 
        {
            System.out.println("even number ");
        }else 
            System.out.println("odd number");
        in.close();
        };
        
        myObj.fun();
        

        
    }

}
