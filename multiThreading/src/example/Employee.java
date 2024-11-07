package example;

public class Employee extends Thread{
	@Override
	public void run() {
		System.out.println("developing java");
		Thread t =  Thread.currentThread();
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
	}
}
