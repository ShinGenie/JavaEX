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
	   
	   //getClass()�޼ҵ�� Ŭ�����Ҽ���Ű�� �߻�Ŭ������ �������X,�ڽ�Ŭ�������� ���
	   //hashCode( )��ü�� �Ϸù�ȣ JVM�ο����ִ� ��������ȣ 
	   //��ü������ ��� toString()�޼ҵ�� ���ڿ��� �������,   
	   int su=7;
	  	 try {
	  		 su=su/0; //�����ǿ����� �ƴմϴ�. �����߿��� 
	  	 }catch(Exception ex) {
	  		 System.out.println(ex.toString()); //������ 
	  		 System.out.println(ex);
	  	 }
	  	 System.out.print(su+" ");
	  
	}//end
}//class END



