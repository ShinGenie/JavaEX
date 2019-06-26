package net.itbank.Day0328;

import java.util.Arrays;
import java.util.Scanner;

public class AATest {

	public static void main(String[] args) { // static 영역  // 메인함수는 무조건 static으로 간다
	//로또클래스의 auto메소드 
	Lotto lt = new Lotto();
	int su[] = lt.auto();
	System.out.println(Arrays.toString(su));
	}//main end
	
}//AATest class end
