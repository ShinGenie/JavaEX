package net.itbank.day17;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIChatServer extends JFrame implements ActionListener{
	  TextArea txt_list;
	  JButton btn_exit;
	  ServerSocket ss=null;	
	  Vector inwon;    //�ο��� ī��Ʈ
	
	public GUIChatServer() 	{
		super("Chatting Server");
		
		txt_list = new TextArea();
		btn_exit = new JButton("��������");
		
		txt_list.setBackground(Color.YELLOW);
		add(txt_list, "Center");
		add(btn_exit,"South");
		setSize(450,650);
		setVisible(true);
		
		//�̺�Ʈó��-----------------------
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn_exit.addActionListener(this);
//		inwon=new Vector();   //�ݵ�� serverStart()���� ���� �ۼ��ؾ���
		serverStart();        // �׷��� ������ NullPointException �߻�    
	} //end
	
	public void serverStart() {
		final int PORT=7500;
		try{
			ss=new ServerSocket(PORT);
			System.out.println("ServerSocket start ~~~~\n");
			txt_list.append("ServerSocket start ~~~~\n");
			txt_list.setFont(new Font("�ü�ü", Font.BOLD, 14));
			while(true)	{
				Socket sock=ss.accept();
				String str=sock.getInetAddress().getHostAddress();
				txt_list.append(str);
				//����ó���� �ϱ����� Ŭ���̾�Ʈ ��ü����(��������� Ŭ����)
				ChatHandle ch=new ChatHandle(this,sock);
				inwon.add(ch);  //�������� Vector inwon;   ����
				ch.start();     //startServer()�ٷ� ���� inwon=new Vector(); 
			}
		}catch(IOException e){	}
	}  //end
	
	public void setMsg(String string) {
		txt_list.append(string);	
	} //end
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_exit)
			System.exit(0);
	} //end
	
	public static void main(String[] args) {
		new GUIChatServer();
	} //end
} //GUIChatServer class END



class ChatHandle extends Thread {
	GUIChatServer server=null;
	Socket sock=null;
	PrintWriter pw=null;
	BufferedReader br=null;
	
	public ChatHandle(GUIChatServer server, Socket sock)	{
		this.server=server;
		this.sock=sock;
		
		try{
			InputStream is=sock.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
			
			OutputStream os=sock.getOutputStream();
			pw=new PrintWriter(new OutputStreamWriter(os));
		}catch(IOException e){
			e.printStackTrace();
		}
	} //end
	
	public void run() 	{
		String nickname=null;
		
		try{
			nickname=br.readLine();
			server.setMsg("["+nickname+"]���� ���� �ϼ̽��ϴ�\n"); 
			broadcast("["+nickname+"]���� ���� �ϼ̽��ϴ�\n");
			
			//��ȭ����-----------------------------------
			while(true){
				try{
					String text=br.readLine();
					server.setMsg(nickname + ":> " + text +"\n");
					broadcast(nickname + ":> " + text);
				}catch(IOException e){	}
			} //while end
			//��ȭ���� ��-----------------------------------
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//synchronized (server.inwon) {
				//server.inwon.remove(this);
				//server.setMsg("["+nickname+"]���� ���� �ϼ̽��ϴ�\n");
				//broadcast("["+nickname+"]���� ���� �ϼ̽��ϴ�\n");
			//}
		}
	} //end
	
	
	/* ��� �����ڿ���  �޼����� ������ */
	private void broadcast(String string) {
		//synchronized (server.inwon) {   /* ����ȭó�� */
//			int s=server.inwon.size();     //�����ڼ�
			for(int i=0; i<3; i++){
				ChatHandle ch=(ChatHandle)server.inwon.elementAt(i);
				ch.pw.println(string);
				ch.pw.flush();
			}
		//} //����ȭ��
	} //end
} //ChatHandle class END