//same program using linkedlist
package listPrograms;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemoAssignment 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter the number");
        
       LinkedList<Integer> result2 = saveEvenNumber(20);
       LinkedList<Integer> result1 = printEvenNumber();
       System.out.println("even method return: "+result2);
       System.out.println("print method return: "+result1);
       System.out.println("enter the number to search...");
       
       int num1 = in.nextInt();
       if(list1.contains(num1)) 
       {
           System.out.println(num1+" is avialable in the list ");
       }else if(list1.contains(num1))
           System.out.println(num1+" is avialable in the list ");
       else 
       {
           System.out.println(num1+" is not available in the list");
       }
       in.close();
       

    }
    
    static LinkedList<Integer> list = new LinkedList<Integer>();//here return type is a linkedlist
    static LinkedList<Integer> saveEvenNumber(int N)
    {

        for(int i = 2; i<N; i++) 
        {
            if(i%2==0) 
            {
                list.add(i);
            }
        }
       return list; 
    }
    
    static LinkedList<Integer> list1 = new LinkedList<Integer>();//here i use static keyword for not creating obj of this class
    static LinkedList<Integer> printEvenNumber()
    {

        for(Integer num : list) 
        {
            list1.add(num*2);
        }
        return list1;
        
    }

}
