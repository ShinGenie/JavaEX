package net.itbank.Day0402;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
		while(true) {
			try {
				System.out.print("�����Է� ? ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("�����Է� ? ");
				b = Integer.parseInt(sc.nextLine());
				
				System.out.println(a + " + " + b + " = " + (a+b));
				System.out.println(a + " - " + b + " = " + (a-b));
				System.out.println(a + " * " + b + " = " + (a*b));
				System.out.println(a + " / " + b + " = " + (a/b));
				System.out.println(a + " % " + b + " = " + (a%b));
				break;
			}catch(InputMismatchException e) {
				System.out.println("������ �Է��ϼž� �մϴ�.");
			}catch(ArithmeticException e) {
				System.out.println("0���� ������ �����ϴ�.");
			}catch(Exception e) {
				System.out.println(e.toString());
			}finally {
				System.out.println("");
			};
		}
	}//end
}//class END
