package net.itbank.Day0325;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// �Լ�=�޼ҵ�=method���� �� ���� static Ű���尡 ������ Ŭ�����̸�.�޼ҵ�()����
		// java.util ��Ű���� Random Ŭ���� nextInt()
		//
		Random r = new Random();
		//�츮�� ���ϴ� ���ڴ� 1~5���� ���� 
		int a = r.nextInt(9)+1;//0~(�ִ밪-1),���ڰ� ����
		int b = r.nextInt(2)+1; // ���ڰ� ����
		int c = r.nextInt(10)+1;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		double f=(Math.random()*10)+1;
		int su=(int)(Math.random()*10)+1;//1���� 10������ �� Math.random()�� 0.0~0.999 ������ ��
		System.out.println("f="+f);
		System.out.println("su="+su);
		
	}//main end
}//class end
