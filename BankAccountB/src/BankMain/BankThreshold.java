package BankMain;

import java.util.Scanner;

public class BankThreshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner in = new Scanner (System.in);
		
		double startBal;
		 System.out.println("Enter opening balance: "); 
		  startBal = in.nextDouble();
		  
		  double intPct;
		  System.out.println("Enter interest rate: ");
		  intPct = in.nextDouble();
		  
		  BankAccount calcInt = new BankAccount(startBal, intPct);
		  System.out.println( "Account created with a balance of " + startBal + " and interest rate: " + intPct);
		  
	calcInt.threshold();
	

		System.out.println("Enter a threshold: ");
		String userInput = in.next();
		  if (userInput.equals("end"))
		  {
			System.out.print("program ended, Thank you"); 
		  }    
		  
		  else 
		  {
			  calcInt.threshold();
 
		  }
		  
			
}
}	


