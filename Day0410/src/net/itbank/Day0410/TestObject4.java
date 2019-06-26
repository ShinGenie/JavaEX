package net.itbank.Day0410;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestObject4 {
	public static void main(String[] args) {
	
	    Object ob=new Object();	   
	   //getClass()메소드는 클래스소속팩키지 추상클래스는 정보출력X,자식클래스껏로 출력
	   //hashCode( )객체의 일련번호 JVM부여해주는 시퀀스번호 
	   //객체정보를 출력 toString()메소드는 문자열로 정보출력, 
	    Test t1=new Test(9);
	    Object ob2= new Test(9);
	    if(t1.equals(ob2)){System.out.println("같은종류  객체 YESYES");}
	    else {System.out.println("전혀다른종류 객체 노노노");  }
	}//end
}//class END

class Test{ 
	 //Test.java형태없으면 Test.class파일로만 존재
	 //Object클래스 상속을 묵시적으로 받습니다 
	 int a ; //필드
	 public Test() { } //우리가 클래스를 만들때는 기본생성자 
	 public Test(int a) {this.a=a;}
	
	@Override
	public boolean equals(Object obj) {
		boolean ret = this.a==((Test)obj).a ;
		return ret;
	}
	
	@Override
	public String toString() {
		return "a=" +a  ;
	} //end
	
} //class END












