package customexception;

public class HeartBeatAlertException extends RuntimeException{
	int heartRate;
	
	public HeartBeatAlertException(int heartRate) {
		// TODO Auto-generated constructor stub
		this.heartRate = heartRate; 
	}
	
	@Override
	public String getMessage() {
		return "Alert the heart rate is "+this.heartRate+" !!!";
	}
	
	

}
