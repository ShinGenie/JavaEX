package net.itbank.Day0325;

import java.util.Random;
import java.util.Scanner;

public class TestArray1 {

	public static void main(String[] args) {
		//�迭�� ���� Ÿ��, ũ�����, ÷�ڴ� 1���� �����Դϴ�.
		//�迭�� Ÿ��[][] �迭=new Ÿ��[2][4]
		int a [][]=new int[2][4];//2���� 4��
		a[0][0]=9; 
		a[0][1]=32; 
		a[0][2]=4; 
		a[0][3]=51; 
		a[1][0]=61; 
		a[1][1]=7; 
		a[1][2]=8; 
		a[1][3]=92; 

		for(int i=0; i<a.length; i++) { // �� ��
			for(int j=0; j<a[0].length; j++) { // �� ��  j<4 ��� �ص��ǰ� �̰� �� ���� 
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println();

		int[][] b= {{1,2,3,4},{6,7,8,9}};
		for(int i=0; i<b.length; i++) { // �� ��
			for(int j=0; j<b[0].length; j++) { // �� ��  j<4 ��� �ص��ǰ� �̰� �� ���� 
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}


	}//main end
}//class end
