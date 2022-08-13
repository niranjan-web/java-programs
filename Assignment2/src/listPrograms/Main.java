//Develop a java class with a method saveEvenNumbers(int N) 
//using ArrayList to store even numbers from 2 to N, where N is a 
//integer which is passed as a parameter to the method 
//saveEvenNumbers(). 
//The method should return the ArrayList (A1) created. In the 
//same class create a method printEvenNumbers()which iterates 
//through the arrayList A1 in step 1, and It should multiply 
//each number with 2 and display it in format 4,8,12….2*N. and 
//add these numbers in a new ArrayList (A2). 
//The new ArrayList (A2) created needs to be returned. Create a 
//method printEvenNumber(int N) parameter is a number N. This 
//method should search the arrayList (A1) for the existence of 
//the number ‘N’ passed. If exists it should return the Number 
//else return zero.Hint: Use instance variable for storing the 
//ArrayList A1 and A2.
//NOTE: You can test the methods using a main method.

package listPrograms;
import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        Main obj = new Main();
        Scanner in  = new Scanner(System.in);
        
        System.out.println("enter the number...");
        int num = in.nextInt();
      
        System.out.println("even method return: "+ obj.saveEvenNumber(num));
        System.out.println("print method return: "+ obj.printEvenNumber());
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
    
    static ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> saveEvenNumber(Integer N)
    {
       
        for(int i = 2; i <= N; i++) 
        {
            if(i % 2 == 0) 
            {
                 list1.add(i);
            }
        }
        return list1;
        
    }

    static //this method used to multiply evry element in a1 by 2
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    ArrayList<Integer> printEvenNumber()
    {
       for(Integer num : list1) {
           list2.add(num*2);
       }
       return list2;
    }
   
}






