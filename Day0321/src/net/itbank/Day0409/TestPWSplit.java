package net.itbank.Day0409;

import java.awt.Button;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestPWSplit{
	public static void main (String[] args) {
		
		String data = "2019//04//09//화요일////홍길동";
		String [] ret = data.split("/"); //단점. 그래서 StringTokenizer 같이 사용
		for(int i=0; i<ret.length;i++) {
			System.out.print(ret[i]+" ");	
		}
		
		System.out.println();
		StringTokenizer st = new StringTokenizer(data,"/");
		while(st.hasMoreElements()==true) {
			System.out.print(st.nextToken()+" ");
		}
		
		
		System.out.println();
		String jumin="811020-2002313";
		if(jumin.matches("[0-9]+")==false) {
			System.out.println("주민번호에 특수문자가 있습니다");
		}else {System.out.println("주민번호 구성이 맞습니다");}
		
		// 정규식 미리 공부합시다. java.util.regex~~~
		
	}//main end
	


}//class end
