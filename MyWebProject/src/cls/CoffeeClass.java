package cls;

public class CoffeeClass {

	public String name;			// Название
	public double cost;			// Стоимость	
	public double volume;			// Объем

	public CoffeeClass() {
	}

	public String getName() {
		return name;
	}
	
	public double getCost() {
		return cost;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public void setName(String iName) {
		name = iName;
	}
	
	public void setCost(double iCost) {
		cost = iCost;
	}
	
	public void setVolume(double iVolume) {
		volume = iVolume;
	} 
	
}
