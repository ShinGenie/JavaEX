package net.itbank.Day0328;

import java.util.Scanner;

public class GugudanTestUser {

	public static void main(String[] args) { // static ����  // �����Լ��� ������ static���� ����
	
		System.out.println("GugudanTest �׽�Ʈ Ŭ����");
		System.out.println("");
		
		//�׽�Ʈ���� ȣ�� input �޼ҵ� output �޼ҵ�
		GugudanTest gt = new GugudanTest();
		int su=gt.input();
		gt.output(su);
	}//main end
}//class end
