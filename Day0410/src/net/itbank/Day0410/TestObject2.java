package net.itbank.Day0410;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestObject2 { //원본
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   Object ob=new Object();
	   String num=String.valueOf(1200);
	   Calendar cal=Calendar.getInstance();
	   InputStream is=System.in;
	   
	   //getClass()메소드는 클래스소속팩키지 추상클래스는 정보출력X,자식클래스껏로 출력
	   System.out.println(sc.getClass());
	   System.out.println(ob.getClass());
	   System.out.println(num.getClass());  
	   System.out.println(cal.getClass());  
	   System.out.println(is.getClass()); 
	   System.out.println();
	   
	   //hashCode( )객체의 일련번호 JVM부여해주는 시퀀스번호 
	   System.out.println(sc.hashCode() );
	   System.out.println(ob.hashCode() );
	   System.out.println(num.hashCode() );
	   System.out.println(cal.hashCode() );
	   System.out.println(is.hashCode() );
	   
	   //객체정보를 출력 팩키지클래스+@숫자조합
	   System.out.println();
	   System.out.println(sc.toString());
	   System.out.println(ob.toString());
	   System.out.println(num.toString());
	   System.out.println(cal.toString());
	   System.out.println(is.toString());
	}//end
}//class END
