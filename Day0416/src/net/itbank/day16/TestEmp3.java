package net.itbank.day16;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestEmp3 {

	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = new DataInputStream(System.in);	// �ѱ۱����� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
		Scanner sc = new Scanner(System.in);
		System.out.println("br �̸��Է�? ");
		String name = sc.nextLine();
		System.out.println("����� "+name+" �Դϱ�?"); 
		// dataInputStream ��� bufferedReader�� ������ �ѱ۱�������
		//DataInputStream������(System.in),BufferedReader(Reader);
	}
}
