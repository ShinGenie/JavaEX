package net.itbank.day16;

import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;


public class TestFile {    // 파일에 대한 정보 검색 및 폴더 생성 - 빨대
	public static void main(String[] args) {
		//java.io패키지 - file, DataInputStream, InputStreamReader, BufferedReader
		//stream = 시냇물
//		InputStream is = System.in;
//		PrintStream ps = System.out;
//		
////		File d = new File(); // 괄호안에 내용 반드시 들어가야함
//		File f =new File("C:\\dev\\text.txt"); // 반드시 \\ 이것 두개 써야합니다. 하나쓰려면 / 이것으로 쓰세요
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
//		f=new File("C:\\dev\\시험삼아해보기");
//		boolean OK = f.mkdir();
//		if(OK==true) {System.out.println("download폴더 성공");}
//		else {System.out.println("download폴더 생성실패");}
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
