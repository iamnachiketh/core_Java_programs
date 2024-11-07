package stringsprogram;

public class InsertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java is so cool language";
		String s2 = "65Hello world";
		int idx = 5;
		String res = "";
		
		if(idx>s1.length()) return;
		if(idx == s1.length()) {
			res = res + s1 +" "+s2;
			System.out.println(res);
			return;
		}
		char[] ch = s1.toCharArray();
		for(int i =0;i<idx;i++) {
			res +=ch[i];
		}
		if(ch[idx] == ' ')	res = res  + " "+s2;
		else res = res + " " + s2 + " ";
		
		for(int i = idx;i<ch.length;i++) {
			res = res + ch[i];
		}
		System.out.println(res);
	}

}
