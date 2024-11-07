package rtp;

public class Runner extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Runner();
		c.display();
	}
	
	@Override
	public void display() {
		System.out.println("The brand is honda");
	}

}
