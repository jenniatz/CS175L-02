package mailMerge;
import java.util.Scanner;

public class mailMerge {
	
	// prompts for user 
	static String promptText1 = ("Please enter your first name: ");
	static String promptText2 = ("Please enter your last name: ");
	static String promptText3 = ("Please enter your house number: ");
	static String promptText4 = ("Please enter your street: ");
	//replacement prompts
	static String replaceText1 = ("Dear <firstName> <lastName>,");
	static String replaceText2 = ("Please confirm that your address is <houseNumber> <street>");
	// yes or no prompt 
	static String yesOrNo = ("yes or no");
	static String replaceText3 = ("Your answer is: < yesORno > Goodbye!");
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in); 
		
		System.out.println(promptText1);
		promptText1 = in.nextLine();
		//saving input from user for prompt 1 
		System.out.println(promptText2);
		promptText2 = in.nextLine();
		System.out.println(promptText3);
		promptText3 = in.nextLine();
		System.out.println(promptText4);
		promptText4 = in.nextLine();
		
		// first replacements for prompt 1,2,3 and 4
		replaceText1 = replaceText1.replace("<firstName> <lastName>",  promptText1 + " " + promptText2 );
		replaceText2 = replaceText2.replace("<houseNumber> <street>",  promptText3 + " " + promptText4 );
		
		//print replacement back 
		System.out.println(replaceText1);
		System.out.println(replaceText2);
		System.out.println(yesOrNo);
		//asking to confirm
		yesOrNo = in.nextLine();
		//save answer from yes and no prompt and reprint new replacement statement 
		replaceText3 = replaceText3.replace("< yesORno >", yesOrNo );
		System.out.println(replaceText3);
	
		

		
		
	}

}
