package week3.day2;

public class SmartPhone extends AndroidPhone implements Mobile,Nokia{

	 public void makeCall() {
		System.out.println("Call recieved");
		
	}

	public void sendSms() {
		System.out.println("Sms revieved");
		
	}
	
	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		SmartPhone s = new SmartPhone();
		s.sendSms();
		s.makeCall();
	}

	public void takeSnapshot() {
		// TODO Auto-generated method stub
		
	}

	public void voiceMessage() {
		// TODO Auto-generated method stub
		
	}

	

}
