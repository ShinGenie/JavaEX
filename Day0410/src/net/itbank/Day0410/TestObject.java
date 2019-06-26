package net.itbank.Day0410;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestObject {
	public static void main(String[] args) {   
	   //getClass()메소드는 클래스소속팩키지 추상클래스는 정보출력X,자식클래스껏로 출력
	   //hashCode( )객체의 일련번호 JVM부여해주는 시퀀스번호 
	   //객체정보를 출력 toString()메소드는 문자열로 정보출력, 
	   //객체비교 equals( )
	    String x=new String("apple");
	    String y=new String("apple");
	    if(x.equals(y)) { System.out.println("apple같은종류 사과데이터입니다"); }
	    else{ System.out.println("apple다른종류의 사과데이터입니다"); }
	}//end
}//class END













