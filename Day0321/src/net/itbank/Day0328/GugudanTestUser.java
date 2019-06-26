package net.itbank.Day0328;

import java.util.Scanner;

public class GugudanTestUser {

	public static void main(String[] args) { // static 영역  // 메인함수는 무조건 static으로 간다
	
		System.out.println("GugudanTest 테스트 클래스");
		System.out.println("");
		
		//테스트에서 호출 input 메소드 output 메소드
		GugudanTest gt = new GugudanTest();
		int su=gt.input();
		gt.output(su);
	}//main end
}//class end
