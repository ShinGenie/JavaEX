package net.itbank.Day0325;

import java.util.Random;
import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;//1���� 10������ �� Math.random()�� 0.0~0.999 ������ ��
		int cnt=0, my=0; // count==cnt
		//		System.out.println("������ǻ�� ����="+com);//�ּ�ó��


		while(true) {
			cnt++;
			try {
				System.out.print(cnt+"ȸ �����Է�: ");
				my=Integer.parseInt(sc.nextLine()); //sc.nextLine()�Լ���� ����

				if(com>my) {
					System.out.println("   "+my+"���ڴ� ���亸�� �������Դϴ�");
				}else if(com<my) { 
					System.out.println("   "+my+"���ڴ� ���亸�� ū���Դϴ�");
				}
				if(cnt==5) {
					System.out.println("����Ƚ���� 5ȸ�Դϴ�\n���� ��ȸ�� �̿����ּ���");
					break;
				}
			}catch(Exception e) {System.out.println("�����Է����ּ���");};
		}
		System.out.println("\n������ǻ�� ����="+com);

		if(my==com) {System.out.println("���߼̽��ϴ�");}
		if(!(my==com)) {System.out.println("\n������ȸ�� �õ����ּ���");}

	}//main end
}//class end
