package net.itbank.Day0326;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestMonth {
	//book price note(); ���� �Լ��� ȣ���̿�

	// �迭 ��Ʈ�ϱ� 
	public static void main(String [] args) {

		/*Date dt=new Date();
		Calendar cal=new GregorianCalendar();
		//�⵵ 2019 ���� - (1900+87)
		String jumin="871230-2672514";
				//1,3==> ���� 2,4==>����
		char gen=jumin.charAt(7);//7��°
		//switch ��� ��������
		System.out.println(jumin);
		switch(gen) {
		case '1':  //case 1 ���⼭ 1�� int �׷��� ��Ʈ�������� 
		case '3': System.out.println("�����Դϴ�");break;	
		case '2': 	
		case '4': System.out.println("�����Դϴ�");break;	
		default: System.out.println("�˼������ϴ�");
		} */

		String jumin = "875808-2002315";
		char gen = jumin.charAt(7);
		System.out.println(jumin);
		int[] month= {31,28,31,30,31,30,31,31,30,31,30,30};
		//���ڹ��� 1~12 ���� ����
		// try~catch(Exception ex){}
		//���ϴ� ��? 5
		//5���� 31�� �Դϴ�

		Scanner sc = new Scanner(System.in);

		while(true){
			try {
				System.out.println("���ϴ� ���� �Է��Ͻÿ�:");
				int msg= Integer.parseInt(sc.nextLine());

				if(msg>=1 || msg<=12) { System.out.println(msg+"���� "+month[msg-1]+"�Դϴ�");	}
				if(msg>=13 || msg<0) { System.out.println(msg+"���� 3"+month[msg-1]+"�Դϴ�");	}
								
			}catch(Exception e) {System.out.println("���ڷ� ������");} return;

		}
	}//main end
}//class end
