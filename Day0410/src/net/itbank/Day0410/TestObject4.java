package net.itbank.Day0410;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestObject4 {
	public static void main(String[] args) {
	
	    Object ob=new Object();	   
	   //getClass()�޼ҵ�� Ŭ�����Ҽ���Ű�� �߻�Ŭ������ �������X,�ڽ�Ŭ�������� ���
	   //hashCode( )��ü�� �Ϸù�ȣ JVM�ο����ִ� ��������ȣ 
	   //��ü������ ��� toString()�޼ҵ�� ���ڿ��� �������, 
	    Test t1=new Test(9);
	    Object ob2= new Test(9);
	    if(t1.equals(ob2)){System.out.println("��������  ��ü YESYES");}
	    else {System.out.println("�����ٸ����� ��ü ����");  }
	}//end
}//class END

class Test{ 
	 //Test.java���¾����� Test.class���Ϸθ� ����
	 //ObjectŬ���� ����� ���������� �޽��ϴ� 
	 int a ; //�ʵ�
	 public Test() { } //�츮�� Ŭ������ ���鶧�� �⺻������ 
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












