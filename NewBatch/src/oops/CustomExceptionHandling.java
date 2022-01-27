package oops;

import java.util.Scanner;

public class CustomExceptionHandling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int bal =5000;
		System.out.println("enter the amount to withdraw");
		System.out.println("the balance amount is "+ bal);
		int withDraw = input.nextInt();
		
		try 
		{
		if(bal<withDraw) 
		{
			insufficientFundException obj = new insufficientFundException(withDraw);//my custom exception
			throw obj;// or throw new insufficientFundException(withDraw);
			
		}else {
			System.out.println("here "+withDraw+" rupees and your account balance is "+ (bal-withDraw));
		}
		}
		catch(insufficientFundException e)// or u can use Exception which is the parent class
		{
			System.out.println("insufficient found!");
		}
	}

}
