
public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] table = new int[10][10];
		
		for (int row = 0; row < table.length; row++)
		{
			for (int column = 0; column < table.length; column++)
			{
				table[row][column] = (row+1) * (column+1);
		
			}
			
		}
		
		for (int row = 0; row < table.length; row++)
		{
			for (int column = 0; column < table.length; column++)
			{
				//System.out.print(" ");
				System.out.print(table[row][column] + "  "); 
						}
			
			System.out.println(" \n ");
			
		}
		
			
	}

}
