package net.itbank.Day0328;

import java.util.Scanner;

class moneycol {
	int deposit;
	int withdraw;
	int balance;
}
public class Practice {
	private static Scanner scan;
	public static void main(String[] args) { // static ����  // �����Լ��� ������ static���� ����
		moneycol m = new moneycol();
		String input="";
		scan=new Scanner(System.in);


		switch(input) {
		case "1" :
			while(true) {
				System.out.println("1.�Ա� 2.��� 3.�ܾ�4.����:");
				m.deposit=scan.nextInt();
				if(m.deposit>0) {
					System.out.println(m.deposit+"�� �ԱݵǾ����ϴ�");
					m.balance+=m.deposit;
					System.out.println("�ܾ��� "+m.balance+"�Դϴ�");
				}else {
					System.out.println("�Աݾ��� �߸� �Է��ϼ̽��ϴ�");
					System.out.println("���� �ܾ���"+m.balance+"�Դϴ�");
					continue;
				}
				break;
			} //while end
			
		case "2" :
			while(m.balance>0) {
				System.out.println("���� �ܾ���"+m.balance+"�Դϴ�");
				System.out.println("��ݾ��� �Է��ϼ���:");
				m.withdraw=scan.nextInt();
				if(m.deposit>0) {
					System.out.println(m.deposit+"�� �ԱݵǾ����ϴ�");
					m.balance+=m.deposit;
					System.out.println("�ܾ��� "+m.balance+"�Դϴ�");
				}else {
					System.out.println("�Աݾ��� �߸� �Է��ϼ̽��ϴ�");
					System.out.println("���� �ܾ���"+m.balance+"�Դϴ�");
					continue;
				}
				break;
			} //while end
		}//switch input end
	}//main end
}//class end
