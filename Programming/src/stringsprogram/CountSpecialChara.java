package stringsprogram;

public class CountSpecialChara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I have worked 10+ projects @Bra%i^ns#igh&t 100% success";
		char[] ch = s.toCharArray();
		int count = 0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z'||ch[i]>='0'&&ch[i]<='9'||ch[i]==' ')
				continue;
			else count++;
		}
		
		System.out.println(count);
	}

}
