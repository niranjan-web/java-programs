package JavaApp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringC {

    public static void main(String[] args) {
//        String name  = new String("niranjan");
//        String name2 ="";
//        for(int i = name.length()-1; i >=0; i--) {
//            name2+= name.charAt(i);
//            
//        }
//        System.out.println(name2);
//        System.out.println(name);
//        String arr[] = {"pulp fiction","good fellas"," inception"};
//        
//        stringJoin( arr);
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader scan =  new BufferedReader(input);
        try {
            System.out.println("enter the name");
        String name = scan.readLine();
        
       int num = Integer.parseInt(name);
       System.out.println(num);
        System.out.println(name);
        
        
        
        }catch(Exception ex) {
            System.out.println("there is an error "+ex);
        }
    }

   // private static void stringJoin(String[] arr) {
       
        
    //}

}
