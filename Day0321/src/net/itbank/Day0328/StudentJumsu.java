	package net.itbank.Day0328;
	
	import java.util.Scanner;
	import java.util.Random;
	
	public class StudentJumsu {
	
		public static void main(String[] args) {
		// 이름 abc 성적 국 영 수 총점 
			// Scanner로 성적 입력받는 방법
//			Scanner sc =new Scanner(System.in);
//			int gab=Integer.parseInt(sc.nextLine());
			
			int st[][]={{1,2,3},{3,4,5}};
			
			System.out.println("국\t영\t수\t총점\t평균");
			// 이름
//			System.out.println("a,b,c");
			
			while(true){
								
				//성적나열
				for(int a=0; a<2; a++){
					int b=0;
					for(b=0; b<2; b++){
						int gab=st[a][b];
					} System.out.print(st[a][b]+"\t");
				}System.out.println();

//				//성적 합
//				for(int a=0; a<2; a++){
//					int gab=0;
//					for(int b=0; b<2; b++){
//						gab=+st[a][b];
//						System.out.print(gab+"\t");
//					}
//					System.out.println();
//				}
//				System.out.println();
//				
//				//과목성적
//				for(int a=0; a<2; a++){
//					int gab=0;
//					for(int b=0; b<2; b++){
//						gab=+st[b][a];
//					}
//					System.out.print(gab+"\t");
//				}
				break;
			}//while end
			
			
	}//main end
}//class end
