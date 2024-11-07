package stringsprogram;

public class ConvertLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "JaVa";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') ch[i] = (char)(ch[i]+32);
		}
		
		System.out.println(new String(ch));
	}

}
