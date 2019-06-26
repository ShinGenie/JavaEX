package net.itbank.Day0325;

import java.util.Random;
import java.util.Scanner;

public class TestArrayLunch {

	public static void main(String[] args) {
		//배열은 같은 타입, 크기고정, 첨자는 1부터 시작입니다.
		//배열은 타입[][] 배열=new 타입[2행][4열]

////	배열을 이용한 점심메뉴 선택 
////		//항목 5개 : 김밥 라면 떢볶이 찌개백반 오징어볶음 
//		//추첨중입니다 try{Thread.slep(2000);}catch(Exception ex){};
//		추첨된항목은 떡볶이 입니다. rd.nextInt(숫자)
		
		String menu[]= {"1번:떡볶이","2번:순대","3번:쫄면","4번:라면","5번:칼국수"};
		Scanner sc = new Scanner(System.in);
		System.out.println("배열크기 입력?");
		int num=Integer.parseInt(sc.nextLine());

		Random rd = new Random();
		int select=rd.nextInt(5);
		
		System.out.print("추첨중입니다...");
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		System.out.print("추첨중입니다...");
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		System.out.println("추첨중입니다...");
		try {Thread.sleep(1000);} catch (InterruptedException e) {}

		System.out.println("추첨된 항목은 "+menu[select]+" 입니다");
		
	}//main end
}//class end
