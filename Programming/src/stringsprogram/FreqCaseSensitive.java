package stringsprogram;

public class FreqCaseSensitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] count = new int[123];
		
		String s = "Java is a COol Programing piGgA";
		
		char[] ch = s.toCharArray();
		
		for(int i =0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') count[ch[i]]++;
			else if(ch[i]>='a'&&ch[i]<='z') count[ch[i]]++;
		}
		
		for(int i =0;i<123;i++) {
			if(count[i]!=0) System.out.println((char)(i)+"-> "+count[i]);
		}
	}

}
