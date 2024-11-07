package org;

import java.util.Scanner;

public class Flipkart {
	
	static void checkOtp(int otp) throws Exception{
		if(otp == 1453) System.out.println("Login successful!!");
		else throw new OtpInvalidException(otp);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the otp");
		int otp = sc.nextInt();
		
		try {
			checkOtp(otp);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
