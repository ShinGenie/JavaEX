package net.itbank.Day0329;

import java.text.*;
import java.util.*;


public class TestString {

	public static void main(String[] args) {
//		java.util.Date dt = new java.util.Date();
//		java.util.Calendar cal = Java.util.Calendar.getInstance();
		Date dt = new Date();
		Calendar calA = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
	
		String fruit="blue mango Berry";
		String a=fruit.toLowerCase(); System.out.println(a);
		String b=fruit.toUpperCase(); System.out.println(b);
		String c=fruit.replaceAll("mango","apple");
				System.out.println(c);
		String d=fruit.replaceAll("e","KS");
				System.out.println(d);

		fruit="wberry orange apple";
		int size=fruit.length();
		
		System.out.println(fruit);
		/*static����  char���ϰ�     charAt�Լ�(int)
		  static����  String���ϰ� substring�Լ�(int,int)
		  ���ڿ� ������ 0��°, �迭�� 0��°  ���ڿ� ���� �Լ� length(), �迭�� ���� �迭�̸�.length*/
		

		System.out.println(fruit.charAt(0));
		System.out.println(fruit.substring(7,13));
		System.out.println(fruit.length());
		System.out.println(fruit.indexOf("o"));
	
		int su=123456;
		TestString ts = new TestString();
		ts.price();
//		int gab =su.ts.price();
	}//main end
	
	public int price() {
		int su=2500;
		return su;
	}
}//class end
