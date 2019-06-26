package net.itbank.day23;

import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;

import net.itbank.day23.MServer.Service;

public class MServer extends JFrame implements ActionListener, Runnable {

	Vector vc = new Vector();
	
	TextArea ta = new TextArea();
	JButton jbexit = new JButton("서버종료");
	
	ServerSocket server = null;
	InetAddress add = null;
	String myname = "guest";
	Socket sock;
	BufferedReader br;
	OutputStream out;
	
	public MServer() {
		super("Main 서버");
		this.add(ta,"Center");
		this.add(jbexit,"South");
		this.setBounds(30,30,400,600);
		this.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jbexit.addActionListener(this);
	}//const end

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==jbexit) System.exit(0);
	}//action end
	
	public void run() {
		try {
			server = new ServerSocket(5555);
			
			while(true) {
			System.out.println("접속생성 대기");	
			sock = server.accept();
			ta.append("서버접속성공");
			add = sock.getInetAddress();
			ta.append(add+"ip 유저께서 입장하셨습니다");
			
			Service sv = new Service(this, sock);
			vc.add(sv);
			sv.start();
			
			}
		} catch (IOException e) {e.printStackTrace();}
	}//run end
	
	
	
	
	class Service extends Thread{
		MServer server = null;
		Socket sock=null;
		String myname="guest";
		BufferedReader br;
		PrintWriter pr;
		
		Service(){}
		Service(MServer server, Socket sock){
			this.server = server;
			this.sock = sock;
			try {
				br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				pr = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
			} catch (IOException e) {e.printStackTrace();}
			
		}
		public void run() {
			String data = null;
			
			try {
				myname = br.readLine();
				System.out.println(myname + "님 입장");
				broadcast(myname+"님 입장");
				while(true) {
				data = br.readLine();
				System.out.println(myname + ":" + data);
				broadcast(myname +":"+ data);
				}
			} catch (IOException e) {e.printStackTrace();}
		}
		
		private void broadcast(String msg) {
			int su = server.vc.size();
			for(int i=0;i<vc.size();i++) {
				Service sv = (Service) server.vc.get(i);
				sv.pr.print(msg);
				sv.pr.flush();
			}//for end
		}//broad end
		
	}//servic end
	
	
	public static void main(String[] args) {
		new MServer();
//		System.out.println("dd");
	}//main end
	
	
}//class end







