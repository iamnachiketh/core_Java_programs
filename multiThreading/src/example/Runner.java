package example;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee s = new Employee();
//		s.setName("java");
//		s.setPriority(2);
//		s.start();
		Runnable p = new Person();
		Thread t = new Thread(p,"Person Thread!!");
		System.out.println(t.getId());
		System.out.println(t.getName());
		t.setPriority(10);
		System.out.println(t.getPriority());
		t.start();
	}

}
