package net.itbank.Day0410;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestObject2 { //����
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   Object ob=new Object();
	   String num=String.valueOf(1200);
	   Calendar cal=Calendar.getInstance();
	   InputStream is=System.in;
	   
	   //getClass()�޼ҵ�� Ŭ�����Ҽ���Ű�� �߻�Ŭ������ �������X,�ڽ�Ŭ�������� ���
	   System.out.println(sc.getClass());
	   System.out.println(ob.getClass());
	   System.out.println(num.getClass());  
	   System.out.println(cal.getClass());  
	   System.out.println(is.getClass()); 
	   System.out.println();
	   
	   //hashCode( )��ü�� �Ϸù�ȣ JVM�ο����ִ� ��������ȣ 
	   System.out.println(sc.hashCode() );
	   System.out.println(ob.hashCode() );
	   System.out.println(num.hashCode() );
	   System.out.println(cal.hashCode() );
	   System.out.println(is.hashCode() );
	   
	   //��ü������ ��� ��Ű��Ŭ����+@��������
	   System.out.println();
	   System.out.println(sc.toString());
	   System.out.println(ob.toString());
	   System.out.println(num.toString());
	   System.out.println(cal.toString());
	   System.out.println(is.toString());
	}//end
}//class END
