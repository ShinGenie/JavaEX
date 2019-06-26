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
	JButton jb = new JButton("파일열기");

	SendClient() throws IOException{
		//frame
		this.setTitle("파일전송");
		this.setBounds(100,100,500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(jp);
		jp.add(jb);
		jb.addActionListener(this);

		//서버연결
		try {
			socket = new Socket(ipnum,7777);
		} catch (UnknownHostException e) {e.printStackTrace();} 
		System.out.println("서버에 연결되었습니다");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb) {

			FileDialog fd=new FileDialog(this, "파일 열기", FileDialog.LOAD);
			fd.setVisible(true);
			
			//파일전송용 클래스
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

		//데이터 전송용 스트림 생성
		dos = new DataOutputStream(socket.getOutputStream());

	}

	@Override
	public void run() {
		//서버전송을 서버에 알린다('file' 구분자 전송)
		try {
			dos.writeUTF("file");
			dos.flush();

			//전송할 파일을 읽어서 SocketServer에 전송
			String result = fileRead(dos);
			/*test*/System.out.println("result:"+result);
		} catch (IOException e) {e.printStackTrace();}
	}

	
	public String fileRead(DataOutputStream dos) throws IOException{
		
		String result="";

		dos.writeUTF(fileNm);
		/*test*/System.out.println("파일이름"+fileNm+"을 전송하였습니다");

		//파일을 읽어서 서버에 전송
		File file = new File(filePath+"/"+fileNm);
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);

		int len;
		int size = 4096;
		byte[] data = new byte[size];
		while((len=bis.read(data))!=-1) {
			dos.write(data,0,len);
		}
		//서버에전송
		dos.flush();

		/*--먹통된다
		DataInputStream dis = new DataInputStream(sock.getInputStream());
//		result = dis.readUTF();
//		if(result.equals("success")) {
?			/*test*/
		//		System.out.println("파일전송작업을 완료하였습니다.");			
		//			/*test*/System.out.println("보낸파일의 사이즈:"+file.length());
		//		}else {/*test*/ System.out.println("전송실패!");}

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


