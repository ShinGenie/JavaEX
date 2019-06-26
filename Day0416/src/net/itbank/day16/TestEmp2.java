package net.itbank.day16;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestEmp2 {

	public static void main(String[] args) throws IOException {
		
		InputStream in= System.in;
		DataInputStream dis = new DataInputStream(in);
		System.out.println("dis 이름입력? ");
		String name=dis.readLine();
		System.out.println("당신이 "+name+" 입니까?"); // 최대단점은 한글이 깨진다. 지원안함
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		//BufferedReader(Reader 매개인자) 생성자
		System.out.println("br 이름입력? ");
		String name1=br.readLine();
		System.out.println("당신이 "+name1+" 입니까?"); 
		// dataInputStream 대신 bufferedReader를 쓰세요 한글깨짐방지
		//DataInputStream생성자(System.in),BufferedReader(Reader);
	}
}
