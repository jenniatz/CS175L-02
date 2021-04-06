package BankMain;

public class BankTster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount myBank = new BankAccount();
		myBank.startbalance();
		myBank.interestrate();
		//Double balance = myBank.getinitialBalance();
		System.out.println(myBank.getIntialBalAndInt());
		myBank.deposit();
		System.out.println(myBank.getinitalDeposit());
		myBank.withdraw();
	
		myBank.withdraw();
		System.out.println();
		myBank.askcalcInterest();
		System.out.println(myBank.getInterestRate());
		myBank.finalbalance();
		System.out.println(myBank.getBalance());
		
		
		
		
		
		
	}

}
