package net.itbank.Day0402;

import java.io.InputStream;
import java.util.*;

public class Test {
	public static void main(String[]args) {
		//Father 클래스 상속 및 개별적으로 객체화작업 가능
		//Mother 클래스 상속 및 개별적으로 객체화작업 가능
		//추상클래스는 상속가능, 개별적 객체화작업 에러발생
		Father john = new Father();
		Mother hee = new Mother();
//		Game gg = new Game(); // 이하 3개 메소드는  new 키워드로 객체화작업 x
//		Calendar cal = new Calendar(); // abstract 메소드여서 안됨.
//		InputStream is = new InputStream();// abstract 메소드여서 안됨.
	}//end
}//class end
