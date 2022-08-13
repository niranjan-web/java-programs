package JavaApp;

import java.util.Scanner;

public class InterestCalculator 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	    final Scanner input = new Scanner(System.in); 
		
		for(int i =0; i<10; i++) 
		{
			 
			System.out.println("select the options:\n");
			System.out.println("1. Interest calculator -SB");
			System.out.println("2. Interest calculator -FD");
			System.out.println("3. Interest calculator -RD");
			System.out.println("4. Exit");
			
			int num = input.nextInt();
			
			Account obj = new SbAccount();
			Account obj1 = new FdAccount();
			Account obj2 = new RdAccount();
			
			switch(num) 
			{
				case 1:{
					obj.calculateInterest();
					continue;
				}
				case 2: { 
					obj1.calculateInterest();
					continue;
				}
				case 3:{
					obj2.calculateInterest();
					continue;    //jump to forloop
				}
				case 4:{
			        System.out.println("thanks for using.");  //exit message
					break;
				}
				default:
				    System.out.println("please enter the above mentioned option!");
			}break;    //to exit the for loop
		}
		//System.out.println("thanks for using.");  //exit message
		input.close();
	}
}

//my abstract /parent class
abstract class Account{
//	 double interestRate = 0;
//	 double amount = 0;
	
	 abstract void calculateInterest();// my abstract method
}

//derived class rd account
class RdAccount extends Account{
            
	Scanner input = new Scanner(System.in);
	//double interestRate;
        	
	public void calculateInterest() 
	{
		System.out.println("Enter the RD amount:");
		double amount = input.nextDouble();
		
		System.out.println("enter the number of days:");
		int noOfDays = input.nextInt();
		
		System.out.println("enter your age:");
		int age = input.nextInt();
		
		try 
        {
            if(amount <=0 || age <=0 || noOfDays <=0)
                
            {
               // ExceptionFound ex = new ExceptionFound();// custom exception that i created
                //throw ex;
                throw  new ExceptionFound();
            }
        }
        catch(ExceptionFound ex) 
        {
            System.err.println("invalid input!, check the input and try again... "+ ex+"\n");
        }
		
		

    //checking conditions for senior citizens
    if(noOfDays>0) 
    {
        if(age>=65 ) 
        {
    		if(noOfDays <= 180) {
    			System.out.println("interest gained is Rs:"+amount/100*8);
    		}
    		else if(noOfDays <= 270) 
    		{
			System.out.println("interest gained is Rs:"+amount/100*8.25);
    		}
    		else if(noOfDays <= 360)
    		{
			System.out.println("interest gained is Rs:"+amount/100*8.50);
    		}
    		else if(noOfDays <= 450) 
    		{
			System.out.println("interest gained is Rs:"+amount/100*8.75);
    		}
    		else if(noOfDays <= 540) 
    		{
			System.out.println("interest gained is Rs:"+amount/100*9);
    		}
    		else if(noOfDays <= 630) 
    		{
			System.out.println("interest gained is Rs:"+amount/100*9.25);
    		}
	    }
        System.out.println();
	
        //checking conditions for general
        if(age<65) 
		{
		     if(noOfDays <= 180  ) 
		         {
				System.out.println("interest gained is Rs:"+amount/100*7.50);
		         }
		         else if(noOfDays <= 270) 
		         {
				System.out.println("interest gained is Rs:"+amount/100*7.75);
		         }
		         else if(noOfDays <= 360) 
		         {
				System.out.println("interest gained is Rs:"+amount/100*8);
		         }
		         else if(noOfDays <= 450) 
		         {
				System.out.println("interest gained is Rs:"+amount/100*8.25);
		         }
		         else if(noOfDays <= 540) 
		         {
				System.out.println("interest gained is Rs:"+amount/100*8.50);
		         }
		         else if(noOfDays <= 630) 
		         {
				System.out.println("interest gained is Rs:"+ amount/100*8.75);
				 }
	    }System.out.println();
	}
	}
}
//derived class sb account
class SbAccount extends Account
{
	Scanner input = new Scanner(System.in);
	
	public void calculateInterest() 
	{
	    System.out.println("enter the type of the account 'Normal' or 'NRI'.");
	    String accountType = input.nextLine();
	    String str = accountType.toLowerCase();
	    System.out.println("Enter the average amount in your account:");
        double amount = input.nextDouble();
        try {
            if(amount<=0 && str.equals("normal"))  {
                if(str.equals("nri")) {
                    ExceptionFound ex = new ExceptionFound();
                    throw ex;
                }
            }
        }
        catch(ExceptionFound ex){
            System.err.println("please enter valid input "+ex+" \n");
        }
	    
	    if(str.equals("nri")) 
        {
            System.out.println("--------------NRI account type---------------");
            double result1 = amount/100*6;
            System.out.println("interest gained is Rs:"+result1);
            System.out.println();
        }
        else if(str.equals("normal"))
        {
            System.out.println("--------------Normal account type---------------");
            double result = amount/100*4;
            System.out.println("interest gained is Rs:"+ result);
            System.out.println();
        }else {
            System.err.println("check the spelling and try again \n");
        }
	}
}
        
//derived class fd account
class FdAccount extends Account
{
	Scanner input = new Scanner(System.in);
	double interestRate;
	
	public void  calculateInterest()
	{
	    System.out.println("enter the FD amount:");
		double amount = input.nextDouble();
		
	    System.out.println("enter the number of days:");
		int noOfDays = input.nextInt();
		
		System.out.println("enter your age:");
		double age = input.nextDouble();
		
		try 
        {
            if(amount <=0 || age <=0 || noOfDays <=0)
                
            {
                ExceptionFound ex = new ExceptionFound();// custom exception that i created
                throw ex;
            }
        }
        catch(ExceptionFound ex) 
        {
            System.err.println("invalid input!, check the input and try again..."+ ex+"\n");
        }
		
		if(amount<10000000 && age<65) //amount lessthan a crore and age less than 65
		{
		    if(noOfDays>=7 && noOfDays<=14) {
		        System.out.println("interest gained is Rs:"+amount/100*4.50);
		    }
		    else if(noOfDays>=15 && noOfDays<=29) 
		    {
                System.out.println("interest gained is Rs:"+amount/100*4.75);
            }
		    else if(noOfDays>=30 && noOfDays<=45)
		    {
                System.out.println("interest gained is Rs:"+amount/100*5.50);
            }
		    else if(noOfDays>=46 && noOfDays<=60) 
		    {
                System.out.println("interest gained is Rs:"+amount/100*7);
            }
		    else if(noOfDays>=61 && noOfDays<=184) 
		    {
                System.out.println("interest gained is Rs:"+amount/100*7.50);
            }
		    else if(noOfDays>=184 && noOfDays<=365) 
		    {
                System.out.println("interest gained is Rs:"+amount/100*8.00);
            }
		}
		    
		else if(amount<10000000 && age>65)
		{
	            if(noOfDays>=7 && noOfDays<=14) 
	            {
	                System.out.println("interest gained is Rs:"+amount/100*5);
	            }
	            else if(noOfDays>=15 && noOfDays<=29) 
	            {
	                System.out.println("interest gained is Rs:"+amount/100*5.25);
	            }
	            else if(noOfDays>=30 && noOfDays<=45) 
	            {
	                System.out.println("interest gained is Rs:"+amount/100*6);
	            }
	            else if(noOfDays>=46 && noOfDays<=60)
	            {
	                System.out.println("interest gained is Rs:"+amount/100*7.50);
	            }
	            else if(noOfDays>=61 && noOfDays<=184)
	            {
	                System.out.println("interest gained is Rs:"+amount/100*8);
	            }
	            else if(noOfDays>=184 && noOfDays<=365) 
	            {
	                System.out.println("interest gained is Rs:"+amount/100*8.50);
	            }
		}
		if(amount>10000000)//amount is greater than a crore
		{
            if(noOfDays>=7 && noOfDays<=14) 
            {
                System.out.println("interest gained is Rs:"+amount/100*6.50);
            }
            else if(noOfDays>=15 && noOfDays<=29) 
            {
                System.out.println("interest gained is Rs:"+amount/100*6.75);
            }
            else if(noOfDays>=30 && noOfDays<=45) 
            {
                System.out.println("interest gained is Rs:"+amount/100*6.75);
            }
            else if(noOfDays>=46 && noOfDays<=60) 
            {
                System.out.println("interest gained is Rs:"+amount/100*8);
            }
            else if(noOfDays>=61 && noOfDays<=184) 
            {
                System.out.println("interest gained is Rs:"+amount/100*8.50);
            }
            else if(noOfDays>=184 && noOfDays<=365) 
            {
                System.out.println("interest gained is Rs:"+amount/100*10);
            }
        }
		System.out.println();
}
}






























