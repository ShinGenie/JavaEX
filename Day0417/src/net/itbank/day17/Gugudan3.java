package net.itbank.day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream; // 스트림
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter; // 문자단위로 기록

public class Gugudan3  extends Thread {

	public static void main(String[] args) throws Exception {
		//파일 저장아니라 읽어들이는 것
		//write 대신 Reader 사용해서 읽기
		
//		String path = "C:\\dev\\gugudan.txt";
//		////////////////////////세트로 외우기////////////////////////////
//		File file = new File(path);
//		FileReader fr= new FileReader(file);
//		BufferedReader br= new BufferedReader(fr);
//		////////////////////////세트로 외우기////////////////////////////
//		while(true) {
//			String data = br.readLine();
//			if(data==null||data=="") {break;}
//			System.out.println(data);
//		}
//		fr.close();
//		br.close();
//		System.out.println(path+"파일 읽기 성공하셨습니다");
		
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
		System.out.println(path+"읽기 성공하셨습니다");
	}
}//class end

