package net.itbank.Day0409;

import java.awt.Button;
import java.util.Scanner;

public class TestPW{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("비밀번호 입력? ");
		String pwd1=sc.nextLine();		
		System.out.print("비밀번호 재확인? ");
		String pwd2=sc.nextLine();


		if(pwd1.length() <4) {
			System.out.println("비밀번호는 4글자 입력하세요");
			return;
		}else if(pwd1.matches("[a-zA-Z]+")==false) {
			System.out.println("비밀번호는 알파벳 입력 입니다");
			return;
		}else if(pwd1.equals(pwd2)) {
			System.out.println("비밀번호 변경성공입니다");
			String a =pwd1.substring(0,1);// 첫글자 추출
			for(int i=0;i<pwd1.length()-1;i++) {
				a = a + "*";
				System.out.print(a);
			}
		}	
		else {System.out.println("비밀번호 불일치입니다"); 
		return;
		}
		// pwd1 = 1234
		//pwd1.substring(1)="*";





	}

}
