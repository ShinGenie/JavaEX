package net.itbank.Day0410;

import java.util.Random;

public class TestMath {
	public static void main(String[] args) {
	  double a=4.7, b=9.1, c=67.824, d=67.825;
	  System.out.println(Math.round(a) +"\t" + Math.round(b)); //5  9 �Ҽ�������
	  System.out.println(Math.ceil(a) +"\t" + Math.ceil(b));   //5.0 10.0  ������ �ݿø�
	  System.out.println(Math.floor(a) +"\t" + Math.floor(b)); //4.0  9.0 �Ҽ��� ������
	  System.out.println("sqrt() : "+ Math.sqrt(25));   //5.0 ���� �� 
	  System.out.println("abs() : "+ Math.abs(-34)); //34 ���?
	  System.out.println( );
	  //double c=67.824, d=67.825
	  System.out.printf("c = %.2f\t" , c);  //67.82  �Ҽ��� ���ڸ����� ����Ҷ� �̰� �� ��� printf()
	  System.out.printf("d = %.2f\n" , d);  //67.83
	  
	  int x = (int)(Math.random()*45)+1;//1~45
	  Random rd=new Random();
		int y = rd.nextInt(45)+1;//1~45
		System.out.println();
		System.out.println("����=" + x );
		System.out.println("����=" + y );
		
		System.out.println( );
		int i = 3;
		int j = 4;
		System.out.println("pow�Լ�=" + Math.pow(i, 2)); // �ŵ�������
		System.out.println("pow�Լ�=" + Math.pow(j, 2));
	}//end
}//class END
