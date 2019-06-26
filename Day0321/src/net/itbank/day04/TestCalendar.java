/*
[����]�⵵�� �Է¹޾� ����/��� ���ϱ�
      (����)��,�� �������� �� �����ؾ� ������
 	   ��⵵�� 4��  ������ �������� ��
	   ��⵵�� 100  ������ �������� �ʰų�
	       �⵵�� 400  ������ �������� ��
      (����)4(����), 100(���), 400(����)�� 


 //�⵵�� 4�� ������ �������� ��
 //�⵵�� 100���γ����� �������� �ʰų�, 
 //�⵵�� 400���� ������ �������� ��	
 
// �䱸����] ��� ���� �Է¹޾Ƽ� �޷��� ����Ͻÿ�
// 1.  �ش� ��,�� �Է�? 
// 2.  ���ϼ� % 7 = ?(����)
// 3.  sum % 7 = 1(��) | sum % 7 = 2(ȭ)
// 4.  ������� ã�Ƽ� ����ϱ�
*/

package net.itbank.day04;

import java.util.Scanner;

public class TestCalendar{
	public static void main(String[] args) {
		TestCalendar ct =new TestCalendar();
		ct.getResult();
	}//main end
	
	public void getResult() {
	    Scanner scan = new Scanner(System.in);
	 
	    System.out.print("�⵵? ");
	    int inputYear = scan.nextInt(); // �⵵ �Է�2017
	    System.out.printf("���Է�? ");
	    int inputMonth =scan.nextInt(); // �� �Է�
	 
	    int totalDays = mDaysY(inputYear) + mDaysM(inputYear, inputMonth); // �Ѱ����
	    System.out.println("mDaysY="+mDaysY(inputYear));
	    System.out.println("mDaysM="+mDaysM(inputYear, inputMonth));
	    System.out.println("totalDays="+totalDays);
	    int lastDay = mLastDay(inputYear, inputMonth); // ��������
	    System.out.println("mLastDay="+lastDay);
	 
	    System.out.println( ); //%1s�� ���� 1 ����������  ���ڿ��ϳ������ǹ�
	    System.out.printf("%1s��  %1s��  %1sȭ  %1s�� %1s�� %1s��  %1s��\n", "  ", "  ", "  ", "  ", "  ","  ", " ");
	 	//System.out.printf("%1s�ϰ�%1s��  %1s��\n", "����", "  ", "  ", "  ", "  ","  ", " ");

	    for (int j = 1; j <= totalDays % 7; ++j) {
	        System.out.printf("%3s", "");
	    }
	 
	    for (int i = 1; i <= lastDay; ++i) {
	        if ((totalDays - 1 + i) % 7 != 6)
	            System.out.printf("%3d", i);
	        else
	            System.out.printf("%3d\n", i);
	    }
	    System.out.println();
	 } //getResult end
 
	public  int mLastDay(int year, int month)  { // �Է³�, ���� ������ ��
	    int result = 0;
	    switch (month) {
	    case 2:
	        if (mLeap(year) == 1) {
	            result += 29;
	            break;
	        } // ���� 29��
	        else {
	            result += 28;
	            break;
	        } // ��� 28��
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
	 
	public  int mDaysM(int year, int month)  { // 1������ ((�Է¿�-1��)+1��)���� �� �����
	    int sum = 0; // ī��Ʈ
	    for (int i = 1; i < month; ++i) // �Է¿����� ����
	    {
	        switch(i){
	        case 2:
	            if (mLeap(year) == 1) {
	                sum += 29;
	                break;
	            } // �����̸� 29��
	            else {
	                sum += 28;
	                break;
	            } // ����� 28��
	        case 4:
	        case 6:
	        case 9:
	        case 11:
	            sum += 30;
	            break;
	        default: // 1��, 3��, 5��, 7��, 8��, 10��, 12��
	            sum += 31;
	        }
	    }
	    return sum + 1;
	} // mDaysM end
	 
	public  int mDaysY(int year) { // ad010101���� (�Է³⵵-1��)���� �� �����
	    int sum = 0; // ī��Ʈ
	    for (int i = 1; i <year; ++i) // �� ����� �� �� �����⵵���� ���
	    {
	        sum += 365; // ��������� 365*(�Է³⵵-1)
	        if (mLeap(i) == 1)
	            sum += 1; // �����϶� += 1
	    }
	    return sum;
	} //mDaysY end
 
	public  int mLeap(int year){ // ���� ���ϱ�
	    int result = 0;
	    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	        result = 1;
	    else
	        result = 0; // 1==����, 0==���
	    return result;
	} //mLeap end
 
}// TestCalendar  class END






