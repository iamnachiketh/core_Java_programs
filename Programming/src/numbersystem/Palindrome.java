package numbersystem;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -121;
		System.out.println(checkPalin(num));
	}
	
	public static boolean checkPalin(int num) {
		int sum = 0, n = num;
		if(num == 0) return true;
		while(num!=0) {
			int rem = num%10;
			num = num / 10;
			sum = sum*10 + rem;
			System.out.println(rem);
		}
		
		if(n == sum) return true;
		return false;
	}

}
