package net.itbank.Day0402;

public class Son extends Father {
	
	public static void main(String[]args) {
		Son tom = new Son();
		tom.study();
	}//main end
	
	public void study() {//non-static
		System.out.println("Son아들  tom 열공중");
//		bank();
	
	}//end
}//class end
