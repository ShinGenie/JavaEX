package net.itbank.Day0403;

public class Test {
	
	int pwd=9876;
	String gender="����";
	
	public static void main (String[]args) {
		System.out.println("�������� ���� Ȯ��");
		Test ts = new Test();
		ts.myInfo();
		int pwd=1200;
		System.out.println("�������: "+pwd);
	}//main end
	
	public void myInfo() {
		int pwd=1200;
		System.out.println("�������: "+this.pwd);
		System.out.println("�������: "+pwd);
		System.out.println("���μ���: "+gender);
	}
}//class end
