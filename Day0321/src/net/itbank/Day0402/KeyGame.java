package net.itbank.Day0402;

import java.io.InputStream;
import java.util.*;



public class KeyGame {
	public static void main(String[]args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.println("Ű�Է�?");
			String key=sc.next();
			
			switch(key) {
			case Keyboard.UP:
				System.out.println("up ���� �̵�");
				break;
			case Keyboard.LEFT:
				System.out.println("left �·� �̵�");
				break;
			case Keyboard.DOWN:
				System.out.println("down �Ʒ��� �̵�");
				break;
			case Keyboard.RIGHT:
				System.out.println("right ��� �̵�");
				break;
			case Keyboard.EXIT:
				System.out.println("�����մϴ�");
				System.exit(1);
				break;
			case Keyboard.HELLO:
				System.out.println("Ű�Է�");
				break;
			default: 
				System.out.println("Ű�� �߸������̽��ϴ�");
				break;
			}//case end
			
			System.out.println(Keyboard.PI);break;
//			System.out.println(Keyboard.SM);break;
//			System.out.println(Keyboard.HELLO);break;
			
		}//while end
		
		
		
		
	}//main end
}//class end
