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
	 Vector inwon;  //�ο��� ī��Ʈ
	
	public static void main(String[] args) {
			UserServerTC us=new UserServerTC();
			us.serverStart();
	}//main end
	
	public void serverStart() { //�Ϲݸ޼ҵ� 
		try {
			 //����1 �������ϻ��� ��Ʈ��ȣ ����, IP���X
	     server=new ServerSocket(1111);
	     System.out.println("������������ ���Ӵ����...");
	     
	     //����2 ���������� - ������ ���� 
	     Socket socket=server.accept();
	     System.out.println("����������� ����");
	     
	     //����3 ������ ������ Client�� �ּұñ� ��������
	     InetAddress add=socket.getInetAddress();
	     System.out.println(add + " ����ip�Դϴ�");
	     
	     //����4 ������ ���������� IOó���� �������ְ�ް�(��Ʈ������ �ް�-Reader,Writer)
	     InputStream is=socket.getInputStream();
	     OutputStream os=socket.getOutputStream();
	     
	     //����5  ����Ʈ(��Ʈ��)��  Reader,Writer��ȯ�ؼ� char������ �������ְ�޾ƿ�
	     InputStreamReader isr=new InputStreamReader(is);
	     OutputStreamWriter osw=new OutputStreamWriter(os);
	     
	     PrintWriter pw=new PrintWriter(osw);//������ �о �����ϴ� �������� ���� ��Ͼ���
	     BufferedReader br=new BufferedReader(isr);
	     
	      while(true) {
	      	String data=br.readLine();
	      	if(data==null) break;
	      	System.out.println("client ����: " + data);
	      }//while end
	      
	      br.close(); pw.close(); osw.close(); isr.close();
	      is.close(); os.close(); //socket.close();server.close();
			}catch (Exception e){ }	
	 }//serverStart end
}// UserServerTC class END



 //class ChatHandle extends Thread{����}
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






