package customexception;

public class Flipkart {
	
	static void login(int otp) throws InvalidOTPException{
		if(otp == 8775) {
			System.out.println("Login successful");
		}else {
			throw new InvalidOTPException("The otp is invalid");
		}
		System.out.println("in login");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the otp: ");
		int otp = Election.sc.nextInt();
		try {
			login(otp);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("in main!!");
		return;
	}

}
