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
		System.out.println("서버가 시작되었습니다");
		
		//클라이언트 무한루프대기 
		while(true) {
			System.out.println("새로운 client 연결요청을 기다립니다");
			//연결되면 통신용 소켓생성
			socket=serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다");
			//파일 수신용 클래스 생성 및 시작
			 Receiver receiver = new Receiver(socket);
			 receiver.start();
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		new ReceiveServer();
	}

}

//파일 수신용 클래스 생성 및 시작 // 받는 것

class Receiver extends Thread{
	Socket socket = null;
	//받는 것
	DataInputStream dis = null;
	//나가는 것
	FileOutputStream fos = null;
	BufferedOutputStream bos = null;
	DataOutputStream dos = null;
	
	Receiver(Socket socket){
		this.socket = socket;
		
	}
	@Override
	public void run() {
		
		try {
			//파일 받기 
			dis = new DataInputStream(socket.getInputStream());
			String type = dis.readUTF();
			
			/*type값(file 또는 msg)를 기준으로 파일이 전송됐는지 문자열이 전송됐는지 구분한다*/
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
		System.out.println("파일을 String 형으로 읽었습니다");
		
		fos = new FileOutputStream(file);
		bos = new BufferedOutputStream(fos);
		System.out.println(fileNm+"을 생성하였습니다");
		
		//바이트 데이터 전송받으면서 기록
		int len;
		int size = 4096;
		byte[] data = new byte[size];
		while((len=dis.read(data))!=-1) {
			bos.write(data,0,len);
		}
		bos.flush();
		result = "SUCCESS";
		System.out.println("파일 받기를 완료하였습니다");
		return result;
		// 나올때 fileoutput으로 그리고 buffered로 변환시켜줘야하는구낭!!
	}
	public String getMsg(DataInputStream dis) throws IOException{

			String result = "";
			String msg = dis.readUTF();
			System.out.println("메세지를 생성하였습니다 msg:"+msg);
			result = "SUCCESS";
			dis.close();
			return result;
	}
	
}






















