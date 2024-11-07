package storingobjects;

public class CountryMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c1 = new Country("India",140);
		Country c2 = new Country("USA",30);
		Country[] c = {c1,c2};
		for(int i=0;i<c.length;i++) {
			c[i].displayDetails();
		}

	}

}
