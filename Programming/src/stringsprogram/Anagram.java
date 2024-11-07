package stringsprogram;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Cat";
		String s2 = "keep";
		 s1 = convertLowerCase(s1);
		 s2 = convertLowerCase(s2);
		 int[] count1 = freqOfElements(s1);
		 int[] count2 = freqOfElements(s2);
		 
		 for(int i =0;i<26;i++) {
			 if(count1[i]!=count2[i]) {
				 System.out.println("Not an anagram");
				 return;
			 }
		 }
		 System.out.println("Anagram");
		 return;
	}
	
	static int[] freqOfElements(String s) {
		
		int[] count = new int[26];
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			//if(c>='A'&&c<='Z') count[c - 65]++;
			if(c>='a'&&c<='z') count[c-97]++;
		}
		
		return count;
	}
	
	static String convertLowerCase(String s) {
		
		char[] ch = s.toCharArray();
		for(int i =0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') ch[i] = (char)(ch[i]+32);
		}
		
		return new String(ch);
	}

}
