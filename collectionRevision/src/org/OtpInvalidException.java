package org;

public class OtpInvalidException extends Exception{
	
	public OtpInvalidException(int otp) {
		this.otp = otp;
	}
	
	int otp;
	
	@Override
	public String getMessage() {
		return this.otp+" Otp is invalid!!";
	}
}
