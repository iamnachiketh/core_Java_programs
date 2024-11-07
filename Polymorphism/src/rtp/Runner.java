package rtp;

public class Runner {
	
	static void display(OnlineShoppingApp obj) {
		obj.order();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(new Amazon());
		display(new Flipkart());
		display(new Myntra());
		
		System.out.println("=====================================");
		// Upcasting using same reference
		OnlineShoppingApp e1 = new Flipkart();
		e1.order();
		e1 = new Amazon();
		e1.order();
		e1 = new Myntra();
		e1.order();
		
		System.out.println("=====================================");
		// Upcasting using diff refe variable
		OnlineShoppingApp e2 = new Amazon();
		OnlineShoppingApp e3 = new Myntra();
		OnlineShoppingApp e4 = new Flipkart();
		
		e2.order();
		e3.order();
		e4.order();
		
		
	}

}
