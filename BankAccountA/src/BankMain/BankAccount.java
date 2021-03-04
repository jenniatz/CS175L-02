package BankMain;
import java.util.Scanner;

public class BankAccount {
	/**
	   A bank account has a balance and a mechanism for
	   applying interest or fees at the end of the month.
	*/
	
	
	   private double balance;
	   private double interestPct;
	   private double depositAmount;
	   private double withdrawAmount;
	   private double newBal;
	   public String yOn;

	   /**
	      Constructs a bank account with zero balance.
	   */
	   public BankAccount()
	   {
	      balance = 0;
	      interestPct = 0;
	      depositAmount = 0;
	      withdrawAmount = 0;
	      newBal = 0;
	      
	      
	   }
	   
	   
	   public void startbalance() {
		   Scanner in = new Scanner (System.in);
		 System.out.println("Please enter amount to start the account: ");
		 this.balance = in.nextDouble();
	   }
	   
	   /**
	      Makes a deposit into this account.
	      @param amount the amount of the deposit
	   */
	   
	  public void interestrate () {
		 
		  Scanner in = new Scanner (System.in);
		  System.out.println("please enter interest rate for this account: ");
		  interestPct = in.nextDouble();
		    
		  
	  }
	  
	    
	   	   
	 public void deposit()
	   {
		   Scanner in = new Scanner (System.in);
		   
		   System.out.println("Please enter deposit amount in the account: ");
		   depositAmount =in.nextDouble();
		   
		   balance = balance + depositAmount;
	   }
	 
	
	   /**
	      Makes a withdrawal from this account, or charges a penalty if
	      sufficient funds are not available.
	      @param amount the amount of the withdrawal
	   */
	   public void withdraw()
	   {
		   Scanner in = new Scanner (System.in);
		   
		   System.out.println("Please enter amount to withdraw from the account: ");
		   withdrawAmount = in.nextDouble(); 
		   newBal = balance - withdrawAmount;
		   
	     
	      
	    if (withdrawAmount > 2000.00) {
			
			System.out.println("Insufficient funds to support withdrawal");
	    	
	}
		
	   }
	   
	   
	     
	   /**
	      Gets the current balance of this bank account.
	      @return the current balance
	   */
	   public void askcalcInterest ()
	   {
		   Scanner in = new Scanner (System.in);
		   System.out.println("if you want me to generate interest, enter 'yes': ");
		  yOn = in.nextLine();
		  
	   }
	 
	   
	   
	   
	   public void finalbalance()
	   {
		  
		   newBal = newBal * 1.05 ;
		   
		      
	   }
	   
	   
	   
	   public double getIntialBalAndInt()
	   {
		   System.out.println("created new account with " + this.balance);
		   System.out.print("and interest rate ");
		   return interestPct;  
		   
	   }
	  
	   
	  
	   
	   public double getinitalDeposit()
		 {
			 System.out.println("Deposited: ");
			 return depositAmount; 
			 
		 }
   
	   
	   
	   public double getWithdrawAmount()
	    {
	    	System.out.println("withdrew: ");
	    	return withdrawAmount;
	    	
	    }
		 
	   
	   
	   
	   public double getInterestRate()
	   {
		   interestPct = interestPct * 500;
		   System.out.println("interest: ");
		   return interestPct;
		    
	   }
	   
	   
	   public double getBalance()
	   {
	  
		 System.out.println("The account balance is: ");  
		   return newBal;
	   }
	   
	   
	   
	  
	   
	    
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
