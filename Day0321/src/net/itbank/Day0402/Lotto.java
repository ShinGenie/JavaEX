package net.itbank.Day0402;

import java.util.*;

public class Lotto {
	public static void main(String[]args) {
		Lotto my = new Lotto();
		int[] a=my.input();
//		my.output(a);
	}//end
	
	public int[] input() {
		int[] su= new int[6];
//		Scanner sc=new Scanner(System.in);
//		System.out.println("입력값");
//		int i=sc.nextInt();
		int random=(int)(Math.random()*45);
		System.out.println(random);
		Random rd = new Random();
		int Random=rd.nextInt(45);
		System.out.println(Random);	
		
		for(int i=0;i<su.length;i++) {
			su[i]=random;
		}
		
		for(int i=0;i<su.length;i++) {
			su[i]=(int)(Math.random()*45);
			for(int j=0;j<su.length;j++) {
				su[j]=rd.nextInt(45);
				if(su[i]==su[j]) {i--;}
				
			}
		}
		//Math클래스 random 1~45
		//Random클래스 nextInt() 1~45사이숫자발생 중복
		return su;
	}//end
	
//	public int[] output() {
//		
//	}
	
	
}//class end
