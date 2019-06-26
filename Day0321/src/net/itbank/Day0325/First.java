package net.itbank.Day0325;
import java.util.Scanner;
public class First {

	public static void main(String[] args) {
		// 5개의 방이 있다 
		// 몇번방 예약하겠습니까? 
		// 3번 5번 예약하고 1번방 예약하고 
		// 1번 퇴실했다  - 빈방입니다

		boolean flag[] = new boolean [5];
		String bang[] = {"101","102","103","104","105"};
		Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("몇번 방 예약하시겠습니까?");
		int b =Integer.parseInt(sc.nextLine());

			if(flag[b-1]==true){
				System.out.println("이미 예약되었다\n");continue;
			}else {
				flag[b-1]=true; 
			}
			System.out.println(b+"번 예약되셨습니다\n");


			for(int i=0; i<5; i++) {
				System.out.print(bang[i]+"\t");
			}
			System.out.println();
			for(int a=0; a<5; a++){
				if(flag[a]==true) {
					System.out.print("예약됨\t"); 
				}else{
					System.out.print("빈좌석\t");
				} 
			}
			System.out.println("\n");
		}//while end
	}//main end
}//class end
