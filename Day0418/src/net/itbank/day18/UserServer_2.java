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
import java.util.Vector;

public class UserServer_2 {
	ServerSocket server = null;
	Socket socket = null; 
	InetAddress add = null;
	Vector inwon;
	String name=null;

	public static void main(String[] args) throws IOException {
		UserServer_2 us = new UserServer_2();
		us.serverStart();
	}//main end

	
	public UserServer_2() {
		
	}


	public void serverStart() {
		try {
			server = new ServerSocket(1111);
			inwon = new Vector();
			System.out.println("���Ӵ����..");
			while(true) {
			socket = server.accept();
			System.out.println("���Ӽ���");
			add = socket.getInetAddress();
			System.out.println(add+"ip�������� �����ϼ̽��ϴ�");
			Handle_2 hd = new Handle_2(this, socket);
			inwon.add(hd); // �ڵ�żҵ忡 �ο��߰�
			hd.start();
			}
			
		} catch (Exception e) { System.out.println("������ �����Ҽ� �����ϴ�. ����Ȯ�ιٶ�");e.printStackTrace();}
	}
	
}//class END


class Handle_2 extends Thread{
	UserServer_2 server=null;
	Socket socket=null;
	BufferedReader br;
	PrintWriter pw;
	
		public Handle_2() {	}
		public Handle_2(UserServer_2 server, Socket socket) {
		this.server = server;
		this.socket = socket;
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//handle_2 end
	
	@Override
	public void run() {
		String name =null;
				try {
					name=br.readLine();
					System.out.println(name+"�� ����");
					broadcast(name+"�� ����");
				while(true) {
					String msg =null;
					msg=br.readLine();
					System.out.println(name+" : "+msg);	
					broadcast(name+" : "+msg);
					}//while end
				}catch(Exception e) {}
	}//run end
	
	
	

	private void broadcast(String string) {
		int su = server.inwon.size();
		for(int i=0;i<su;i++) {
			Handle_2 hd = (Handle_2) server.inwon.get(i);
			hd.pw.println(string);
			hd.pw.flush();
		}//for end
	}//broadcast end




}

