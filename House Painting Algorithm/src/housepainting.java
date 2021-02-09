import java.util.Scanner;

public class housepainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner in = new Scanner (System.in); 
		
		
		int width = 0; 
		int length = 0; 
		int height = 0;
		int winLength = 0;
		int winWidth = 0; 
		int numOfWin = 0; 
		int doorLength = 0; 
		int doorWidth = 0; 
		int numOfDoor = 0;
		
		double SqFtCost = 0; 

		
		System.out.println("Enter width of house: "); 
		width = in.nextInt();
		System.out.println("Enter length of house:  "); 
		length = in.nextInt(); 
		System.out.println("Enter height as house: "); 
		height = in.nextInt();
		System.out.println( "Enter window length: ");
		winLength = in.nextInt();
		System.out.println("Enter window width: ");
		winWidth = in.nextInt(); 
		System.out.println("Enter number of windows: ");
		numOfWin = in.nextInt();
		System.out.println("Enter door length: ");
		doorLength = in.nextInt();
		System.out.println("Enter door width: ");
		doorWidth = in.nextInt();
		System.out.println ("Enter number of doors: ");
		numOfDoor = in.nextInt();
		System.out.println ("Enter cost per square foot: ");
		SqFtCost = in.nextInt();
		
		
			double winDim = (winLength*winWidth) *numOfWin; 
			double doorDim = (doorLength*doorWidth)* numOfDoor;
			double SFWD = winDim + doorDim; 
			double SQFTN = length* width; 
			double SQFTP= SQFTN + (0.5 * (length*(height-width))); 
			double TotalSF = ((SQFTP * 2) + (SQFTN * 2 ) - (SFWD));
			double total = (TotalSF * SqFtCost);
			System.out.println("your total is: " + total);
		

		
		
		
	
		
		
		
		
	}

	
	}


