package stringsprogram;

public class FreqOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A cool meth dealer sold Me Meth";
		
		int[] count = new int[26];
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A'&&ch<='Z') count[ch - 65] +=1;
			else if(ch>='a'&&ch<='z') count[ch - 97]+=1;
		}
		for(char c = 'a';c<='z';c++) {
			System.out.print(c+" "+count[c - 97]+"  ");
		}
	}

}
