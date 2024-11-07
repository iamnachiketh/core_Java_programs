package multilevel;

class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tom  t = new Tom();
//		System.out.println(t.id);
//		System.out.println(t.age);
//		t.work();
//		t.eat();
		int[] a = new int[5];
		try {
			try {
				System.out.println(10/0);
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
			System.out.println("outer block");
			System.out.println(a[100]);
			System.out.println("next!!!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
