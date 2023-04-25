package week1.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("Bike break applied");
	}
public void soundHorn() {
	System.out.println("Bike sound Horn");
	
}
public static void main(String[]args) {
	Car obj=new Car();
	Bike obj1=new Bike();
	obj.applyBreak();
	obj.soundHorn();
	obj1.applyBreak();
	obj1.soundHorn();
}
}
