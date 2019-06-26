package net.itbank.day16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestEmp {

	public static void main(String[] args) throws IOException {
		
		InputStream in= System.in;
		DataInputStream dis = new DataInputStream(in);
		System.out.println("dis 이름입력? ");
		String name=dis.readLine();
		System.out.println("당신이 "+name+" 입니까?"); // 최대단점은 한글이 깨진다. 지원안함
	}

}
