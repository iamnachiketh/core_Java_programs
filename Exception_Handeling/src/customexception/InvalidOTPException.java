package customexception;

public class InvalidOTPException extends Exception{

	String message;
	public InvalidOTPException(String message) {
		this.message = message;
	}
	
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
}
