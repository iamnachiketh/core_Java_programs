package day1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30};
		
		try {
			System.out.println("Enter index : ");
			int idx = Demo.sc.nextInt();
			System.out.println(a[idx]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
