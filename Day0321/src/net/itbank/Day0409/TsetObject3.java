	package net.itbank.Day0409;
	
	import java.io.InputStream;
	import java.util.Calendar;
	import java.util.GregorianCalendar;
	import java.util.Scanner;
	
	
	class Test{ // Test.java ���¾����� Test.class ���Ϸθ� ����
		// Object Ŭ���� ����� ���������� ����
		int a ; // �ʵ�
		public Test() {}
		public Test(int a) {this.a=a;}
		
		@Override
		public boolean equals(Object obj) {
			boolean ret = this.a == ((Test)obj).a;
			return ret;
		}
		@Override
		public String toString() {
			return "a="+a;
		}

		class MyExit{ 
			
		}
		
	}
	
	public class TsetObject3 {
		
		Object ob = new Object();
		Test ts = new Test();
		Object ob2 = new Test();
		
		public static void main(String[] args) {
			
			new Test();
			
		}//end
	}//class end
