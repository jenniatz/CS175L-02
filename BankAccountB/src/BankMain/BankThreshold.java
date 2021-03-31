package BankMain;

import java.util.Scanner;

public class BankThreshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner in = new Scanner (System.in);
		
		double startBal;
		 System.out.println("Please enter amount to start the account: "); 
		  startBal = in.nextDouble();
		  
		  double intPct;
		  System.out.println("Please enter an interest rate: ");
		  intPct = in.nextDouble();
		  
		  BankAccount calcInt = new BankAccount(startBal, intPct);
		  System.out.println( "Account created with a balance of " + startBal + " and interest rate: " + intPct);
		  
 	
	
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

	


