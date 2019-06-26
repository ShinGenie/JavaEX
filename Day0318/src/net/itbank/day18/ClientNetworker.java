package net.itbank.day18;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientNetworker {
	Socket socket;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	public ClientNetworker(String ip) {
		try {
			socket = new Socket(ip, 56789);
			// ��ü �����Ǹ鼭, io�� Ȯ����ä�� ��������� ����. 
			// DataInOut, BufferedReader,Writer �� �̸� �ȸ����ΰ�,
			// send , receive �� �Ҷ��� ���� ����� ����. ObjectIO�� �����.
			oos = new ObjectOutputStream(socket.getOutputStream());	
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			System.out.println("[client] network error");
			throw new RuntimeException();
		}
	}
	
	public String sendAndReceive(String req) {
		try {
			oos.writeObject(req);
			System.out.println("[client] sent request : " + req);
			String resp =(String)ois.readObject();
			System.out.println("[client] received response : " + resp);
			return resp;
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("[client] data exchange failed : "+ e.toString());
			return "error";
		}
	}//end
	
	
}//class END
