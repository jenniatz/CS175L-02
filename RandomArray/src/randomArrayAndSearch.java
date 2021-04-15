import java.util.Random;
public class randomArrayAndSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = new int[50];
		
		
		
		int smallest = array[0];
		int largest = array [0];
		
		
		
		for (int i = 0; i< array.length; i++)
		{
			array[i] = new Random().nextInt(26);
			
			System.out.println(array[i]);
			
			if (array[i] < smallest) 
				smallest = array[i];
			
			if (array[i] > largest)
				largest = array[i];
		
				 
		}	
		
		
		System.out.println("The Smallest Number: " + smallest);
		
		System.out.println("The Highest NUmber: " + largest);
		
		int product = smallest * largest;
		
		System.out.println("The product of highest and smallest number is: " + product);
			
		
			
		}
		
		
}
