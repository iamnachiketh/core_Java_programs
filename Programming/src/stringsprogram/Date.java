package stringsprogram;

public class Date {
	
	int yy,mm,days;
	int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	Date(int days,int mm,int yy){
		this.days = days;
		this.mm = mm;
		this.yy = yy;
		if(yy%400==0||yy%4==0&&yy%100!=0) month[2] = 29;
	}
	
	public int noOfDays() {
		int y = this.yy - 1;
		System.out.println(y);
		int nodays = y*365 + y/400 + y/4 - y/100;
		System.out.println(nodays);
		for(int i = 1;i<this.mm;i++) nodays +=month[i];
		
		nodays = nodays + this.days;
		
		return nodays;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(19,01,2023);
		Date d2 = new Date(22,02,2023);
		
		System.out.println(d2.noOfDays() - d1.noOfDays());
	}

}
