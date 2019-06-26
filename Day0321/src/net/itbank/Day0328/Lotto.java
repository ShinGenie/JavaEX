package net.itbank.Day0328;

import java.util.Scanner;



public class Lotto {// 단독 실행안됨

	public int[] auto() {
		int su[]= new int[6];
		for(int i=0;i<su.length;i++) {
			su[i]=(int)(Math.random()*45)+1;//1~45사이
			//하나발생 27이면 중복비교할필요없음 두번째 숫자 39발생 27==39
			for(int j=0;j<i;j++) {// 중복체크 구문 : i--해줘서 동일한 배열의 값을 만든다.
				if(su[i]==su[j]) {i--;break;}
			}//j end
		}//i end
		return su; // 값은 초기값 0으로 모두 들어감
	}//auto end
	
	public int[] manual() {
		int num[]=new int [6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
		System.out.println(num[i]+"=");
		num[i]=sc.nextInt();
		for(int j=0;j<i;j++) {i--; break;}
		}//i end
		return num;
	}//manual end
	
	public void sort(int[] dt) { // 리턴값x 매개인자 있음
		System.out.println("낮은 순으로 소트");
	} 
	
	
}//class end




