package net.itbank.Day0409;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TsetObject4 {
	public static void main(String[] args) {
		String x = new String ("apple");
		String y = new String ("apple");
		if(x==y) {System.out.println("apple ���� �������Դϴ�");
		}else {System.out.println("apple �ٸ� �������Դϴ�");}
		if(x.equals(y)) {System.out.println("apple ���� �������Դϴ�");
		}else {System.out.println("apple �ٸ� �������Դϴ�");}
	}//end
}//class end
