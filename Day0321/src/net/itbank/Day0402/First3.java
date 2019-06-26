package net.itbank.Day0402;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
		while(true) {
			try {
				System.out.print("정수입력 ? ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("정수입력 ? ");
				b = Integer.parseInt(sc.nextLine());
				
				System.out.println(a + " + " + b + " = " + (a+b));
				System.out.println(a + " - " + b + " = " + (a-b));
				System.out.println(a + " * " + b + " = " + (a*b));
				System.out.println(a + " / " + b + " = " + (a/b));
				System.out.println(a + " % " + b + " = " + (a%b));
				break;
			}catch(Exception e) {
				System.err.println("e.getClass()="+e.getClass());
				System.err.println("e.getMessage()="+e.getMessage());
				System.err.println("e="+e);//err 사용 위에것도 사용가능하나 이것 권장 - 젤 짧음
				e.printStackTrace();//개발용 콘솔 로그 
			}finally {
				System.out.println("");
			};
		}
	}//end
}//class END
