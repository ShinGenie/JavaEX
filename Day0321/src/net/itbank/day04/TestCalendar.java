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

public class TestCalendar{
	public static void main(String[] args) {
		TestCalendar ct =new TestCalendar();
		ct.getResult();
	}//main end
	
	public void getResult() {
	    Scanner scan = new Scanner(System.in);
	 
	    System.out.print("년도? ");
	    int inputYear = scan.nextInt(); // 년도 입력2017
	    System.out.printf("월입력? ");
	    int inputMonth =scan.nextInt(); // 월 입력
	 
	    int totalDays = mDaysY(inputYear) + mDaysM(inputYear, inputMonth); // 총경과일
	    System.out.println("mDaysY="+mDaysY(inputYear));
	    System.out.println("mDaysM="+mDaysM(inputYear, inputMonth));
	    System.out.println("totalDays="+totalDays);
	    int lastDay = mLastDay(inputYear, inputMonth); // 마지막날
	    System.out.println("mLastDay="+lastDay);
	 
	    System.out.println( ); //%1s일 에서 1 생략가능함  문자열하나공간의미
	    System.out.printf("%1s일  %1s월  %1s화  %1s수 %1s목 %1s금  %1s토\n", "  ", "  ", "  ", "  ", "  ","  ", " ");
	 	//System.out.printf("%1s일공%1s월  %1s토\n", "공공", "  ", "  ", "  ", "  ","  ", " ");

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
 
	public  int mLastDay(int year, int month)  { // 입력년, 월의 마지막 날
	    int result = 0;
	    switch (month) {
	    case 2:
	        if (mLeap(year) == 1) {
	            result += 29;
	            break;
	        } // 윤년 29일
	        else {
	            result += 28;
	            break;
	        } // 평년 28일
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
	 
	public  int mDaysM(int year, int month)  { // 1월부터 ((입력월-1월)+1일)까지 총 경과일
	    int sum = 0; // 카운트
	    for (int i = 1; i < month; ++i) // 입력월까지 루프
	    {
	        switch(i){
	        case 2:
	            if (mLeap(year) == 1) {
	                sum += 29;
	                break;
	            } // 윤년이면 29일
	            else {
	                sum += 28;
	                break;
	            } // 평년은 28일
	        case 4:
	        case 6:
	        case 9:
	        case 11:
	            sum += 30;
	            break;
	        default: // 1월, 3월, 5월, 7월, 8월, 10월, 12월
	            sum += 31;
	        }
	    }
	    return sum + 1;
	} // mDaysM end
	 
	public  int mDaysY(int year) { // ad010101부터 (입력년도-1년)까지 총 경과일
	    int sum = 0; // 카운트
	    for (int i = 1; i <year; ++i) // 총 경과일 수 중 지난년도까지 계산
	    {
	        sum += 365; // 여기까지가 365*(입력년도-1)
	        if (mLeap(i) == 1)
	            sum += 1; // 윤년일때 += 1
	    }
	    return sum;
	} //mDaysY end
 
	public  int mLeap(int year){ // 윤년 구하기
	    int result = 0;
	    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	        result = 1;
	    else
	        result = 0; // 1==윤년, 0==평년
	    return result;
	} //mLeap end
 
}// TestCalendar  class END






