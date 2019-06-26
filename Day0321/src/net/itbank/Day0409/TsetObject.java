package net.itbank.Day0409;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TsetObject {// 원본
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object ob = new Object();
		String num = String.valueOf("1200");
		Calendar cal = new GregorianCalendar();
		InputStream is = System.in;
		
		//getClass()메소드는 클래스소속패키지, 
		// 추상클래스는 정보출력 x , 자식클래스 것 출력
		System.out.println(sc.getClass());
		System.out.println(ob.getClass());
		System.out.println(num.getClass());
		System.out.println(sc.getClass());
		System.out.println(cal.getClass());
		System.out.println(is.getClass());
		//hashcode()객체의 일련번호 JVM 부여해주는 시퀸스 번호
		System.out.println(sc.hashCode());
		System.out.println(ob.hashCode());
		System.out.println(num.hashCode());
		System.out.println(sc.hashCode());
		System.out.println(cal.hashCode());
		System.out.println(is.hashCode());
	}
}//class end
