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
			 //����1 �������ϻ��� ��Ʈ��ȣ ����, IP���X
	       //ServerSocket server=new ServerSocket(1111);
	     //����2 ���������� - ������ ���� 
	       //Socket socket=server.accept();
	     //����3 ������ ������ Client�� �ּұñ� ��������
	       //InetAddress add=socket.getInetAddress();
	     
			 //������ ������ ������ ����ip,��Ʈ��ȣ 
			 //Socket sock=new Socket("127.0.0.1", 1111);
			 Socket sock=new Socket("118.130.22.190", 1111);
	     
	     //����4  �������� IOó���� �������ְ�ް�(��Ʈ������ �ް�-Reader,Writer)
	     InputStream is=sock.getInputStream();
	     OutputStream os=sock.getOutputStream();
	     
	     //����5  ����Ʈ(��Ʈ��)��  Reader,Writer��ȯ�ؼ� char������ �������ְ�޾ƿ�   
	     PrintWriter pw=new PrintWriter(new OutputStreamWriter(os));
	     BufferedReader br=new BufferedReader(new InputStreamReader(is));
	     
	  //Ű�����Է�
	  //BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
	   Scanner key=new Scanner(System.in);
	  while(true) {
	   System.out.print("��ĳ�ʸ޼���: ");
	   //String msg=key.readLine();
	   String msg=key.nextLine();
	   if(msg.equals("quit") || msg.equals("QUIT")) {
	  	 System.out.println("ä�����α׷��� Ż���մϴ�");
	  	 break;
	   }
	   pw.println(msg); pw.flush();  //<==========�߿���  �������� ���
	  }//while end
	       
	      pw.close(); key.close();
	      br.close(); pw.close(); 
	      is.close(); os.close(); 
			}catch (Exception e){ }	
	}//main end
}//UserClientTC class END
