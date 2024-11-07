package stringsprogram;

public class CovertToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		char[] ch = s.toCharArray();
		
		for(int i = 0;i<ch.length;i++) {
			if(ch[i]<='z'&&ch[i]>='a')ch[i] = (char)(ch[i]-32);
		}
		
		System.out.println(new String(ch));
	}

}
