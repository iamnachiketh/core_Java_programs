package storingobjects;

public class Country {
	Country(String name,int population){
		this.name = name;
		this.population = population;
	}
	String name;
	int population;
	
	void displayDetails() {
		System.out.println("Country Name: "+this.name+"\t The population is"+this.population+"crores");
	}
}
