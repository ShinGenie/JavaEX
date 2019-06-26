package net.itbank.Day0326;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestGender {
	//book price note(); 세개 함수로 호출이용

	// 배열 소트하기 
	public static void main(String [] args) {
		
		/*Date dt=new Date();
		Calendar cal=new GregorianCalendar();
		//년도 2019 추출 - (1900+87)
		String jumin="871230-2672514";
				//1,3==> 남자 2,4==>여자
		char gen=jumin.charAt(7);//7번째
		//switch 제어문 성별구별
		System.out.println(jumin);
		switch(gen) {
		case '1':  //case 1 여기서 1은 int 그래서 스트링형으로 
		case '3': System.out.println("남자입니다");break;	
		case '2': 	
		case '4': System.out.println("여자입니다");break;	
		default: System.out.println("알수없습니다");
		} */
		
		String jumin = "875808-2002315";
		char gen = jumin.charAt(7);
		System.out.println(jumin);
		
		
		
		
		
	}//main end
}//class end
