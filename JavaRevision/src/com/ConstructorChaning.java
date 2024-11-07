package com;

public class ConstructorChaning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m = new Man("Alex",22,"Mamal");
		Women w = new Women("Sherry", 19,"Manal");
		
		System.out.println("Name: "+m.name+" Age: "+m.age+" Kingdom: "+m.animalKingdom);
		
		System.out.println("Name: "+w.name+" Age: "+w.age+" Kingdom: "+w.animalKingdom);
		
	}

}
