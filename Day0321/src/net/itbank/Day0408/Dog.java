package net.itbank.Day0408;

public class Dog extends Animal{

   public Dog( ){ }

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void bark() {
		System.out.println("港港港港~~~港港");
	}
	
	public void eat() {
		System.out.println("侥己 : 焕促备");
	}
	
	public void kind() {
		System.out.println("辆幅 : 器蜡幅");
	}
	
}//class END
