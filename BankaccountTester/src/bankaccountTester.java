import java.util.Scanner;
public class bankaccountTester {

	private double withdraw;
	private double deposit; 
	private double balance; 
	private double newBal; 
	public String name;
	

	
	
	public bankaccountTester () {
		withdraw = 0;
		deposit = 0;
		balance = 0;
		newBal = 0;
		
	}
		
		public void username() {
			Scanner in = new Scanner (System.in);
			
			System.out.println("Please enter your name: ");
			name = in.nextLine();
			
			
		}
		
	
	
		public void startBal () {
		
			Scanner in = new Scanner (System.in);
			
			System.out.println("Please enter your starting balance: ");
			balance = in.nextDouble();
			
			
		}

		
	
		public void deposit () {
		Scanner in = new Scanner (System.in); 
		
		System.out.println ("Please enter amount in deposit: "); 
		deposit = in.nextDouble();
		deposit = balance + deposit;
		//System.out.println(name);
		//System.out.println ("This is your remaining balance: "+ deposit);
		
		
	}
	   
	
	
	
	public void withdraw () {
		Scanner in = new Scanner (System.in); 
		System.out.println ("Please enter your amount of withdraw: ");
		withdraw = in.nextDouble();
		newBal = deposit - withdraw; 
		
	}
	
	
	
	public double getBalance() { 
	      
		System.out.println(name);
		System.out.println("This is your new balance: " + newBal);
		return newBal;

	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bankaccountTester mybank = new bankaccountTester();
		
		mybank.username();
		mybank.startBal();
		mybank.deposit();
		mybank.withdraw();
		mybank.getBalance();
		
		
		
		
		
		
		
		
		
		
		
	}

}
