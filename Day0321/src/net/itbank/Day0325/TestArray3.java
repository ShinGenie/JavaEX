package net.itbank.Day0325;

import java.util.Random;
import java.util.Scanner;

public class TestArray3 {

	public static void main(String[] args) {
		//�迭�� ���� Ÿ��, ũ�����, ÷�ڴ� 1���� �����Դϴ�.
		//�迭�� Ÿ��[][] �迭=new Ÿ��[2��][4��]

		//��÷���Դϴ� try{Thread.slep(2000);}catch(Exception ex){};
//		��÷���׸��� ������ �Դϴ�. rd.nextInt(����)
		//�׸� 5�� : ��� ��� ������ ���� ��¡��� 
		

		int a [][]=new int[2][4];//2���� 4��
		int SIZE = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭ũ�� �Է�?");
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
