package stringsprogram;

public class NumbersToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt = 123456499;
		convertToWords(amt/10000000, "crore");
		convertToWords(amt/100000%100, "lakhs");
		convertToWords(amt/1000%100, "thousand");
		convertToWords(amt/100%10, "hundred");
		convertToWords(amt%100, " ");
	}
	
	static void convertToWords(int n,String s) {
			
			if(n==0) return;
			String[] x = {" ","one","two","three","four","five","six","seven",
				"eight","nine","ten","eleven","twelve","thirteen","fourteen",
				"fifteen","sixteen","seventeen","eighteen","ninteen"};
			
			String[] y = {" "," ","tweenty","thirty","fourty",
					"fifty","sixty","seventy","eighty","ninty"};
			
			if(n<20) System.out.print(x[n]+" ");
			else System.out.print(y[n/10]+" "+x[n%10]+" ");		
			System.out.print(s+" ");
	}

}
