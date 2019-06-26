package net.itbank.Day0402;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First2 {
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
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력하셔야 합니다.");
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다.");
			}catch(Exception e) {
				System.out.println(e.toString());
			}finally {
				System.out.println("");
			};
		}
	}//end
}//class END
