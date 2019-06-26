package net.itbank.Day0322;
import java.util.Random;
import java.util.Scanner;
public class TestWhile {
	public static void main(String[] args) {

		//while, for반복문 사용은 여러분 선태
		//Integer.parseInt(String타입)
		//로또숫자 6개 숫자 1~45 숫자만 입력, 문자입력, 실수입력하면 재입력시도

		int su[]=new int[6];
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<6) {
			System.out.print("su["+i+"]=");
			//i++;
			try {
				su[i]=Integer.parseInt(sc.nextLine());
				if(su[i]<=0 || su[i]>46) {
					System.out.println("1~45 사이의 값을 넣으시오");
					continue;
				}
			}catch(Exception e) {
				System.out.println("숫자입력하시오");
				continue; 
			}
			i++;
			if(i==6) {break;}
		}//while end	
		
		
	 for(i=0; i<6; i++) {
	  System.out.print(su[i] + " ");
	}

		 
		
	}//main end
}//class END

