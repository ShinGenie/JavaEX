package net.itbank.Day0329;
import java.util.*;

public class TestStringSwap {


	public static void main(String[] args) {
		String src="";
		String ret="";
		char ch='a';
		
		System.out.println("input: ");
		ch=new Scanner(System.in).nextLine().charAt(0); // 무조건 한글자만 입력
		//b 입력 B출력, T입력 t출력
//		ret=Character.toString(ch);
//		System.out.println(ret.toUpperCase());
//		
//		ch.toUpperCase();
		if(ch>=65 && ch<=90) {
			src+=ch;
		} System.out.println(src.toLowerCase());
		if(ch>=97 && ch<=122) {// 아스키코드로 변환
			src+=ch; // 대입연산자로 char 형을 String 형으로 변환: 꼼수ㅋㅋ
		} System.out.println(src.toUpperCase());
	}//main end


}//class end
