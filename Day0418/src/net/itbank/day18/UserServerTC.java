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
import java.util.Vector;

public class UserServerTC {
	 ServerSocket server=null;	
	 Vector inwon;  //인원수 카운트
	
	public static void main(String[] args) {
			UserServerTC us=new UserServerTC();
			us.serverStart();
	}//main end
	
	public void serverStart() { //일반메소드 
		try {
			 //순서1 서버소켓생성 포트번호 지정, IP기술X
	     server=new ServerSocket(1111);
	     System.out.println("서버생성성공 접속대기중...");
	     
	     //순서2 서버에접속 - 소켓이 관리 
	     Socket socket=server.accept();
	     System.out.println("서버접속허용 성공");
	     
	     //순서3 서버에 접속한 Client의 주소궁금 생략가능
	     InetAddress add=socket.getInetAddress();
	     System.out.println(add + " 유저ip입니다");
	     
	     //순서4 접속이 성공했으면 IO처리로 데이터주고받고(스트림으로 받고-Reader,Writer)
	     InputStream is=socket.getInputStream();
	     OutputStream os=socket.getOutputStream();
	     
	     //순서5  바이트(스트림)를  Reader,Writer변환해서 char단위로 데이터주고받아요
	     InputStreamReader isr=new InputStreamReader(is);
	     OutputStreamWriter osw=new OutputStreamWriter(os);
	     
	     PrintWriter pw=new PrintWriter(osw);//서버는 읽어서 전달하는 역할이지 직접 기록안함
	     BufferedReader br=new BufferedReader(isr);
	     
	      while(true) {
	      	String data=br.readLine();
	      	if(data==null) break;
	      	System.out.println("client 내용: " + data);
	      }//while end
	      
	      br.close(); pw.close(); osw.close(); isr.close();
	      is.close(); os.close(); //socket.close();server.close();
			}catch (Exception e){ }	
	 }//serverStart end
}// UserServerTC class END



 //class ChatHandle extends Thread{참고}
 class MyHandle extends Thread {
	  UserServerTC server=null;
		Socket sock=null;
		PrintWriter pw=null;
		BufferedReader br=null;
		
	 public MyHandle(){ }
	 
	 public MyHandle(UserServerTC server, Socket sock) {
		 
	 }//end
	 
	 public void run() {
		 
	 }//run end
 }//class END






