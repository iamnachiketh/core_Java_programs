package stringsprogram;

public class VowlelsConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is very cool programmin1234g  l&*%anguage";
		char[] ch = s.toCharArray();
		String vowels = "AEIOUaeiou";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z') {
				if(vowels.indexOf(ch[i])!=-1 && ch[i]>='a'&&ch[i]<='z') 
					ch[i] = (char)(ch[i]-32);
				else if(ch[i]>='A'&&ch[i]<='Z') ch[i] = (char)(ch[i]+32);
			}
		}
		System.out.println(new String(ch));
	}

}
