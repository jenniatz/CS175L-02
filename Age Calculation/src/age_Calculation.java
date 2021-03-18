import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class age_Calculation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate.now();
		
		
		String bdayInput = JOptionPane.showInputDialog("Enter your birthday MM/DD/YYYY: ");
		
		
		
		String todayInput = JOptionPane.showInputDialog("Enter Today's date MM/DD/YYYY: ");
		
		
		LocalDate bdayCalc = LocalDate.parse(bdayInput, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		LocalDate todayCalc = LocalDate.parse(todayInput, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		
		
		Period calc = Period.between(bdayCalc, todayCalc);
		
		JOptionPane.showMessageDialog(null, "You are " + calc.getYears() + " years and " + calc.getMonths() + " months ");
		
		
		
		
		
		
		
		
	}


}
