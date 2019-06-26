package net.itbank.Day0409;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TsetObject2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object ob = new Object();
		String num = String.valueOf("1200");
		Calendar cal = new GregorianCalendar();
		InputStream is = System.in;

		while(true) {
			try{
				for(int i=0;i<10;i++) {
					int count=1;
					count=count+i;
					System.out.print(count+"  ");
				}
				break;
			}catch(Exception ex) {System.out.println(ex.toString());}
			
		}
	}//end
}//class end
