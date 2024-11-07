package customexception;

import java.util.Scanner;

public class SmartWatch {
	
	static void display(){
		Scanner sc = new Scanner(System.in);
		int heartRate = sc.nextInt();
		if(heartRate<=150) System.out.println("Normal Heart Beat");
		else throw new HeartBeatAlertException(heartRate);
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			display();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("sc closed!!!!");
		}

	}

}
