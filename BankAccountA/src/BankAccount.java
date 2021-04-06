import java.util.Scanner;

public class BankAccount {
	/**
	   A bank account has a balance and a mechanism for
	   applying interest or fees at the end of the month.
	*/
	
	
	   private double balance;
	   private double interestPct;
	   private double interestRt;
	   private double depositAmount;
	   private double withdrawAmount;

	   /**
	      Constructs a bank account with zero balance.
	   */
	   public BankAccount()
	   {
	      balance = 0;
	      interestPct = 0;
	      depositAmount = 0;
	      withdrawAmount = 0;
	      interestRt = 0;
	      
	   }
	   
	   
	   public void startbalance(double balance) {
		   Scanner in = new Scanner (System.in);
		 System.out.println("Please enter amount to start the account: ");
		 balance = in.nextDouble();
	   }
	   
	   /**
	      Makes a deposit into this account.
	      @param amount the amount of the deposit
	   */
	   
	  public void interestRate (double interestPct) {
		 
		  Scanner in = new Scanner (System.in);
		  System.out.println("please enter interest rate for this account: ");
		  interestPct = in.nextDouble();
		    
	  }
	   
	   
	   	   
	 public void deposit(double depositAmount)
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
	   public void withdraw(double withdrawAmount)
	   {
		   Scanner in = new Scanner (System.in);
		   
		   System.out.println("Please enter amount to withdraw from the account: ");
		   withdrawAmount = in.nextDouble(); 
		   
	     
	      
	    if (withdrawAmount > 2000) {
			
			System.out.println("Insufficient funds to support withdrawal");
	    	
	}
		
		else {
			balance = balance - withdrawAmount;
		}
	   }
	   
	   	   
	     
	   /**
	      Gets the current balance of this bank account.
	      @return the current balance
	   */
	   public void askCalcInterest (double interestRt)
	   {
		   Scanner in = new Scanner (System.in);
		   System.out.println("if you want me to generate interest, enter 'yes': ");
		  
			   interestRt = interestPct * 5;
		   	   
		     
	   }
	   
	   public void finalbalance()
	   {
		   balance = interestRt * balance;
		   
		      
	   }
	   
	   
	   
	   
	   
	   
	   public double getInitialBalance()
	   {
		 System.out.println("Created new account with "); 
				 return balance;
		 
	   }
	  
	  
	  public double getInitialInterestRate()
	  {
			System.out.print("and interest rate: "); 
			return interestPct;
	   	  	   
	   }
	   
	   public double getInterestRate()
	   {
		   System.out.println("interest: ");
		   return interestRt;
		    
	   }
	   
	   
	   public double getInitialDeposit()
		 {
			 System.out.println("Deposited: ");
			 return depositAmount; 
			 
		 }
	   
	   public double getWithdrawAmount()
	    {
	    	System.out.println("withdrew: ");
	    	return withdrawAmount;
	    	
	    }

	   
	   public double getBalance()
	   {
	  
		 System.out.println("The account balance is: ");  
		   return balance;
	   }
	    
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
