package customexception;

import java.util.Scanner;

public class Election {
	
	public static Scanner sc = new Scanner(System.in);
	
	static void checkEligibility(int age) throws AgeInvalidException{
		
			if(age>18) {
				System.out.println("Eligible to vote");
			}
			if(age == 9){
				System.out.println("If she is 9 then she is mine");
			}else if(age>=120) {
				System.out.println("but they are dead or Your about to die");
			}else{
				throw new AgeInvalidException("Not Eligible to vote");
			}
			System.out.println("In checkElig");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkEligibility(12);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("End of the program");
		}
		
		System.out.println("bhhhhhhhhh");
	}

}
