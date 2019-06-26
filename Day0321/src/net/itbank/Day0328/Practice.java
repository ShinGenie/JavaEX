package net.itbank.Day0328;

import java.util.Scanner;

class moneycol {
	int deposit;
	int withdraw;
	int balance;
}
public class Practice {
	private static Scanner scan;
	public static void main(String[] args) { // static 영역  // 메인함수는 무조건 static으로 간다
		moneycol m = new moneycol();
		String input="";
		scan=new Scanner(System.in);


		switch(input) {
		case "1" :
			while(true) {
				System.out.println("1.입금 2.출금 3.잔액4.종료:");
				m.deposit=scan.nextInt();
				if(m.deposit>0) {
					System.out.println(m.deposit+"원 입금되었습니다");
					m.balance+=m.deposit;
					System.out.println("잔액은 "+m.balance+"입니다");
				}else {
					System.out.println("입금액을 잘못 입력하셨습니다");
					System.out.println("현재 잔액은"+m.balance+"입니다");
					continue;
				}
				break;
			} //while end
			
		case "2" :
			while(m.balance>0) {
				System.out.println("현재 잔액은"+m.balance+"입니다");
				System.out.println("출금액을 입력하세요:");
				m.withdraw=scan.nextInt();
				if(m.deposit>0) {
					System.out.println(m.deposit+"원 입금되었습니다");
					m.balance+=m.deposit;
					System.out.println("잔액은 "+m.balance+"입니다");
				}else {
					System.out.println("입금액을 잘못 입력하셨습니다");
					System.out.println("현재 잔액은"+m.balance+"입니다");
					continue;
				}
				break;
			} //while end
		}//switch input end
	}//main end
}//class end
