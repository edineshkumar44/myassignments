package week1.day1;

public class Mobile {
	private void makeCall() {
		String mobileModel = "Redmi";
		float mobileWeight=20.3f;
		System.out.println("makeCall");
		}
	public void sendMessage() {
		boolean Fullcharged=true;
		int mobileCost=13000;
		System.out.println("Fully charged");
	}
	
public static void main(String[] args) {
	Mobile obj=new Mobile();
	obj.makeCall();
	obj.sendMessage();
	System.out.println("this is my mobile");
	
	
}
}
