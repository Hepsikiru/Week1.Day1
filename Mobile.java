package testpackage;

public class Mobile {
	String message = "HeLlo";
	long mobileNo = 9555555678L;
	public void sendMessage(String msg) {
		System.out.println("send message: "+msg);
	}
	public void makeCall(long number) {
		System.out.println("making call "+ number);
	}
	public void saveContact(long number, String name) {
		System.out.println("saving contact:");
	    System.out.println("name: "+name);
		System.out.println("mobile no: "+number);
	}
	
	public static void main(String[] args) {
		Mobile mobileObject = new Mobile();
		mobileObject.sendMessage(mobileObject.message);
		mobileObject.makeCall(mobileObject.mobileNo);
		mobileObject.saveContact(9874657903L, "Alice");
	}

}
