package net.itbank.Day0402;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First3 {
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
			}catch(Exception e) {
				System.err.println("e.getClass()="+e.getClass());
				System.err.println("e.getMessage()="+e.getMessage());
				System.err.println("e="+e);//err ��� �����͵� ��밡���ϳ� �̰� ���� - �� ª��
				e.printStackTrace();//���߿� �ܼ� �α� 
			}finally {
				System.out.println("");
			};
		}
	}//end
}//class END
