package net.itbank.Day0328;

import java.util.Scanner;



public class Lotto {// �ܵ� ����ȵ�

	public int[] auto() {
		int su[]= new int[6];
		for(int i=0;i<su.length;i++) {
			su[i]=(int)(Math.random()*45)+1;//1~45����
			//�ϳ��߻� 27�̸� �ߺ������ʿ���� �ι�° ���� 39�߻� 27==39
			for(int j=0;j<i;j++) {// �ߺ�üũ ���� : i--���༭ ������ �迭�� ���� �����.
				if(su[i]==su[j]) {i--;break;}
			}//j end
		}//i end
		return su; // ���� �ʱⰪ 0���� ��� ��
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
	
	public void sort(int[] dt) { // ���ϰ�x �Ű����� ����
		System.out.println("���� ������ ��Ʈ");
	} 
	
	
}//class end




