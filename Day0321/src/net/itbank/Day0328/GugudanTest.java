package net.itbank.Day0328;

import java.util.Scanner;

public class GugudanTest {

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
	}//end
	
}//class end
