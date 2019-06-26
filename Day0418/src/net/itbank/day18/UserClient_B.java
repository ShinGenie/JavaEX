package net.itbank.day18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class UserClient_B extends Thread{

//유저가 서버에 접속할 서버ip,포트번호
Socket sock=null;

InputStream is=null;  //데이터 읽기  byte형식의 Stream이라서 A는 65로 입력됨
OutputStream os=null;  //데이터 보내기
		
BufferedReader br=null;
PrintWriter pw=null;  //서버는 읽어서 전달하는 역할, 직접 기록하지 X
Scanner key=null;

	public static void main(String[] args) {
			UserClient_B uc=new UserClient_B();
		}//main end
	
	public UserClient_B() {	
		try {
		Thread th = new Thread(this);
		th.start();
		ClientSend();
				}catch(Exception e) {}
	}
	public void ClientSend() {
		int su=0;
		
		try {
			//키보드입력
			key=new Scanner(System.in);
			
			System.out.print("이름: ");
			String n=key.nextLine(); 
			
			pw.println(n);
			pw.flush();
			
			while(true) {
				System.out.print("메세지: ");
				String msg=key.nextLine(); 
				
				if(msg.equals("quit")||msg.equals("QUIT")) {
					System.out.println("채팅프로그램을 종료합니다.");
					break;
				}
				pw.println(msg);
				pw.flush();
			}//while end

		}catch(Exception e) {}
		
	}//ClientStart end
	
	public void run() {
		try{
			sock=new Socket("118.130.22.163", 1111);
			os = sock.getOutputStream();
			pw = new PrintWriter(new OutputStreamWriter(os));
			InputStream is = sock.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			
			String msg = null;
			while(true){
				msg = br.readLine();
				System.out.println(msg);

			}
			
		}catch(Exception e){	}
	}//run end

}//UserClient class END

