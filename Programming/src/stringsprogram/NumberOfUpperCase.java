package stringsprogram;

public class NumberOfUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is cool @hello123";
		char[] ch = s.toCharArray();
		int ac = 0, sc = 0, nc = 0;
		for(int i =0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z' || ch[i]>='a'&&ch[i]<='z') ac++;
			else if(ch[i]>='1'&&ch[i]<='9') nc++;
			else sc++;
		}
		System.out.println(ac+" "+nc+" "+sc);
	}

}
