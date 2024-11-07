package numbersystem;

public class XylemAndPholem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check(-121);
	}
	
	static void check(int num) {
		if(num ==0) {
			System.out.println("Xylem number");
			return;
		}
		int sum =0, r = num%10, l = 0;
		while(num!=0) {
			int rem = num%10;
			sum +=rem;
			num = num/10;
			if(num == 0) l = rem; 
		}
		
		int mid = sum - (r+l);
		if(mid == (r+l)) {
			System.out.println("Xylem");
			return;
		}
		System.out.println("Phloem");
	}

}
