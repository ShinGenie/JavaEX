package net.itbank.Day0408;

public class Cat extends Animal{

    public Cat( ){ }

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void bark() {
		System.out.println("具克具克~~~具克");
	}
	
	public void eat() { 
		System.out.println("侥己 : 积急");
	}
	
	public void kind() {
		System.out.println("辆幅 : 器蜡幅");
	}
	
}//class END
