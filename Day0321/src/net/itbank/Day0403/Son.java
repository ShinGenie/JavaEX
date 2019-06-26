package net.itbank.Day0403;

public class Son extends Father{
	
	public static void main(String[]args) {
		Son tom = new Son();
		tom.study();
		tom.bank();
	}//main end
	
	public void study() {//non-static // static일때 에러 // static일때 this, super 쓰면 안된다
		System.out.println("Son아들  tom 열공중");
		super.bank();
		System.out.println();
		bank();
		System.out.println();
//		this.bank();
	}//end

	@Override
	public void bank() {// 이상한 내용일때 자식 재정의 적절, 내용 무일때도 자식 재정의=오버라이딩=overriding
//		super.bank(); 
		System.out.println("Son아들  tom 열공중");
		System.out.println("bank메소드 제로상태");
	}
}//class end
