package net.itbank.Day0410;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestObject {
	public static void main(String[] args) {   
	   //getClass()�޼ҵ�� Ŭ�����Ҽ���Ű�� �߻�Ŭ������ �������X,�ڽ�Ŭ�������� ���
	   //hashCode( )��ü�� �Ϸù�ȣ JVM�ο����ִ� ��������ȣ 
	   //��ü������ ��� toString()�޼ҵ�� ���ڿ��� �������, 
	   //��ü�� equals( )
	    String x=new String("apple");
	    String y=new String("apple");
	    if(x.equals(y)) { System.out.println("apple�������� ����������Դϴ�"); }
	    else{ System.out.println("apple�ٸ������� ����������Դϴ�"); }
	}//end
}//class END













