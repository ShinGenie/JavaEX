/*
[문제]년도를 입력받아 윤년/평년 구하기
      (공식)①,② 두조건을 다 만족해야 윤년임
 	   ①년도를 4로  나누어 떨어져야 함   연도%4==0
	   ②년도를 100  나누어 떨어지지 않거나  연도%100!=0 연도%400==0
	    년도를 400  나누어 떨어져야 함
      (참고)4(윤년), 100(평년), 400(윤년)임 



 //년도를 4로 나누어 떨어져야 함
 //년도를 100으로나누어 떨어지지 않거나, 
 //년도를 400으로 나누어 떨어져야 함	

// 요구사항] 년과 월을 입력받아서 달력을 출력하시오
// 1. 해당 년,월 입력?                            
// 2.  총일수 % 7 = ?(요일)
// 3. sum % 7 = 1(월) | sum % 7 = 2(화)
// 4. 윤년공식 찾아서 기술하기
 */

package net.itbank.Day0404;

import java.util.Calendar;
import java.util.*;
import java.util.Scanner;





public class TestCalendar{
	public static void main(String[] args) {
//		int y=2019; //2018평년, 2004윤년, 2012윤년
//
//		if(((y/100)%4)==0 && (y%4)==0)
//			System.out.println("윤년~~");
//		else
//			System.out.println("평년~~");
//
//		if ( (y%100!=0 || y%400==0)  && (y%4)==0)
//			System.out.println("윤년입니다");
//		else
//			System.out.println("평년입니다");	
//		
		TestCalendar tc = new TestCalendar();
		tc.getResult();
	}//end


	public void getResult() {
		Scanner sc = new Scanner(System.in);

		System.out.print("년도? ");
		int inputYear = sc.nextInt(); // 년도 입력2012
		System.out.print("월입력? ");
		int inputMonth = sc.nextInt(); // 월 입력  2

		int totalDays = mDaysY(inputYear) + mDaysM(inputYear, inputMonth); // 총 경과일
		System.out.println("totalDays="+totalDays);
		int lastDay = mLastDay(inputYear, inputMonth); // 마지막날
		System.out.println("lastDay="+lastDay);

		System.out.println( ); //%1s일 에서 1 생략가능함  문자열하나공간의미
		
		// 요구사항] 년과 월을 입력받아서 달력을 출력하시오
		// 1. 해당 년,월 입력?                            
		// 2.  총일수 % 7 = ?(요일)
		// 3. sum % 7 = 1(월) | sum % 7 = 2(화)
		// 4. 윤년공식 찾아서 기술하기
		
		
		
		String week[] = {"일\t"+"월\t"+"화\t"+"수\t"+"목\t"+"금\t"+"토"};
		System.out.println( );
		int day[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		int count=0;
		
		int day1=totalDays % 7;
		//시작점을 day1으로 들어가야한다 
		
		for(int i=0;i<day.length;i++) {
			for(int j=0;j<7;j++) {
				if(true){System.out.println();}
			}
			
		}
		
//		System.out.printf("%1s일 %1s월 %1s화 %1s수 %1s목 %1s금 %1s토\n", "  ", "  ", "  ", "  ", "  ","  ", " ");
//		//System.out.printf("%1s일공%1s월  %1s토\n", "공공", "  ", "  ", "  ", "  ","  ", " ");
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

	public  int mLastDay(int year, int month)  { // 입력년, 월의 마지막 날
		int result = 0;
		switch (month) {
		case 2:
			if (((year/100)%4)==0 && (year%4)==0) {
				result+=29;
			} // 윤년 29일
			else {result+=28;} // 평년 28일
		case 4:
		case 6:
		case 9:
		case 11:
			result += 30;
			break;
		default: // 1월, 3월, 5월, 7월, 8월, 10월, 12월
			result += 31;
		}
		return result;
	} // mLastDay end

	//public  int mLastDay(int year, int month){메소드참고 } 
	public  int mDaysM(int year, int month)  { // 1월부터 ((입력월-1월)+1일)까지 총 경과일
		int sum = 0;

		for(int j=0;j<month;j++) {	
			int result = 0;
			int result1 = 0;
			switch (month) {
			case 2:
				if (((year/100)%4)==0 && (year%4)==0) {
					result+=29;
				} // 윤년 29일
				else {result+=28;} // 평년 28일
			case 4:
			case 6:
			case 9:
			case 11:
				result += 30;
				break;
			default: // 1월, 3월, 5월, 7월, 8월, 10월, 12월
				result1 += 31;
			}
			sum=result+result1;
		}
		return sum; 
		// 카운트
		//for반복문안에  switch제어문권장
		//윤년 29일   sum+=29;
		//평년  28일  sum+=28;
		//4,6,9,11 월   sum+=30;
		//default: // 1월, 3월, 5월, 7월, 8월, 10월, 12월  sum+=31;

	} // mDaysM end

	public  int mDaysY(int year) { // 2000년부터 (입력년도-1년)까지 총 경과일 //입력연도부터 현재까지 총경과일
		int count=0;
		int sum = 0; // 카운트
		for(int i=0;i<year;i++) {
			count++;
			sum=count;
		}
		return sum;
	} //mDaysY end

	public  int mLeap(int year){ // 윤년 구하기
		int result = 0;
		if(((year/100)%4)==0 && (year%4)==0)
			System.out.println("윤년~~");
		else
			System.out.println("평년~~");

		if ( (year%100!=0 || year%400==0)  && (year%4)==0)
			System.out.println("윤년입니다");
		else
			System.out.println("평년입니다");	
		return result;
	} //mLeap end

	 //년도를 4로 나누어 떨어져야 함
	 //년도를 100으로나누어 떨어지지 않거나, 
	 //년도를 400으로 나누어 떨어져야 함	

	
	// 요구사항] 년과 월을 입력받아서 달력을 출력하시오
	// 1. 해당 년,월 입력?                            
	// 2.  총일수 % 7 = ?(요일)
	// 3. sum % 7 = 1(월) | sum % 7 = 2(화)
	// 4. 윤년공식 찾아서 기술하기
	
	
	public  int Calendar1(int year, int Month){ // 윤년 구하기
		TestCalendar tc = new TestCalendar();
		
		
		
		if(((year/100)%4)==0 && (year%4)==0)
			System.out.println("윤년~~");
		else
			System.out.println("평년~~");

		if ( (year%100!=0 || year%400==0)  && (year%4)==0)
			System.out.println("윤년입니다");
		else
			System.out.println("평년입니다");	
		return 1;
	} //mLeap end
	
	
	
	
}//class END
