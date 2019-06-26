package net.itbank.Day0402;

public abstract class Game {
	//추상메소드가 하나라도 있으면 자동 추상클래스
	//추상클래스는 new연산자 사용하면 에러발생 *중요*
	public abstract int dbCount();//추상메소드
	public abstract String map();//추상메소드
	public abstract void add(int a, int b);//추상메소드
	public void plan() {}//일반 메소드 
	
}//class end