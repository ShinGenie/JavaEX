package net.itbank.Day0410;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestObject3 {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   Object ob=new Object();
	   String num=String.valueOf(1200);
	   Calendar cal=Calendar.getInstance();
	   InputStream is=System.in;
	   
	   //getClass()메소드는 클래스소속팩키지 추상클래스는 정보출력X,자식클래스껏로 출력
	   //hashCode( )객체의 일련번호 JVM부여해주는 시퀀스번호 
	   //객체정보를 출력 toString()메소드는 문자열로 정보출력,   
	   int su=7;
	  	 try {
	  		 su=su/0; //문법의에러는 아닙니다. 실행중에러 
	  	 }catch(Exception ex) {
	  		 System.out.println(ex.toString()); //더권장 
	  		 System.out.println(ex);
	  	 }
	  	 System.out.print(su+" ");
	  
	}//end
}//class END



