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
		System.out.println("å ������"+bk.book()+"�Դϴ�");
	}

}//end

class Practice02{ 

	public int input() { // non-static ���ϰ����� // �����Լ��� �ƴϾ �ܵ� ����� �ȵ�
		System.out.println("���Է�?");
		Scanner sc=new Scanner(System.in);
		int dan=0;
		dan=sc.nextInt();
		return dan;
	}//end

	public void output(int dan) { // non-static �Ű����� ���� ���ϰ����� // �����Լ��� �ƴϾ �ܵ� ����� �ȵ�
		for(int i=1;i<10;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
}



