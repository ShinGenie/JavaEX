package net.itbank.day18;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerMain {
	public static void main(String[] args) {
		System.out.println("[server] starting");
		long t1 = System.currentTimeMillis();
		try {
			ServerSocket server = new ServerSocket(56789); // �������� ������ ��Ʈ
			long t2 = System.currentTimeMillis();
			System.out.println("[server] startup in " + (t2 - t1) + " ms");
	
			while (!server.isClosed()) {
				Socket socket = server.accept(); //
				System.out.println("[server] connected by " + socket.getRemoteSocketAddress());
				Thread p = new ServerPersonal(socket);
				p.start();
			}
			server.close();
		} catch (IOException e) {
			System.out.println("[server] main error : " + e.toString());
			System.out.println("[server] terminated");
		}
	}//main end
}//class END

/*
 * �̷��� �ؼ�, �����带 �̿��� ����ó���� 
 * ����ڵ��� ���� ������ ó���ϸ�,
 * ������ ����ڵ��� �䱸�� ó���ϴ� ������ ������ �����غ��Ҵ�.
 * 
 * �̹��� �غ����� �ϴ°�, A,B,C ��� ����ڰ� �� ���α׷��� ���� �ִ� ��Ȳ���� 
 * 	A ����ڰ� �� �۾��� B,C ����ڵ� �˼� �ְ� ���α׷��� �����غ����� �Ѵ�.
 * 
 * (����� ���� ���� ������ �ִ� ���α׷� : ä�� , �˸��� ���� �ǽð� ����.)
 *  
 * 
 * 
 */
























