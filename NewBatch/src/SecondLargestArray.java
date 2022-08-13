//Java Program to find the second largest and second smallest elements in the array without using Functions
import java.util.Scanner;
public class SecondLargestArray {

	public static void main(String[] args) {
		         Scanner input=new Scanner(System.in);
		         int arrSize =input.nextInt();    //Declare and initialize the array size
		         System.out.println("Enter the size of the array");
		          
		         
		         int arr[]=new int[arrSize];    
		        System.out.println("Enter the array");  
		        for(int i=0;i<arrSize;i++)     
		        {
		            arr[i]=input.nextInt();
		        }
		               
		        for(int i=0;i<arrSize;i++)   
		        {
		            for(int j=i+1;j<arrSize;j++)     
		            {
		                if(arr[i]<arr[j])     
		                {
		                    int temp=arr[i];
		                    arr[i]=arr[j];
		                    arr[j]=temp;
		                }
		            }
		        }
		        
		        System.out.println("Second Largest element is "+arr[1]);  
		        System.out.println("Second Smallest element is "+arr[arrSize-2]);  
		    }
		}
	


