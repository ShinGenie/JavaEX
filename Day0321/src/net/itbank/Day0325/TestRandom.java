package net.itbank.Day0325;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// 함수=메소드=method에서 맨 왼쪽 static 키워드가 있으면 클래스이름.메소드()접근
		// java.util 패키지의 Random 클래스 nextInt()
		//
		Random r = new Random();
		//우리가 원하는 숫자는 1~5사이 숫자 
		int a = r.nextInt(9)+1;//0~(최대값-1),숫자가 범위
		int b = r.nextInt(2)+1; // 숫자가 범위
		int c = r.nextInt(10)+1;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		double f=(Math.random()*10)+1;
		int su=(int)(Math.random()*10)+1;//1에서 10사이의 수 Math.random()은 0.0~0.999 사이의 값
		System.out.println("f="+f);
		System.out.println("su="+su);
		
	}//main end
}//class end
