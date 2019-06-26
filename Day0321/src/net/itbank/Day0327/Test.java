package net.itbank.Day0327;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
	PrintStream ps=System.out; // java.io.Printstream 안에 in out err 가 있고 
	ps.println("이름=신진이"); // println은 System.out 에 있는게 아니라 PrintStream 소속이다
	System.out.println("나이=10살");
	System.out.println("주소=종로구");
	System.out.println("베프=김은희");
	System.out.println("간식=과자");
	int a = Calendar.YEAR;
	InputStream is=System.in;
	Scanner sc = new Scanner(System.in);
	String name=sc.nextLine();
	// 참고로 java.lang 패키지는 기본패키지라서 import 생략가능
	// static 키워드가 있으면 직접 접근 가능 - 필드 전역변수 접근하는 방법
	int b = sc.nextInt();
	
	
	//
	}//main end
}//class end
