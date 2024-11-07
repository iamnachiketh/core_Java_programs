package numbersystem;

public class CountEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -125476;
		countEven(num);
	}
	
	static void countEven(int num) {
		int ce = 0, co=0;
		if(num == 0) { 
			System.out.println("Count of even and odd digit is: "+1+","+0);
			return;
		}
		while(num!=0) {
			int rem = num%10;
			num = num / 10;
			if(num%2==0) ce++;
			else co++;
			System.out.println(rem);
		}
		
		System.out.println("Even : "+ce);
		System.out.println("Odd : "+co);
	}

}
