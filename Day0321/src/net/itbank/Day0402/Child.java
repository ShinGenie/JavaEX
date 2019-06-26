package net.itbank.Day0402;

public class Child  {
	
	public static void main(String[]args) {
		Child tom = new Child();
		tom.play();
		Mother jane = new Mother();
		jane.house();
	}//main end
	
	public void play() {//non-static
		System.out.println("Child ÀÚ½Ä  play");
//		house();
	
	}//end
}//class end
