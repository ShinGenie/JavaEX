package net.itbank.Day0321;
import java.util.Scanner;
public class Scanner_01 {

	public static void main(String[] args) {
		int dan=1;

		Scanner sc = new Scanner(System.in);
		System.out.print("�������Է�?");
		dan=sc.nextInt();
		// dan �Է¹��� 1-9 ���� ���� �Է� �ް� �ʹ�. ���� 0 9���� ū���� ���Է��ϰų� �⺻�����
		
		//if(dan<=9) {for(int a=1; a<10; a++) {System.out.println(dan+"*"+a+"="+(dan*a));}}
		
		/*while(true) {
		if(dan<=0 || dan>9) 
		{System.out.println("�����");
		System.out.print("�������Է�?");
		dan=sc.nextInt();}
		else {
		for(int a=1; a<10; a++)
		{System.out.println(dan+"*"+a+"="+(dan*a));}
		break;
		}
		
	}*/
		while(dan<=0 || dan>9) {
			System.out.println("�����");
			System.out.print("�������Է�?");
			dan=sc.nextInt();
		}
		
		for(int a=1; a<10; a++)
		{System.out.println(dan+"*"+a+"="+(dan*a));}
		
		
		
		
	} // main end
} // class end
