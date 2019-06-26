package net.itbank.Day0325;

import java.util.Random;
import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;//1에서 10사이의 수 Math.random()은 0.0~0.999 사이의 값
		int cnt=0, my=0; // count==cnt
		//		System.out.println("정답컴퓨터 난수="+com);//주석처리


		while(true) {
			cnt++;
			try {
				System.out.print(cnt+"회 숫자입력: ");
				my=Integer.parseInt(sc.nextLine()); //sc.nextLine()함수사용 권장

				if(com>my) {
					System.out.println("   "+my+"숫자는 정답보다 작은수입니다");
				}else if(com<my) { 
					System.out.println("   "+my+"숫자는 정답보다 큰수입니다");
				}
				if(cnt==5) {
					System.out.println("게임횟수는 5회입니다\n다음 기회에 이용해주세요");
					break;
				}
			}catch(Exception e) {System.out.println("숫자입력해주세요");};
		}
		System.out.println("\n정답컴퓨터 난수="+com);

		if(my==com) {System.out.println("맞추셨습니다");}
		if(!(my==com)) {System.out.println("\n다음기회에 시도해주세요");}

	}//main end
}//class end
