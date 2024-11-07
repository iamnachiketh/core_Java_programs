package numbersystem;

public class Deserium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 89, n = num,count = 0,sum =0,n1 = num;
		while(num!=0) {
			count++;
			num = num/10;
		}
		
		while(n!=0) {
			int rem = n%10;
			sum += Math.pow(rem, count);
			count--;
			n = n/10;
		}
		
		System.out.println(sum == n1);
	}

}
