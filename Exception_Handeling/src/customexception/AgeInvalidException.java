package customexception;

public class AgeInvalidException extends Exception{
	
	private String message;
	
	public AgeInvalidException(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
}
