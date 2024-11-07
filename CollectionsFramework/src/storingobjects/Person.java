package storingobjects;

public class Person implements Comparable<Person>{
	int age;
	String name;
	
	Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+", Age: "+this.age;
	}
	
	@Override
	public int compareTo(Person p) {
		//return this.name.compareTo(p.name);
		char[] a = p.name.toCharArray();
		char[] b = this.name.toCharArray();
		int i =0,j=0;
		for(i=0,j=0;i<a.length && j<b.length;i++,j++) {
			if(a[i] != b[j]) return  b[j] - a[i];
		}
		if(a.length > b.length) return -1;
		else if(a.length<b.length) return 1;
		return 0;
	}
}
