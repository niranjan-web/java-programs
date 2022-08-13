//same program using vector
package listPrograms;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo 
{

    public static void main(String[] args) 
    {
        VectorDemo obj = new VectorDemo();
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter the number");
        int num = in.nextInt();
        
        
        System.out.println(obj.saveEvenNumber(num));
        System.out.println(obj.printEvenNumber());
        
        System.out.println("enter the number to search...");
        
        int num1 = in.nextInt();
        if(list1.contains(num1)) 
        {
            System.out.println(num1+" is avialable in the list ");
        }else if(list2.contains(num1))
            System.out.println(num1+" is avialable in the list ");
        else 
        {
            System.out.println(num1+" is not available in the list");
        }
        in.close();
    }   
    
    static Vector<Integer> list1 = new  Vector<Integer>();
    Vector<Integer> saveEvenNumber(int N)
    {
        for(int i = 2; i< N; i++) 
        {
            if(i%2 == 0) 
            {
                list1.add(i);
            }
            
        }
        return list1;
    }
    
    static Vector<Integer> list2 = new Vector<Integer>();
    Vector<Integer> printEvenNumber()
    {
      for(Integer num: list1) 
      {
          
          list2.add(num*2);
      }
        return list2;
    }
        
}
    

