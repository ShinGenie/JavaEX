package net.itbank.day18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class UserClientTC {
	public static void main(String[] args) {
		try {
			 //순서1 서버소켓생성 포트번호 지정, IP기술X
	       //ServerSocket server=new ServerSocket(1111);
	     //순서2 서버에접속 - 소켓이 관리 
	       //Socket socket=server.accept();
	     //순서3 서버에 접속한 Client의 주소궁금 생략가능
	       //InetAddress add=socket.getInetAddress();
	     
			 //유저가 서버에 접속할 서버ip,포트번호 
			 //Socket sock=new Socket("127.0.0.1", 1111);
			 Socket sock=new Socket("118.130.22.190", 1111);
	     
	     //순서4  소켓으로 IO처리로 데이터주고받고(스트림으로 받고-Reader,Writer)
	     InputStream is=sock.getInputStream();
	     OutputStream os=sock.getOutputStream();
	     
	     //순서5  바이트(스트림)를  Reader,Writer변환해서 char단위로 데이터주고받아요   
	     PrintWriter pw=new PrintWriter(new OutputStreamWriter(os));
	     BufferedReader br=new BufferedReader(new InputStreamReader(is));
	     
	  //키보드입력
	  //BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
	   Scanner key=new Scanner(System.in);
	  while(true) {
	   System.out.print("스캐너메세지: ");
	   //String msg=key.readLine();
	   String msg=key.nextLine();
	   if(msg.equals("quit") || msg.equals("QUIT")) {
	  	 System.out.println("채팅프로그램을 탈출합니다");
	  	 break;
	   }
	   pw.println(msg); pw.flush();  //<==========중요함  소켓한테 기록
	  }//while end
	       
	      pw.close(); key.close();
	      br.close(); pw.close(); 
	      is.close(); os.close(); 
			}catch (Exception e){ }	
	}//main end
}//UserClientTC class END
