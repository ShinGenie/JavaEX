package net.itbank.day16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestEmp {

	public static void main(String[] args) throws IOException {
		
		InputStream in= System.in;
		DataInputStream dis = new DataInputStream(in);
		System.out.println("dis �̸��Է�? ");
		String name=dis.readLine();
		System.out.println("����� "+name+" �Դϱ�?"); // �ִ������ �ѱ��� ������. ��������
	}

}
