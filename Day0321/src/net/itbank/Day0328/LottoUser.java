package net.itbank.Day0328;

import java.util.Arrays;
import java.util.Scanner;

public class LottoUser {
	public static void main(String[] args) {	
		//���ϰ� �޾Ƽ� ���
		Lotto lt = new Lotto();
		int su[] = lt.auto();
		int aa[] = lt.manual();
		
//		System.out.println(Arrays.toString(su));
//		System.out.println(Arrays.toString(aa));
		//System.out.print("aaa");
		for(int i=0;i<su.length;i++) {
			System.out.print( su[i] + "\t");
		}
		for(int i=0;i<aa.length;i++) {
			System.out.println("�ζ� �Է¼��� "+ lt.manual() + " �Դϴ�");
		}
		System.out.print("bbb");
		
	}//main end
}//class end




