/*
[����]�⵵�� �Է¹޾� ����/��� ���ϱ�
      (����)��,�� �������� �� �����ؾ� ������
 	   ��⵵�� 4��  ������ �������� ��   ����%4==0
	   ��⵵�� 100  ������ �������� �ʰų�  ����%100!=0 ����%400==0
	    �⵵�� 400  ������ �������� ��
      (����)4(����), 100(���), 400(����)�� 



 //�⵵�� 4�� ������ �������� ��
 //�⵵�� 100���γ����� �������� �ʰų�, 
 //�⵵�� 400���� ������ �������� ��	

// �䱸����] ��� ���� �Է¹޾Ƽ� �޷��� ����Ͻÿ�
// 1. �ش� ��,�� �Է�?                            
// 2.  ���ϼ� % 7 = ?(����)
// 3. sum % 7 = 1(��) | sum % 7 = 2(ȭ)
// 4. ������� ã�Ƽ� ����ϱ�
 */

package net.itbank.Day0404;

import java.util.Calendar;
import java.util.*;
import java.util.Scanner;





public class TestCalendar{
	public static void main(String[] args) {
//		int y=2019; //2018���, 2004����, 2012����
//
//		if(((y/100)%4)==0 && (y%4)==0)
//			System.out.println("����~~");
//		else
//			System.out.println("���~~");
//
//		if ( (y%100!=0 || y%400==0)  && (y%4)==0)
//			System.out.println("�����Դϴ�");
//		else
//			System.out.println("����Դϴ�");	
//		
		TestCalendar tc = new TestCalendar();
		tc.getResult();
	}//end


	public void getResult() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�⵵? ");
		int inputYear = sc.nextInt(); // �⵵ �Է�2012
		System.out.print("���Է�? ");
		int inputMonth = sc.nextInt(); // �� �Է�  2

		int totalDays = mDaysY(inputYear) + mDaysM(inputYear, inputMonth); // �� �����
		System.out.println("totalDays="+totalDays);
		int lastDay = mLastDay(inputYear, inputMonth); // ��������
		System.out.println("lastDay="+lastDay);

		System.out.println( ); //%1s�� ���� 1 ����������  ���ڿ��ϳ������ǹ�
		
		// �䱸����] ��� ���� �Է¹޾Ƽ� �޷��� ����Ͻÿ�
		// 1. �ش� ��,�� �Է�?                            
		// 2.  ���ϼ� % 7 = ?(����)
		// 3. sum % 7 = 1(��) | sum % 7 = 2(ȭ)
		// 4. ������� ã�Ƽ� ����ϱ�
		
		
		
		String week[] = {"��\t"+"��\t"+"ȭ\t"+"��\t"+"��\t"+"��\t"+"��"};
		System.out.println( );
		int day[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		int count=0;
		
		int day1=totalDays % 7;
		//�������� day1���� �����Ѵ� 
		
		for(int i=0;i<day.length;i++) {
			for(int j=0;j<7;j++) {
				if(true){System.out.println();}
			}
			
		}
		
//		System.out.printf("%1s�� %1s�� %1sȭ %1s�� %1s�� %1s�� %1s��\n", "  ", "  ", "  ", "  ", "  ","  ", " ");
//		//System.out.printf("%1s�ϰ�%1s��  %1s��\n", "����", "  ", "  ", "  ", "  ","  ", " ");
//
//		for (int j = 1; j <= totalDays % 7; ++j) {
//			System.out.printf("%3s", "");
//		}
//
//		for (int i = 1; i <= lastDay; ++i) {
//			if ((totalDays - 1 + i) % 7 != 6)
//				System.out.printf("%3d", i);
//			else
//				System.out.printf("%3d\n", i);
//		}
//		System.out.println();
	} //getResult end

	public  int mLastDay(int year, int month)  { // �Է³�, ���� ������ ��
		int result = 0;
		switch (month) {
		case 2:
			if (((year/100)%4)==0 && (year%4)==0) {
				result+=29;
			} // ���� 29��
			else {result+=28;} // ��� 28��
		case 4:
		case 6:
		case 9:
		case 11:
			result += 30;
			break;
		default: // 1��, 3��, 5��, 7��, 8��, 10��, 12��
			result += 31;
		}
		return result;
	} // mLastDay end

	//public  int mLastDay(int year, int month){�޼ҵ����� } 
	public  int mDaysM(int year, int month)  { // 1������ ((�Է¿�-1��)+1��)���� �� �����
		int sum = 0;

		for(int j=0;j<month;j++) {	
			int result = 0;
			int result1 = 0;
			switch (month) {
			case 2:
				if (((year/100)%4)==0 && (year%4)==0) {
					result+=29;
				} // ���� 29��
				else {result+=28;} // ��� 28��
			case 4:
			case 6:
			case 9:
			case 11:
				result += 30;
				break;
			default: // 1��, 3��, 5��, 7��, 8��, 10��, 12��
				result1 += 31;
			}
			sum=result+result1;
		}
		return sum; 
		// ī��Ʈ
		//for�ݺ����ȿ�  switch�������
		//���� 29��   sum+=29;
		//���  28��  sum+=28;
		//4,6,9,11 ��   sum+=30;
		//default: // 1��, 3��, 5��, 7��, 8��, 10��, 12��  sum+=31;

	} // mDaysM end

	public  int mDaysY(int year) { // 2000����� (�Է³⵵-1��)���� �� ����� //�Է¿������� ������� �Ѱ����
		int count=0;
		int sum = 0; // ī��Ʈ
		for(int i=0;i<year;i++) {
			count++;
			sum=count;
		}
		return sum;
	} //mDaysY end

	public  int mLeap(int year){ // ���� ���ϱ�
		int result = 0;
		if(((year/100)%4)==0 && (year%4)==0)
			System.out.println("����~~");
		else
			System.out.println("���~~");

		if ( (year%100!=0 || year%400==0)  && (year%4)==0)
			System.out.println("�����Դϴ�");
		else
			System.out.println("����Դϴ�");	
		return result;
	} //mLeap end

	 //�⵵�� 4�� ������ �������� ��
	 //�⵵�� 100���γ����� �������� �ʰų�, 
	 //�⵵�� 400���� ������ �������� ��	

	
	// �䱸����] ��� ���� �Է¹޾Ƽ� �޷��� ����Ͻÿ�
	// 1. �ش� ��,�� �Է�?                            
	// 2.  ���ϼ� % 7 = ?(����)
	// 3. sum % 7 = 1(��) | sum % 7 = 2(ȭ)
	// 4. ������� ã�Ƽ� ����ϱ�
	
	
	public  int Calendar1(int year, int Month){ // ���� ���ϱ�
		TestCalendar tc = new TestCalendar();
		
		
		
		if(((year/100)%4)==0 && (year%4)==0)
			System.out.println("����~~");
		else
			System.out.println("���~~");

		if ( (year%100!=0 || year%400==0)  && (year%4)==0)
			System.out.println("�����Դϴ�");
		else
			System.out.println("����Դϴ�");	
		return 1;
	} //mLeap end
	
	
	
	
}//class END
