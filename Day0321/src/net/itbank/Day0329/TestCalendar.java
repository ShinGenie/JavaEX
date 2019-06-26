package net.itbank.Day0329;

import java.text.*;
import java.util.*;


public class TestCalendar {

	public static void main(String[] args) {
//		java.util.Date dt = new java.util.Date();
//		java.util.Calendar cal = Java.util.Calendar.getInstance();
		Date dt = new Date();
		Calendar calA = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd분 hh:mm:ss");
		
		int nowyear = cal.get(Calendar.YEAR);	
		int nowm = cal.get(Calendar.MONTH);
		int nowd = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println();
		System.out.println(nowyear+"년 "+(nowm+1)+"월 "+nowd+"일");
		System.out.println(nowyear+"-"+(nowm+1)+"-"+nowd);
		
		/*calendar 클래스는 추상클래스입니다. void add(int, int)
		추상클래스는 추상매소드가 있다.
		추상매소드는 매소드를 선언만 public void cooking() {}
		칼랜더 클래스에서 년,월,일,시,분, 초 등등 가져올때 리턴값 get(인자)
		칼렌더 클래스의 MONTH 필드는 0부터 시작이라서 +1하고 화면출력*/
		
	}//main end

}//class end
