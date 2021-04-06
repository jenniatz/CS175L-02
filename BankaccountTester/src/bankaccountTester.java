import java.util.Scanner;
public class bankaccountTester {

	private double withdraw;
	private double deposit; 
	private double balance; 
	private double newBal; 
	private double interestRate;
	public String yesOrno = "yes or no";
	
	

	
	
	public bankaccountTester () {
		withdraw = 0;
		deposit = 0;
		balance = 0;
		interestRate=0;
		newBal = 0;
		
		
	}
		
			
	public void startBal () {
		
			Scanner in = new Scanner (System.in);
			
			System.out.println("Enter amount to start the account: ");
			balance = in.nextDouble();
			
			
		}

	public void InterestRate() {
	
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the interest rate for this account: ");
		interestRate = in.nextDouble();
		
		if (interestRate > 0) {
			
			
			System.out.println("Created new account with " + balance + " and interest rate " + interestRate);
					
		}
		
	}
		
		public void deposit () {
		Scanner in = new Scanner (System.in); 
		
		System.out.println ("Please enter amount to deposit in the account: "); 
		deposit = in.nextDouble();
		
		if (deposit > 0) {
		
			System.out.print("Deposited: " + deposit);
			
		}
		
		
		balance = balance + deposit;
		
		
		//System.out.println(name);
		//System.out.println ("This is your remaining balance: "+ deposit);
		
		
	}
	   
	
	
	
	public void withdraw () {
		Scanner in = new Scanner (System.in); 
		System.out.println (" Please enter amount to withdraw from the account: ");
		withdraw = in.nextDouble();
		balance = balance - withdraw; 
			if (withdraw > 2000) {
			
			System.out.print("insufficient Funds to support Withdrawal");
			
		}
		
		else {
			
			System.out.println("withdrew: " + withdraw);
			
			
		}
	}
	
	
	
	public void calcInt () {
		Scanner in = new Scanner (System.in);
		System.out.println("If your want me to generate interest, enter 'yes':  ");
		yesOrno = in.nextLine();
		if ( yesOrno == "yes") {
		
		interestRate = interestRate * 5;
		System.out.print("interest: " + interestRate);
		
		}

		else {
			
		System.out.print("no interest generated");	
			
		}
		
		
	}
	
	
	
	public double getBalance() { 
	      
		newBal = interestRate * balance;
		System.out.println("This is your new balance: " + newBal);
		return newBal;

	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bankaccountTester mybank = new bankaccountTester();
		
		
		mybank.startBal();
		mybank.InterestRate();
		mybank.deposit();
		mybank.withdraw();
		mybank.calcInt();
		mybank.getBalance();
		
		
		
		
		
		
		
		
		
		
		
	}

}
