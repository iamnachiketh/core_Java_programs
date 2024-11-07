package numbersystem;

public class SumNprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nPrime(10);
	}
	static void nPrime(int n){
		int count = 0,sum =0;
		for(int i =2; count!=n;i++) {
			if(checkPrime(i)) {
			count++;
			//System.out.println(i);
			sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	
	static boolean checkPrime(int num) {
		int count =0;
		for(int i =1;i<=(int)Math.sqrt(num);i++) {
			if(num%i==0) {
				count++;
				if(num/i!=i) count++;
			}
		}
		if(count == 2) return true;
		return false;
	}
}
