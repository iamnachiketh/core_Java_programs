package stringsprogram;

public class VowelOrConsonants {
	public static void main(String[] args) {
		String s = "java is cool!!!1233";
		char[] ch = s.toCharArray();
		String vc = "AEIOUaeiou";
		int vcount = 0,ccount = 0;
		for(int i=0;i<ch.length;i++) {
			if(vc.indexOf(ch[i])!=-1) vcount++;
			else if(ch[i]>='A'&&ch[i]>='Z'||ch[i]>='a'&&ch[i]<='z') ccount++;
		}
		
		System.out.println(vcount+" "+ccount);
	}
}
