package net.itbank.day16;

import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;


public class TestFile {    // ���Ͽ� ���� ���� �˻� �� ���� ���� - ����
	public static void main(String[] args) {
		//java.io��Ű�� - file, DataInputStream, InputStreamReader, BufferedReader
		//stream = �ó���
//		InputStream is = System.in;
//		PrintStream ps = System.out;
//		
////		File d = new File(); // ��ȣ�ȿ� ���� �ݵ�� ������
//		File f =new File("C:\\dev\\text.txt"); // �ݵ�� \\ �̰� �ΰ� ����մϴ�. �ϳ������� / �̰����� ������
//		try {
//		System.out.println("isFile(): "+f.isFile());
//		System.out.println("isDirectory(): "+f.isDirectory());
//		System.out.println("isHidden(): "+f.isHidden());
//		System.out.println("lastModified(): "+f.lastModified());
//		System.out.println("canRead(): "+f.canRead());
//		System.out.println("canWrite(): "+f.canWrite());
//		System.out.println();
//		System.out.println("getPath(): "+f.getPath());
//		System.out.println("getAbsoltePath(): "+f.getAbsolutePath());
//		System.out.println("getName(): "+f.getName());
//		System.out.println("toURL(): "+f.toURI());
//		System.out.println("existes(): "+f.exists());
//		System.out.println("length(): "+f.length());
//		f=new File("C:\\dev\\�������غ���");
//		boolean OK = f.mkdir();
//		if(OK==true) {System.out.println("download���� ����");}
//		else {System.out.println("download���� ��������");}
//		f.mkdir();
//		}catch(Exception e) {}
//		

		InputStream is = System.in;
		PrintStream ps = System.out;
		
		File f =new File("C:\\dev\\gugudan.txt");
		try {
		System.out.println("f.isFile(): "+f.isFile());
		System.out.println("f.isDirectory(): "+f.isDirectory());
		System.out.println("f.isHidden(): "+f.isHidden());
		System.out.println("f.exists(): "+f.exists());
		System.out.println("f.canRead(): "+f.canRead());
		System.out.println("f.canWrite(): "+f.canWrite());
		System.out.println("f.isAbsolute(): "+f.isAbsolute());
		System.out.println("f.length(): "+f.length());
		}catch(Exception e) {}
		
		

	}//main end

}//class end
