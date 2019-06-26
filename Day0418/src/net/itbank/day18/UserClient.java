package net.itbank.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class UserClient extends Thread {

	BufferedReader br;
	PrintWriter pw;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		UserClient uc = new UserClient();
	}//main end
	
	
	public UserClient() {

		try {
			this.start();
			
			System.out.print("name : ");
			String nick=sc.nextLine();
			pw.println(nick);
			pw.flush();
				System.out.print(nick+": ");
				while(true) {
				String data=sc.nextLine();
				if(nick==null||data.equals("")) {
					System.out.println("ä�����α׷��� �����մϴ�.");
					break;
				}
				pw.println(data);
				pw.flush(); //** �߿� �ݵ�� ��� ======> �������� ���! 
			}//while end

//			br.close(); pw.close();  

		}catch(Exception e) {}	
	}
	
	public void run() {
		Socket sock=null;
		try {
			sock = new Socket("127.0.0.1",1111);
			//Input/OutPut
			br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			pw=new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
			String data=null;
			while(true) {
				data=br.readLine();
				pw.println(data);
			}
		} catch (IOException e) {e.printStackTrace();}
		
		
		//Ű�����Է� -> ������ �Է�
//		Scanner key = new Scanner(System.in);
	}
	
}//class end


