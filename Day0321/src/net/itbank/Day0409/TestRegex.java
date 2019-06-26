package net.itbank.Day0409;

import java.awt.Button;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex{
	public static void main (String[] args) {
		
		Calendar cal = Calendar.getInstance();// 리턴값을 확인하세요
		
		String data = "27세 서울시 거주합니다"
				+"집전화번호 02-9090-1234이며"
	            +"사무실번호 02-7065-6543이며"
				+"핸드폰 번호 010-6548-5436입니다";
		// 숫자핸드폰\\d{2,3}-\\d{3,4}-\\d{4}
			
		String format = "\\d{2,3}-\\d{3,4}-\\d{4}"; // 역슬래시 두개가 하나인 값으로 표현, 두개꼭 쓰기
		Pattern pt = Pattern.compile(format);
		Matcher mt = pt.matcher(data);
		int count=0;
		while(mt.find()==true) {
			count++;
			System.out.println("전화번호: "+ mt.group());
		}
		System.out.println("발견된 전화번호 수: "+ count);
		
	}//main end
	


}//class end
