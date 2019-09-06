package model;
public class AlertLevel {

	private int SecureLevel;
	private String Warning;
	
	public AlertLevel(int SecureLevel) {
		this.SecureLevel = SecureLevel;
	}
	
	public int PrintAlert() {
		if(SecureLevel == 1) {
			Warning = "COCKED PISTOL: Maximum readiness";
			System.out.println(Warning);}
		else
		if(SecureLevel == 2) {
			Warning = "FAST PACE: Armed forces ready to deploy and engage in less than 6 hours";
			System.out.println(Warning);}
		else
		if(SecureLevel == 3) {
			Warning = "ROUND HOUSE: Air Force ready to mobilize in 15 minuets";
			System.out.println(Warning);}
		else
		if(SecureLevel == 4) {
			Warning = "DOUBLE TAKE:  Above normal readiness";
			System.out.println(Warning);}
		else
		if(SecureLevel == 5) {
			Warning = "FADE OUT: Lowest state of readiness";
			System.out.println(Warning);}
		else
			System.out.println("Error level given is unavailable");
		
			return SecureLevel;
	}
	
	public int TestWarningLength() {
		return Warning.length();
	}
	
}

