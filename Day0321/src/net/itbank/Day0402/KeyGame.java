package net.itbank.Day0402;

import java.io.InputStream;
import java.util.*;



public class KeyGame {
	public static void main(String[]args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.println("키입력?");
			String key=sc.next();
			
			switch(key) {
			case Keyboard.UP:
				System.out.println("up 위로 이동");
				break;
			case Keyboard.LEFT:
				System.out.println("left 좌로 이동");
				break;
			case Keyboard.DOWN:
				System.out.println("down 아래로 이동");
				break;
			case Keyboard.RIGHT:
				System.out.println("right 우로 이동");
				break;
			case Keyboard.EXIT:
				System.out.println("종료합니다");
				System.exit(1);
				break;
			case Keyboard.HELLO:
				System.out.println("키입력");
				break;
			default: 
				System.out.println("키를 잘못누르셨습니다");
				break;
			}//case end
			
			System.out.println(Keyboard.PI);break;
//			System.out.println(Keyboard.SM);break;
//			System.out.println(Keyboard.HELLO);break;
			
		}//while end
		
		
		
		
	}//main end
}//class end
