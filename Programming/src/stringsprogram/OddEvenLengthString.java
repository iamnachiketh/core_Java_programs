package stringsprogram;

public class OddEvenLengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countEven = 0, countOdd = 0;
		String s = "Java is SoO cool programming";
		char[] ch = s.toCharArray();
		for(int i = ch.length -1;i>=0;i--) {
			int l = i;
			int scount = 0;
			while(i>=0&&ch[i]!=' ') i--;
			int f = i + 1;
			while(f<=l) {
				scount++;
				f++;
				}
			if(scount!=0) {
				if(scount%2==0) countEven++;
				else countOdd++;
				}
			}
		System.out.println("Even: "+countEven+"  Odd: "+countOdd);
		}
		
	}

