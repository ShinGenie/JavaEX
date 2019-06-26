package net.itbank.Day0328;

import java.util.Scanner;

public class GugudanTest {

	public int input() { // non-static 리턴값없음 // 메인함수가 아니어서 단독 출력이 안됨
			System.out.println("단입력?");
			Scanner sc=new Scanner(System.in);
			int dan=0;
			dan=sc.nextInt();
			return dan;
	}//end
	
	public void output(int dan) { // non-static 매개인자 있음 리턴값없음 // 메인함수가 아니어서 단독 출력이 안됨
		for(int i=1;i<10;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}//end
	
}//class end
