package net.itbank.day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream; // ��Ʈ��
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter; // ���ڴ����� ���

public class Gugudan3  extends Thread {

	public static void main(String[] args) throws Exception {
		//���� ����ƴ϶� �о���̴� ��
		//write ��� Reader ����ؼ� �б�
		
//		String path = "C:\\dev\\gugudan.txt";
//		////////////////////////��Ʈ�� �ܿ��////////////////////////////
//		File file = new File(path);
//		FileReader fr= new FileReader(file);
//		BufferedReader br= new BufferedReader(fr);
//		////////////////////////��Ʈ�� �ܿ��////////////////////////////
//		while(true) {
//			String data = br.readLine();
//			if(data==null||data=="") {break;}
//			System.out.println(data);
//		}
//		fr.close();
//		br.close();
//		System.out.println(path+"���� �б� �����ϼ̽��ϴ�");
		
		String path = "C:\\dev\\gugudan.txt";
		File file = new File(path);
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr); // readLine();
		while(true) {
			String data = br.readLine();
			if(data==""||data==null) {break;}
			System.out.println(data);
		}
		fr.close();
		br.close();
		System.out.println(path+"�б� �����ϼ̽��ϴ�");
	}
}//class end

