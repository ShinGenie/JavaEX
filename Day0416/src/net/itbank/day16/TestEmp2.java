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
		System.out.println("dis �̸��Է�? ");
		String name=dis.readLine();
		System.out.println("����� "+name+" �Դϱ�?"); // �ִ������ �ѱ��� ������. ��������
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		//BufferedReader(Reader �Ű�����) ������
		System.out.println("br �̸��Է�? ");
		String name1=br.readLine();
		System.out.println("����� "+name1+" �Դϱ�?"); 
		// dataInputStream ��� bufferedReader�� ������ �ѱ۱�������
		//DataInputStream������(System.in),BufferedReader(Reader);
	}
}
