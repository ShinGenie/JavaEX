package net.itbank.Day0329;

import java.text.*;
import java.util.*;


public class TestJumin {


	public static void main(String[] args) {
//		java.util.Date dt=new java.util.Date();
//		java.util.Calendar cal=Java.util.Calendar.getInstance();
		Date dt=new Date();
		Calendar calA=Calendar.getInstance();
		Calendar cal=new GregorianCalendar();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd분 hh:mm:ss");
	
		
		/*Calendar.Year필드, cal.get(calendar.year)
		 *static없음 char리턴값 charAt함수
		 *static없음 String리턴값 substring함수(int시작위치, int끝+1)*/
		
//		String name="아톰";
//		String jumin="871230-3892578";
//		//2019-(1900+87)=나이
//		//12월 30일 생일입니다 substring(int,int)
//		//당신의 성별은 남자입니다 charAt(int)
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("이름: ");
//		name=sc.nextLine();
//		System.out.print("주민번호: ");
//		jumin=sc.nextLine();
//		
//		
//		
//		//나이
//
//		String age=(jumin.substring(0,2));
//		System.out.println("나이는 "+age+"년생 입니다");
//		
//		//성별
//		int gen=jumin.charAt(7);
//		if(gen==3) {
//			System.out.println("남자입니다");
//		}else if(gen==4) {
//			System.out.println("여자입니다");
//		}
//		
//		//생일
		
		String name="아톰";
		String jumin="871230-3892578";
		String msg="";
		char gender='F';
		
		// 성별
		gender=jumin.charAt(7);
		switch(gender) {
			case '1' :
			case '3' : msg="남자"; break;
			case '2' :
			case '4' : msg="여자"; break;
		}
		System.out.println("성별은"+gender+"입니다");
		
		//이름
		
		
		
		//나이
		int nowyear=cal.get(Calendar.YEAR); // 현재 연도
		int age=Integer.parseInt((jumin.substring(0,2)))+1900;
		int realage=nowyear-age;
		System.out.println("나이는 "+realage+" 입니다");
		
		//생일
		String birthM=jumin.substring(2,4);
		String birthD=jumin.substring(4,6);
		System.out.println(birthM+"월 "+birthD+"일 생일입니다");
		
		//주민번호 별찍기
//		int juminCope = -*******;
//		jumin.substring(beginIndex)
		/* String msg="";
		 * */
		
		
		
	}//main end
	

}//class end
