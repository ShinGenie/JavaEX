package net.itbank.day23;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveServer {
	
	ServerSocket serverSocket = null;
	Socket socket = null;
	
	ReceiveServer() throws IOException{
		serverSocket = new ServerSocket(7777);
		System.out.println("������ ���۵Ǿ����ϴ�");
		
		//Ŭ���̾�Ʈ ���ѷ������ 
		while(true) {
			System.out.println("���ο� client �����û�� ��ٸ��ϴ�");
			//����Ǹ� ��ſ� ���ϻ���
			socket=serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�");
			//���� ���ſ� Ŭ���� ���� �� ����
			 Receiver receiver = new Receiver(socket);
			 receiver.start();
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		new ReceiveServer();
	}

}

//���� ���ſ� Ŭ���� ���� �� ���� // �޴� ��

class Receiver extends Thread{
	Socket socket = null;
	//�޴� ��
	DataInputStream dis = null;
	//������ ��
	FileOutputStream fos = null;
	BufferedOutputStream bos = null;
	DataOutputStream dos = null;
	
	Receiver(Socket socket){
		this.socket = socket;
		
	}
	@Override
	public void run() {
		
		try {
			//���� �ޱ� 
			dis = new DataInputStream(socket.getInputStream());
			String type = dis.readUTF();
			
			/*type��(file �Ǵ� msg)�� �������� ������ ���۵ƴ��� ���ڿ��� ���۵ƴ��� �����Ѵ�*/
			if(type.equals("file")) {
				String result = filewrite(dis);
				System.out.println("result:"+result);
			}else if(type.equals("msg")) {
				String result = getMsg(dis);
				System.out.println("result:"+result);
			}
		} catch (IOException e) {e.printStackTrace();}
		
		
		}

	public String filewrite(DataInputStream dis) throws IOException{
		String result ="";
		String filePath =dis.readUTF();
		String fileNm =dis.readUTF();
		
		File file = new File(filePath+"/"+fileNm);
		System.out.println("������ String ������ �о����ϴ�");
		
		fos = new FileOutputStream(file);
		bos = new BufferedOutputStream(fos);
		System.out.println(fileNm+"�� �����Ͽ����ϴ�");
		
		//����Ʈ ������ ���۹����鼭 ���
		int len;
		int size = 4096;
		byte[] data = new byte[size];
		while((len=dis.read(data))!=-1) {
			bos.write(data,0,len);
		}
		bos.flush();
		result = "SUCCESS";
		System.out.println("���� �ޱ⸦ �Ϸ��Ͽ����ϴ�");
		return result;
		// ���ö� fileoutput���� �׸��� buffered�� ��ȯ��������ϴ±���!!
	}
	public String getMsg(DataInputStream dis) throws IOException{

			String result = "";
			String msg = dis.readUTF();
			System.out.println("�޼����� �����Ͽ����ϴ� msg:"+msg);
			result = "SUCCESS";
			dis.close();
			return result;
	}
	
}






















