package stringsprogram;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AbcdeFghijklMnopqrstuvwxymxcd";
		char[] ch = s.toCharArray();
		if(s.length()<26) return; 
//		for(int i = 0;i<ch.length;i++) {
//			if(ch[i]>='A'&&ch[i]<='Z') ch[i] = (char)(ch[i] + 32);
//		}
		
//		s = new String(ch);
		s = s.toLowerCase();
		for(char c = 'a';c<='z';c++) {
			if(s.indexOf(c)== -1) {
				System.out.println(c);
				System.out.println("not a panagram");
				return;
			}
		}
		System.out.println("Its panagram!!");
	}

}
