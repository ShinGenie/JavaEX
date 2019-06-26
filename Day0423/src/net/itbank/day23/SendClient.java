package net.itbank.day23;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SendClient extends JFrame implements ActionListener{

	String ipnum="127.0.0.1";
	ReceiveServer rs=null;
	Socket socket = null;

	Container con ;
	JPanel jp= new JPanel();
	JButton jb = new JButton("���Ͽ���");

	SendClient() throws IOException{
		//frame
		this.setTitle("��������");
		this.setBounds(100,100,500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(jp);
		jp.add(jb);
		jb.addActionListener(this);

		//��������
		try {
			socket = new Socket(ipnum,7777);
		} catch (UnknownHostException e) {e.printStackTrace();} 
		System.out.println("������ ����Ǿ����ϴ�");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb) {

			FileDialog fd=new FileDialog(this, "���� ����", FileDialog.LOAD);
			fd.setVisible(true);
			
			//�������ۿ� Ŭ����
			String filePath = "C:/dev";
			String fileNm = "imo.png";
			try {
				FileSender fs = new FileSender(socket,filePath,fileNm);
				fs.start();
			} catch (IOException ie) {ie.printStackTrace();}
		}
	}
	public static void main(String[] args) throws IOException {	
		new SendClient();
	}//main end
}//class end


class FileSender extends Thread{

	Socket socket=null;
	String filePath="C:/dev";
	String fileNm = "";

	DataOutputStream dos;
	FileInputStream fis;
	BufferedInputStream bis;



	public FileSender(Socket socket, String filePath, String fileNm) throws IOException{

		this.socket = socket;
		this.filePath = filePath;
		this.fileNm = fileNm;

		//������ ���ۿ� ��Ʈ�� ����
		dos = new DataOutputStream(socket.getOutputStream());

	}

	@Override
	public void run() {
		//���������� ������ �˸���('file' ������ ����)
		try {
			dos.writeUTF("file");
			dos.flush();

			//������ ������ �о SocketServer�� ����
			String result = fileRead(dos);
			/*test*/System.out.println("result:"+result);
		} catch (IOException e) {e.printStackTrace();}
	}

	
	public String fileRead(DataOutputStream dos) throws IOException{
		
		String result="";

		dos.writeUTF(fileNm);
		/*test*/System.out.println("�����̸�"+fileNm+"�� �����Ͽ����ϴ�");

		//������ �о ������ ����
		File file = new File(filePath+"/"+fileNm);
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);

		int len;
		int size = 4096;
		byte[] data = new byte[size];
		while((len=bis.read(data))!=-1) {
			dos.write(data,0,len);
		}
		//����������
		dos.flush();

		/*--����ȴ�
		DataInputStream dis = new DataInputStream(sock.getInputStream());
//		result = dis.readUTF();
//		if(result.equals("success")) {
?			/*test*/
		//		System.out.println("���������۾��� �Ϸ��Ͽ����ϴ�.");			
		//			/*test*/System.out.println("���������� ������:"+file.length());
		//		}else {/*test*/ System.out.println("���۽���!");}

		result="success";
		fis.close();
		return result;

	} 

}

//class MsgSender extends Thread{
//	String msg="";
//	Socket socket;
//	DataOutputStream dos;
//	FileInputStream fis;
//	MsgSender(Socket socket, String msg){
//		this.socket = socket;
//	}
//	
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
//	}
//	
//}


