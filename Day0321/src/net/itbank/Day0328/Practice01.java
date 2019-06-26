package net.itbank.Day0328;

import java.util.Scanner;

class GugudanPractice {

}

public class Practice01 {
	public static void main(String[] args) {	
		Practice02 pr = new Practice02();
		int a= pr.input();
		pr.output(a);
		GugudanTest gt = new GugudanTest();
		int b = gt.input();
		gt.output(b);
		Book bk = new Book();
		bk.book();
		System.out.println("책 제목은"+bk.book()+"입니다");
	}

}//end

class Practice02{ 

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
	}
}



