package net.itbank.day26;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ServerCom {

	ServerSocket server;
	Socket socket;
	InetAddress add;
	Vector vt;
	
	ServerCom() throws IOException{
		
		server = new ServerSocket(7777);
		System.out.println("��������");
		while(true) {
		socket = server.accept();
		System.out.println("�������� ���");
		Process pc = new Process(socket);
		pc.start();
		}
		
	}
	
	public class Process extends Thread{
		
		Socket socket;
		InputStream in;
		OutputStream out;
		BufferedInputStream bin;
		
		
		Process(Socket socket){
			
			this.socket=socket;
			
			
		}
		@Override
		public void run() {
			
		}
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
	 new ServerCom();
	}

}
