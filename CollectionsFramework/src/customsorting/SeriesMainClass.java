package customsorting;

import java.util.Scanner;
import java.util.TreeSet;

public class SeriesMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Series> ts = new TreeSet<Series>();
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=5;i++) {
			
			System.out.print("Enter the Series Name: ");
			String sName = sc.next();
			System.out.print("Enter its Rating: ");
			Double rate = sc.nextDouble();
			ts.add(new Series(sName,rate));
			
		}
		System.out.println("=============================================");
		for(Series s:ts) {
			System.out.println("Series Name: "+s.seriesName+", Rating: "+s.rating);
		}
		
	}

}
