package net.itbank.day16;

public abstract class Bank {// ��������� class ���� �������̽��� ���°� ����
	//�ּ� �߻�޼ҵ尡 �ϳ��� ������ �ڵ� �߻�Ŭ����
	public abstract void deposite(int m);
	public abstract void getBalance();
	public abstract void withraw(int m);
	public void pwdCheck(String id, int pwd) {
		if(id.equals("sky")&&pwd==1234) {
			System.out.println("�����Ǿ����ϴ�");
		}
	}
	
}
