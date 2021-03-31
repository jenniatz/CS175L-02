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
		//System.out.println( " Deposited: " + depositAmount);	
		
		
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
	
		
	
	





	
	
	
		
}






