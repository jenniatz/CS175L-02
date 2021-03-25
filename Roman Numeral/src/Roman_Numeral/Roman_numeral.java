package Roman_Numeral;

import java.util.Scanner;

public class Roman_numeral {
	public static int userNum; 
	String sum;
	
public void romanNum (int userNum)
{
	String [] thousands = new String [] {"", "M", "MM", "MMM"};
	String [] hundreds = new String [] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	String [] tens = new String [] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	String [] ones = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	
	sum = thousands[userNum /1000%10] + hundreds[userNum/ 100 % 10] + tens [userNum/ 10 % 10] + ones[userNum/ 1% 10]; 
	
		
}
	
public String getRomanNum()
{
	
	return sum;	
	
}



public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);
	System.out.println("please enter an integer to convert to a Roman Numeral: "); 
	userNum = in.nextInt();
	

	Roman_numeral convert = new Roman_numeral();
	
	convert.romanNum(userNum);
	System.out.println("The Roman Numeral is: " + convert.getRomanNum());
	
	
	
}




		
	
}	
	
	
	

