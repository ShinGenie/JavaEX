package net.itbank.Day0409;

import java.awt.Button;
import java.util.Scanner;

public class TestPW{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��й�ȣ �Է�? ");
		String pwd1=sc.nextLine();		
		System.out.print("��й�ȣ ��Ȯ��? ");
		String pwd2=sc.nextLine();


		if(pwd1.length() <4) {
			System.out.println("��й�ȣ�� 4���� �Է��ϼ���");
			return;
		}else if(pwd1.matches("[a-zA-Z]+")==false) {
			System.out.println("��й�ȣ�� ���ĺ� �Է� �Դϴ�");
			return;
		}else if(pwd1.equals(pwd2)) {
			System.out.println("��й�ȣ ���漺���Դϴ�");
			String a =pwd1.substring(0,1);// ù���� ����
			for(int i=0;i<pwd1.length()-1;i++) {
				a = a + "*";
				System.out.print(a);
			}
		}	
		else {System.out.println("��й�ȣ ����ġ�Դϴ�"); 
		return;
		}
		// pwd1 = 1234
		//pwd1.substring(1)="*";





	}

}
