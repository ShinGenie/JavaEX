package net.itbank.Day0325;

import java.util.Random;
import java.util.Scanner;

public class TestArrayLunch {

	public static void main(String[] args) {
		//�迭�� ���� Ÿ��, ũ�����, ÷�ڴ� 1���� �����Դϴ�.
		//�迭�� Ÿ��[][] �迭=new Ÿ��[2��][4��]

////	�迭�� �̿��� ���ɸ޴� ���� 
////		//�׸� 5�� : ��� ��� ������ ���� ��¡��� 
//		//��÷���Դϴ� try{Thread.slep(2000);}catch(Exception ex){};
//		��÷���׸��� ������ �Դϴ�. rd.nextInt(����)
		
		String menu[]= {"1��:������","2��:����","3��:�̸�","4��:���","5��:Į����"};
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭ũ�� �Է�?");
		int num=Integer.parseInt(sc.nextLine());

		Random rd = new Random();
		int select=rd.nextInt(5);
		
		System.out.print("��÷���Դϴ�...");
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		System.out.print("��÷���Դϴ�...");
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		System.out.println("��÷���Դϴ�...");
		try {Thread.sleep(1000);} catch (InterruptedException e) {}

		System.out.println("��÷�� �׸��� "+menu[select]+" �Դϴ�");
		
	}//main end
}//class end
