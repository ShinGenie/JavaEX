package net.itbank.Day0325;

import java.util.Random;
import java.util.Scanner;

public class TestArray1 {

	public static void main(String[] args) {
		//배열은 같은 타입, 크기고정, 첨자는 1부터 시작입니다.
		//배열은 타입[][] 배열=new 타입[2][4]
		int a [][]=new int[2][4];//2행의 4열
		a[0][0]=9; 
		a[0][1]=32; 
		a[0][2]=4; 
		a[0][3]=51; 
		a[1][0]=61; 
		a[1][1]=7; 
		a[1][2]=8; 
		a[1][3]=92; 

		for(int i=0; i<a.length; i++) { // 행 수
			for(int j=0; j<a[0].length; j++) { // 열 수  j<4 라고 해도되고 이게 더 낫다 
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println();

		int[][] b= {{1,2,3,4},{6,7,8,9}};
		for(int i=0; i<b.length; i++) { // 행 수
			for(int j=0; j<b[0].length; j++) { // 열 수  j<4 라고 해도되고 이게 더 낫다 
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}


	}//main end
}//class end
