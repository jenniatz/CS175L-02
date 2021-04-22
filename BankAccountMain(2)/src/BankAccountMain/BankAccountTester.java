package BankAccountMain;

import java.util.ArrayList;


public class BankAccountTester {
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	
		BankAccount gil = new BankAccount ("Gil", 500);
		BankAccount Joe = new BankAccount("Joe", 1000);
		BankAccount Fred = new BankAccount ("Fred", 2000);
		BankAccount Sally = new BankAccount("Sally", 2500);
		
		//ArrayList<Employee> employeeList= new ArrayList<>();
		
		ArrayList<BankAccount> accountList = new ArrayList<>();
		
		
		accountList.add(gil);
		accountList.add(Joe);
		accountList.add(Fred);
		
	
		
		for (BankAccount accountHolder : accountList) {
			System.out.print("This is the account name, account number, and balance of the account holders: ");
			System.out.println(accountHolder.getAccount());
		}
		
	
		
	accountList.add(Sally);
	//search for bank account with highest balacne
	
	double largest = 0;
	String info1 = " ";
	for (BankAccount account: accountList) {
	
		
		if(account.getBalance()> largest) {
	
			largest = account.getBalance();
			info1 = account.getAccount();
			
		}
		
				
		
}
	System.out.print("The Initial Highest Balance is: ");
	System.out.println(info1);

	
	
	
	
	accountList.remove(Sally);
	
	double highest = 0;
	String info = " ";
	
	
	  for (BankAccount account2: accountList) {
	 
		  
	  if(account2.getBalance()> highest) {
		  
		  
		  highest = account2.getBalance();
		  
		info = account2.getAccount(); 
		
			  
			  
			  }
		 }
		 
	 
	
	  
  System.out.print("The New Highest Balance is: ");	  
  System.out.println(info);
	  
	

	  
	  }
		
}
	
	
	

