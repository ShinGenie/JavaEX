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
			ServerSocket server = new ServerSocket(56789); // 서버에서 개방할 포트
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
 * 이렇게 해서, 쓰레드를 이용한 동시처리로 
 * 사용자들의 다중 접속을 처리하며,
 * 접속한 사용자들의 요구를 처리하는 형태의 서버를 구축해보았다.
 * 
 * 이번에 해보려고 하는건, A,B,C 라는 사용자가 이 프로그램을 쓰고 있는 상황에서 
 * 	A 사용자가 한 작업을 B,C 사용자도 알수 있게 프로그램을 개조해보려고 한다.
 * 
 * (사용자 간에 서로 영향을 주는 프로그램 : 채팅 , 알림과 같은 실시간 서비스.)
 *  
 * 
 * 
 */
























