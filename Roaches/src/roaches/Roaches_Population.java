package roaches;

public class Roaches_Population {
	
	
	private double population;
	
	
	
	public Roaches_Population (double intRoachPop)
	{
		population = intRoachPop;
		
	}
	

	public void breed () 
	{
		
		this.population = population * 2;

		
	}
	
	public void spray (double askSprayPct)
	{
		
		population = (this.population - (askSprayPct * this.population));
		
		
	  
	  
	}
	
	public double getRoaches() 
	{
  
	population = Math.round(population);
	 return population;
		
		
	}
	
	
	
	
}