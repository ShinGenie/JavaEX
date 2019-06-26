package net.itbank.Day0328;

import java.util.Arrays;
import java.util.Scanner;

public class LottoUser {
	public static void main(String[] args) {	
		//리턴값 받아서 출력
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
			System.out.println("로또 입력수는 "+ lt.manual() + " 입니다");
		}
		System.out.print("bbb");
		
	}//main end
}//class end




