package net.itbank.Day0328;

import java.util.Scanner;
import java.util.Random;

public class GawiByBo {

	public static void main(String[] args) {
		//사람 가위바위 보
		Scanner sc=new Scanner(System.in);
		while(true){
			try{

				System.out.println("가위:1번 바위:2번 보:3번 중 숫자 하나를 선택하시오\n");
				int user=Integer.parseInt(sc.nextLine());
				if(user==0){System.exit(0);}

				//랜덤 컴수 1,2,3
				int com=(int)(Math.random()*3)+1;


				switch(user){
				case 1:
					System.out.println("user님은 가위입니다");
					break;
				case 2:
					System.out.println("user님은 바위입니다");
					break;
				case 3:
					System.out.println("user님은 보입니다");
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("잘못입력하셨습니다");
					continue;
				}

				switch(com){
				case 1:
					System.out.println("com님은 가위입니다");
					break;
				case 2:System.out.println("com님은 바위입니다");break;
				case 3:System.out.println("com님은 보입니다");break;
				}


				//로딩중
				System.out.print("\n잠시만 기다려주세요!...");
				try{
					Thread.sleep(1000);
					}catch(InterruptedException e){
						
					};			
				System.out.println("잠시만 기다려주세요!...");
				try{
					Thread.sleep(1000);
					}catch(InterruptedException e){};


				//결과안내문
				System.out.println("가위바위보 결과입니다\n");

				//게임조건결과
				if(user==com){
					System.out.println("비겼습니다\n");
					}

				if(user==1 && com==3){
					System.out.println("user님이 이겼습니다\n");
				}else if(user==1 && com==2){
					System.out.println("컴이 이겼습니다\n");
				}

				if(user==2 && com==1){
					System.out.println("user님이 이겼습니다\n");
				}
				else if(user==2 && com==3){
					System.out.println("컴이 이겼습니다\n");
				}

				if(user==3 && com==2){
					System.out.println("user님이 이겼습니다\n");
				}else if((user==3 && com==1)){
					System.out.println("컴이 이겼습니다\n");
				}
				System.out.println("종료하려면 숫자 0를 눌러주세요"); 

				//로딩중
				try{Thread.sleep(4000);}catch(InterruptedException e){}; continue;	

			}catch(Exception e){System.out.println("숫자로만 입력해주세요");}continue;



		}//while end




	}//main end
}//class end
