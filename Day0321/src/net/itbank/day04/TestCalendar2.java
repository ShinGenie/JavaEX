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

//�������� ��ǰ
public class TestCalendar2{
private static final int[] MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) throws Exception {
		 Scanner scan = new Scanner(System.in);
		 
	    System.out.print("�⵵? ");
	    int inputYear = scan.nextInt(); // �⵵ �Է�2017
	    System.out.printf("���Է�? ");
	    int inputMonth =scan.nextInt(); // �� �Է�

		TestCalendar2 tc2 = new TestCalendar2();
		//tc2.printCalendar(2019, 4);
		tc2.printCalendar(inputYear,inputMonth );
	}
	
	public void printCalendar(int year, int month) throws Exception
	{
		if(year < 1900)
			throw new Exception("1900�� ������ �޷¸� ����� �� �ֽ��ϴ�.");

		int totalDays = 0;
		
		for(int y = 1900 ; y < year ; y++)
			totalDays += getTotalDaysInYear(y);
		
		//����� �� �������� �� ���� ���մϴ�. �׷��� month - 1�Դϴ�.
		totalDays += getTotalDaysInMonth(year, month - 1);
		
		System.out.println("\n======================" + year + "�� " + month + "��======================");
		System.out.println("Sun\tMon\tTue\tWen\tThu\tFri\tSat");
		
		int startDayCount = (totalDays + 1) % 7;
		
		for(int i = 0 ; i < startDayCount ; i++)
			System.out.print("\t");
		
		
		int lastDay = getLastDay(year, month);
		
		for(int day = 1 ; day <= lastDay ; day++)		{
			System.out.printf("%2d\t", day);
			totalDays ++;
			
			if((totalDays + 1) % 7 == 0)
				System.out.println();
		}
	}
	
	public int getTotalDaysInYear(int year)	{
		boolean isLeapYear = isLeapYear(year);
		
		if(isLeapYear == true)
			return 366;
		
		else
			return 365;
	}
	
	public int getTotalDaysInMonth(int year, int month)	{
		int totalMonth = 0;
		
		for(int m = 1 ; m <= month ; m++)
			totalMonth += getLastDay(year, m);
		
		return totalMonth;
	}
	
	public int getLastDay(int year, int month)	{
		int lastDay = 0;
		
		try	{
			if(month == 2)
			{
				boolean isLeapYear = isLeapYear(year);
				
				if(isLeapYear == true)
					lastDay = 29;
				
				else
					lastDay = 28;
			}
			
			else
				lastDay = MONTHS[month - 1];

			return lastDay;
			
		}catch(IndexOutOfBoundsException e){
			throw new IndexOutOfBoundsException("���� 1�� ~ 12�� ���̸� �����մϴ�. �Էµ� �� : " + month);
		}
	}
	
	public boolean isLeapYear(int year)	{
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
					return true;
				
				else
					return false;
			}
			else
				return true;
		}
		else
			return false;
	}//end
}//class ED