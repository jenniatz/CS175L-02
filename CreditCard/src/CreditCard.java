import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		String creditCard = " ";
		
		System.out.println("Please enter credit card or enter -99 to end: ");
		

		
		while (in.hasNextLine()) {
		creditCard = in.nextLine();	
			
		if	(creditCard.equals("-99")) {
			System.out.println("Goodbye");
			break;		
			}
		
		
	int i = 0;
	while  (i < creditCard.length())
	{
		
		char ch = creditCard.charAt(i);
		if( ch == ' '|| ch == '-')
		{
			
			String creditCardBefore = creditCard.substring(0, i);
			String creditCardAfter = creditCard.substring(i + 1);
			creditCard = creditCardBefore + creditCardAfter; 
		}
			else
			{
				i++;
			}
			
			
		}
		System.out.println(creditCard);
		System.out.println("Please enter credit card or enter -99 to end: ");
	}
		
		}	 
		
	
		
		
	
}	


