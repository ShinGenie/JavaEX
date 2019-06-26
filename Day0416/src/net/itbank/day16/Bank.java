package net.itbank.day16;

public abstract class Bank {// 전역상수는 class 보다 인터페이스로 쓰는게 낫다
	//최소 추상메소드가 하나라도 있으면 자동 추상클래스
	public abstract void deposite(int m);
	public abstract void getBalance();
	public abstract void withraw(int m);
	public void pwdCheck(String id, int pwd) {
		if(id.equals("sky")&&pwd==1234) {
			System.out.println("인증되었습니다");
		}
	}
	
}
