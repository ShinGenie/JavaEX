package net.itbank.Day0322;
import java.util.Scanner;
public class ArrayInputFor {
	public static void main(String[] args) {

		//while, for반복문 사용은 여러분 선태
		//Integer.parseInt(String타입)
		//로또갯수 맞추기 if(count==3){빵사먹으세요}else if(count==5){로또사셈}

		int dap[]= {7,11,12,34,38,42};
		int count=0;
		
		System.out.println("for 반복문 데이터 입력\n");
		
		int su[]=new int[6];
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<6; i++) {	
			
			System.out.print("su ["+(i+1)+"] =");
			try {
				su[i]=Integer.parseInt(sc.nextLine());
				if(su[i]<=0 || su[i]>46) {
					System.out.println("1~45 사이의 값을 넣으시오");--i;continue;}
			}catch(NumberFormatException e) {System.out.println("실수말고 숫자 1~45 값을 재입력하시오");
			--i;
			continue;
			}catch(Exception e) {System.out.println("문자말고 숫자 1~45 값을 재입력하시오");
			e.printStackTrace();
			--i;
			continue;
			} 
			}//for end
			for(int i=0;i<6;i++) {
				System.out.print(su[i]+"\t");
		}
			


	}//main end
}//class 
