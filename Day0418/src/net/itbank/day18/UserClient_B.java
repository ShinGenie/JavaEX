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

//������ ������ ������ ����ip,��Ʈ��ȣ
Socket sock=null;

InputStream is=null;  //������ �б�  byte������ Stream�̶� A�� 65�� �Էµ�
OutputStream os=null;  //������ ������
		
BufferedReader br=null;
PrintWriter pw=null;  //������ �о �����ϴ� ����, ���� ������� X
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
			//Ű�����Է�
			key=new Scanner(System.in);
			
			System.out.print("�̸�: ");
			String n=key.nextLine(); 
			
			pw.println(n);
			pw.flush();
			
			while(true) {
				System.out.print("�޼���: ");
				String msg=key.nextLine(); 
				
				if(msg.equals("quit")||msg.equals("QUIT")) {
					System.out.println("ä�����α׷��� �����մϴ�.");
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

