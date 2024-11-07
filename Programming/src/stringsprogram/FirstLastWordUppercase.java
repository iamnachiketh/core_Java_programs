package stringsprogram;

public class FirstLastWordUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java programming lan354guag2 is a cool language";
		
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&& ch[i-1]==' ') {
				if(ch[i]>='a'&&ch[i]<='z') ch[i] = (char)(ch[i] - 32);
			}else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				if(ch[i]>='a'&&ch[i]<='z') ch[i] = (char)(ch[i] - 32);
			}else {
				if(ch[i]>='A'&&ch[i]<='Z') ch[i] = (char)(ch[i] + 32);
			}
		}
		
		System.out.println(new String(ch));
	}

}
