package net.itbank.Day0321;

import java.util.Scanner;

public class TestStar {	
	public static void main(String[] args) {
		
		int i=0, b=0, k=0;
		while(i<5) {
			int j=5;
			while(j>=i) {System.out.print("¡Ù"); j--;}
			System.out.println(); i++;
		}
		
		for(int num=2; num<10; num++) {
			for(int num1=1; num1<10; num1++) {
				int gap=num*num1;
				System.out.println(num+"*"+num1+"="+gap);}
		
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.print("");
		int dan=0;
		dan=sc.nextInt();
		
		
		System.out.println("¿µ¾î=78");
		
	}// main end
}// class end
