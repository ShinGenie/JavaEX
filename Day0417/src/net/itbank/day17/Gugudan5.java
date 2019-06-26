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
import java.util.Scanner;

public class Gugudan5  extends Thread {

	public static void main(String[] args) throws Exception {
	
		String path = "C:\\dev\\gugudan.txt";
		File file = new File(path);
		Scanner read = new Scanner(file);
		while(read.hasNextLine()==true) { // 다음라인 읽을것 있니?
			System.out.println(read.nextLine());
		} 
		
		System.out.println(path+" -----> Scanner 읽기 성공하셨습니다");
	}
}//class end

