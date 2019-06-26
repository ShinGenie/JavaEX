package net.itbank.day16;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestEmp3 {

	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = new DataInputStream(System.in);	// 한글깨져서 비추
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
		Scanner sc = new Scanner(System.in);
		System.out.println("br 이름입력? ");
		String name = sc.nextLine();
		System.out.println("당신이 "+name+" 입니까?"); 
		// dataInputStream 대신 bufferedReader를 쓰세요 한글깨짐방지
		//DataInputStream생성자(System.in),BufferedReader(Reader);
	}
}
