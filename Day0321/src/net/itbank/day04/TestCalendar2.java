/*
[문제]년도를 입력받아 윤년/평년 구하기
      (공식)①,② 두조건을 다 만족해야 윤년임
 	   ①년도를 4로  나누어 떨어져야 함
	   ②년도를 100  나누어 떨어지지 않거나
	       년도를 400  나누어 떨어져야 함
      (참고)4(윤년), 100(평년), 400(윤년)임 


 //년도를 4로 나누어 떨어져야 함
 //년도를 100으로나누어 떨어지지 않거나, 
 //년도를 400으로 나누어 떨어져야 함	
 
// 요구사항] 년과 월을 입력받아서 달력을 출력하시오
// 1.  해당 년,월 입력? 
// 2.  총일수 % 7 = ?(요일)
// 3.  sum % 7 = 1(월) | sum % 7 = 2(화)
// 4.  윤년공식 찾아서 기술하기
*/

package net.itbank.day04;

import java.util.Scanner;

//최유진씨 작품
public class TestCalendar2{
private static final int[] MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) throws Exception {
		 Scanner scan = new Scanner(System.in);
		 
	    System.out.print("년도? ");
	    int inputYear = scan.nextInt(); // 년도 입력2017
	    System.out.printf("월입력? ");
	    int inputMonth =scan.nextInt(); // 월 입력

		TestCalendar2 tc2 = new TestCalendar2();
		//tc2.printCalendar(2019, 4);
		tc2.printCalendar(inputYear,inputMonth );
	}
	
	public void printCalendar(int year, int month) throws Exception
	{
		if(year < 1900)
			throw new Exception("1900년 이후의 달력만 출력할 수 있습니다.");

		int totalDays = 0;
		
		for(int y = 1900 ; y < year ; y++)
			totalDays += getTotalDaysInYear(y);
		
		//출력할 월 직전까지 총 합을 구합니다. 그래서 month - 1입니다.
		totalDays += getTotalDaysInMonth(year, month - 1);
		
		System.out.println("\n======================" + year + "년 " + month + "월======================");
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
			throw new IndexOutOfBoundsException("월은 1월 ~ 12월 사이만 가능합니다. 입력된 월 : " + month);
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