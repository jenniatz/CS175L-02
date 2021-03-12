
import javax.swing.JOptionPane;

public class Roaches_Population {
	
	
	double intRoachPop;
	double finalRoachPop;
	double pop;
	double breed;
	double sprayPct;
	
	
	public void initialpop(String askInitialPop)
	{
		
		askInitialPop = JOptionPane.showInputDialog("Enter the intial roach population: ");
		intRoachPop = Double.parseDouble(askInitialPop);
		//input message print inital roach pop
			
		JOptionPane.showMessageDialog(null, "The intial roach population is : ", askInitialPop, 0, null);
		
	}
	

	public void breed (String printBreeding) 
	{
		
		breed = intRoachPop * 2;

		printBreeding = JOptionPane.showInputDialog("The roach population after Cycle 1 breeding is: " + breed);
			//input message breeding pop
		
	}
	
	public void spray (String askSprayPct, String message)
	{
		this.pop = breed;
		finalRoachPop = sprayPct * this.pop;
		askSprayPct = JOptionPane.showInputDialog(" Enter spray percentage for cycle : " );
		sprayPct = Double.parseDouble(askSprayPct);
		//input message	print new roach pop
		
		
		
	 message = JOptionPane.showInputDialog(null, "The roach population after cycle 1 with ", sprayPct);
	 
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
