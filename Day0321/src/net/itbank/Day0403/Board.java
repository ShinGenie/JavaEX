package net.itbank.Day0403;

public abstract class Board {
	//추상메소드는 리턴값, 매개인자 선언만
	//추상메소드가 하나라도 있으면 자동 추상클래스
	//추상클래스는 new 키워드 개체생성 불가능 
	//추상클래스는=추상메소드+static메소드+일반베소드 ==>매개인자,리턴값
	//추상클래스를 상속받으면 추상메소드는 강제 재정의 = 구현
	
	
	public abstract void delete(String id);	
	public abstract int dbcount();
	public abstract boolean insert(String name);
	
	public double save() { // 재정의 안함 static??
		double point=7.8;
		return point;
	}
	
	
	public static String getName() {
		String title="일반게시판";
		return title;
	}
	
	public void position(int x, int y) {
		System.out.println("x="+x+" y="+y);
	}//end
}//class end

class A{ // 
	
}
