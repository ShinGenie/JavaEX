package net.itbank.Day0403;

public class Test {
	
	int pwd=9876;
	String gender="여자";
	
	public static void main (String[]args) {
		System.out.println("개인정보 비대면 확인");
		Test ts = new Test();
		ts.myInfo();
		int pwd=1200;
		System.out.println("전역비번: "+pwd);
	}//main end
	
	public void myInfo() {
		int pwd=1200;
		System.out.println("전역비번: "+this.pwd);
		System.out.println("지역비번: "+pwd);
		System.out.println("개인성별: "+gender);
	}
}//class end
