package net.itbank.Day0409;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TsetObject {// ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object ob = new Object();
		String num = String.valueOf("1200");
		Calendar cal = new GregorianCalendar();
		InputStream is = System.in;
		
		//getClass()�޼ҵ�� Ŭ�����Ҽ���Ű��, 
		// �߻�Ŭ������ ������� x , �ڽ�Ŭ���� �� ���
		System.out.println(sc.getClass());
		System.out.println(ob.getClass());
		System.out.println(num.getClass());
		System.out.println(sc.getClass());
		System.out.println(cal.getClass());
		System.out.println(is.getClass());
		//hashcode()��ü�� �Ϸù�ȣ JVM �ο����ִ� ������ ��ȣ
		System.out.println(sc.hashCode());
		System.out.println(ob.hashCode());
		System.out.println(num.hashCode());
		System.out.println(sc.hashCode());
		System.out.println(cal.hashCode());
		System.out.println(is.hashCode());
	}
}//class end
