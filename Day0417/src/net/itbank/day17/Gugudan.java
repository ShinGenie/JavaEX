package net.itbank.day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream; // 스트림
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter; // 문자단위로 기록

public class Gugudan  extends Thread {

	public static void main(String[] args) throws Exception {
		
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String path="C:\\dev\\gugudan.txt";
//		File file = new File(path);
//		PrintWriter pw=new PrintWriter(file); // 
//		PrintStream ps = System.out; // 비권장 그냥 쓰기 System.out.~~
//		ps.println("단입력?");
//		int dan=Integer.parseInt(br.readLine()); // BufferedReader는 반드시 readLine() 사용
//		for(int i=1;i<10;i++) {
////			System.out.println(dan+"*"+i+"="+(dan*1));// 모니터출력
//			pw.println(dan+"*"+i+"="+(dan*1));//결과파일로 갈때 자동 라인개행
////			pw.write(dan+"*"+i+"="+(dan*1)+" \n");//저장할때 라인개행 강제해줘야하는데,그래도 안됨
//		}
//		pw.close();// 특히 저장 및 읽기처리는 close()메소드 필수 
//		System.out.println(path+"파일로 저장성공하셨습니다");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String path = "C:\\dev\\gugudan.txt";
//		PrintWriter pw=new PrintWriter(file);
		////////////////////////세트로 외우기////////////////////////////
		File file = new File(path);
		FileWriter fw=new FileWriter(file,true);//true 이어서 쓰기 // 라인개행안됨
		PrintWriter pw1=new PrintWriter(fw);
		////////////////////////세트로 외우기//////////////한 파일 뒤에 이어서 다음내용저장 //////////////
		////////////////////////매일의 카톡내용 저장되는 것처럼//////////////////////////////
		System.out.println("단입력?");
		int dan=Integer.parseInt(br.readLine());
		for(int i=0;i<10;i++) {
//			System.out.println(dan+"*"+i+"="+(dan*i));
//			pw.println(dan+"*"+i+"="+(dan*i)); //파일로 저장
//			fw.write(dan+"*"+i+"="+(dan*i)); //라인개행 안됨
			pw1.println(dan+"*"+i+"="+(dan*i));
		}
		pw1.close();
		System.out.println(path+"파일이 저장되었습니다");
	}
}//class end

