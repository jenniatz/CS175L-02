package roaches;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class roachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat decFormat = new DecimalFormat("0.00");	

		String askInitialPop = JOptionPane.showInputDialog("Enter starting roach population: ");	
		double intRoachPop = Double.parseDouble(askInitialPop);

		Roaches_Population bugs = new Roaches_Population(intRoachPop);	
		JOptionPane.showMessageDialog(null, "The intial roach population is : " + bugs.getRoaches());
		bugs.breed(); 	
		
		//Cycle 1
		JOptionPane.showMessageDialog(null, "The roach population after Cycle 1 breeding is: " + bugs.getRoaches());
		
	
		String askSprayPct = JOptionPane.showInputDialog(" Enter spray percentage for cycle 1 : " );
		double sprayPct = Double.parseDouble(askSprayPct);
		decFormat.format(sprayPct);
		bugs.spray(sprayPct);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 1 " + sprayPct + "% spraying is: " + bugs.getRoaches());
		
		//Cycle 2
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The roach population after Cycle 2 breeding is: " + bugs.getRoaches());
		askSprayPct = JOptionPane.showInputDialog(" Enter spray percentage for cycle 2 : " );
		sprayPct = Double.parseDouble(askSprayPct);
		decFormat.format(sprayPct);
		bugs.spray(sprayPct);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 2 " + sprayPct + "% spraying is: " + bugs.getRoaches());
		
		
		//cycle 3
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The roach population after Cycle 3 breeding is: " + bugs.getRoaches());
		askSprayPct = JOptionPane.showInputDialog(" Enter spray percentage for cycle 3 : " );
		sprayPct = Double.parseDouble(askSprayPct);
		decFormat.format(sprayPct);
		bugs.spray(sprayPct);
		
		JOptionPane.showMessageDialog(null, "The roach population after cycle 3 " + sprayPct + "% spraying is: " + bugs.getRoaches());
		

		//cycle 4
		bugs.breed();
		JOptionPane.showMessageDialog(null, "The roach population after Cycle 4 breeding is: " + bugs.getRoaches());
		askSprayPct = JOptionPane.showInputDialog(" Enter spray percentage for cycle 4 : " );
		sprayPct = Double.parseDouble(askSprayPct);
		bugs.spray(sprayPct);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 4 " + sprayPct + "% spraying is: " + bugs.getRoaches());
		
		
		
	}

}
