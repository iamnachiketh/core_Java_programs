package customsorting;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1,Student s2) {
//		char[] a = s1.name.toCharArray();
//		char[] b = s2.name.toCharArray();
//		for(int i =0,j=0;i<a.length&&j<b.length;i++,j++) {
//			if(a[i]!=b[j]) return a[i] - b[j];
//		}
//		if(a.length<b.length) return 1;
//		else if(a.length>b.length) return -1;
//		return 0;
		return s1.name.compareTo(s2.name);
	}
}
