package stringsprogram;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1AM2Ma1";
		int i = 0, j = s.length() -1;
		s = s.toLowerCase();
//		int count = 0;
//		for(int k =0;k<s.length();k++) {
//			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9')
//				count++;
//		}
//		char[] ch = new char[count];
//		int idx = 0;
//		
//		for(int l =0;l<s.length();l++) {
//			if(s.charAt(l)>='A'&&s.charAt(l)<='Z'||s.charAt(l)>='a'&&s.charAt(l)<='z'||s.charAt(l)>='0'&&s.charAt(l)<='9') {
//				if(s.charAt(l)>='A'&&s.charAt(l)<='Z')
//					ch[idx++] = (char)(s.charAt(l)+32);
//				else ch[idx++] = s.charAt(l);
//			}
//		}
//		System.out.println(new String(ch));
		while(i<=j) {
			if(s.charAt(i)!= s.charAt(j)) {
				System.out.println("Not");
				return;
			}
			i++;
			j--;
		}
		System.out.println("Palindrome");
	}

}
