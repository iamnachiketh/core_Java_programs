package abc;

public class Runner implements Person{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Runner();
		p.walks();
	}
	
	@Override
	public void walks() {
		System.out.println("walks on two legs!!");
	}

}
