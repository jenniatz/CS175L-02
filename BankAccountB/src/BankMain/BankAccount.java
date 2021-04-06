package BankMain;
import java.util.Scanner;

public class BankAccount {

	private static double interestPct;
	private static double balance;
	
	public BankAccount (double startBal, double intPct)
	{
		
		 balance = startBal;
		interestPct = intPct;
	
		
		
	}
	
	public void deposit (double depositAmount)
	{
		balance = balance + depositAmount;
		
		
		
	}
	
	
	public void withdraw (double withdrawAmount)
	{
		
		if ((balance - withdrawAmount) > 0) {
			
			balance = balance - withdrawAmount;
			System.out.println(" Withdrew: " + withdrawAmount);
		}
		
		else {
			System.out.println( " Insufficient Funds to support withdrawal");
		}
				
		
	}
	
	public static void calcInterest ()
	{
	
		double interest = 0.00;
		interest = (balance * interestPct);
		balance = interest + balance;
		if ("yes" != null) {
			
			System.out.println( "Amount increased for the month: " + interest);
			
		}	
		
	}
	
public static double getBalance()
{
	
	return balance;
}
	
public void threshold()
{
	Scanner in = new Scanner (System.in);
	System.out.println("Enter a threshold: ");
	while (in.hasNextDouble())
  	{int months = 0;
  			double numb = in.nextDouble();
  		System.out.println("Threshold entered: " + numb);
  		while (BankAccount.getBalance() < numb)
  		{
  			BankAccount.calcInterest();
  				months++;	
  		}
  	
  	System.out.println("The number of months until you reach your threshold: " + months);	
	
  	}
	

  
}
  
 
public void userInput()
{
	Scanner in = new Scanner (System.in);
	System.out.println("Enter a threshold: ");
	String userInput = in.next();
	  if (userInput.equals("end"))
	  {
		System.out.print("program ended, Thank you"); 
		    
	  }
	  else
	  {
		  System.out.println("Enter a threshold: ");
		  while (in.hasNextDouble())
		  	{int months = 0;
		  			double numb = in.nextDouble();
		  		System.out.println("Threshold entered: " + numb);
		  		while (BankAccount.getBalance() < numb)
		  		{
		  			BankAccount.calcInterest();
		  				months++;	
		  		}
		  	
		  	System.out.println("The number of months until you reach your threshold: " + months);	
			
		  	}
		  
	  }
	  
	
		
		  	
		  				  		
  	}
	
	





		
}






