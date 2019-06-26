package net.itbank.Day0325;

import java.util.Random;
import java.util.Scanner;

public class TestArray3 {

	public static void main(String[] args) {
		//배열은 같은 타입, 크기고정, 첨자는 1부터 시작입니다.
		//배열은 타입[][] 배열=new 타입[2행][4열]

		//추첨중입니다 try{Thread.slep(2000);}catch(Exception ex){};
//		추첨된항목은 떡볶이 입니다. rd.nextInt(숫자)
		//항목 5개 : 김밥 라면 떢볶이 찌개백반 오징어볶음 
		

		int a [][]=new int[2][4];//2행의 4열
		int SIZE = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("배열크기 입력?");
		SIZE=sc.nextInt();
		String menu [] = new String[SIZE];

		Random rd = new Random();
		System.out.print("aaa...");
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.print("bbb...");
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.print("ccc...");
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
	}//main end
}//class end
