package net.itbank.Day0322;
import java.util.Random;
import java.util.Scanner;
public class TestArrayInput {
	public static void main(String[] args) {

		//while, for반복문 사용은 여러분 선태
		//Integer.parseInt(String타입)
		//로또숫자 6개 숫자 1~45 숫자만 입력, 문자입력, 실수입력하면 재입력시도

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
			}
			for(int i=0;i<6;i++) {
				System.out.print(su[i]+"\t");
			}
			//for문 증분 조건처럼 나중에 --i를 해줘야한다. 
			//while은 증분이 없기때문에 for문 증분 조건처럼 나중에 --i를 해줄 필요가 없다. 


	}//main end
}//class 
