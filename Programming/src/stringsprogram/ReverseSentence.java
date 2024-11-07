package stringsprogram;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is a cool language";
		String res = "";
		char[] ch = s.toCharArray();
		
		for(int i =ch.length-1;i>=0;i--) {
			int l = i;
			while(i>=0&&ch[i]!=' ') i--;
			int f = i+1;
			while(f<=l) {
				res += ch[f];
				f++;
			}
			if(i>=0) res+=ch[i];
		}
		System.out.println(res);
	}

}
