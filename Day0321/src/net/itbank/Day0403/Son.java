package net.itbank.Day0403;

public class Son extends Father{
	
	public static void main(String[]args) {
		Son tom = new Son();
		tom.study();
		tom.bank();
	}//main end
	
	public void study() {//non-static // static�϶� ���� // static�϶� this, super ���� �ȵȴ�
		System.out.println("Son�Ƶ�  tom ������");
		super.bank();
		System.out.println();
		bank();
		System.out.println();
//		this.bank();
	}//end

	@Override
	public void bank() {// �̻��� �����϶� �ڽ� ������ ����, ���� ���϶��� �ڽ� ������=�������̵�=overriding
//		super.bank(); 
		System.out.println("Son�Ƶ�  tom ������");
		System.out.println("bank�޼ҵ� ���λ���");
	}
}//class end
