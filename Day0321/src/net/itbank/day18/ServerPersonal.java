package net.itbank.day18;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerPersonal extends Thread {
	static List<String> seats;
	
	static {
		seats = new ArrayList<>();
		seats.add("1-A");
		seats.add("4-H");
	}
	
	Socket socket;
	ObjectInputStream ois; 
	ObjectOutputStream oos;
	
	ServerPersonal(Socket soc) {
		socket =soc;
		try {
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			System.out.println("[server-"+getName()+"] socket error " + soc.getRemoteSocketAddress());
			throw new RuntimeException();
		}
	}//end
	
	
	public void run() {
		while (!socket.isClosed()) {
			String req;
			try {
				req = (String) ois.readObject();
			} catch (IOException|ClassNotFoundException	e) {
				break;
			}
			System.out.println("[server-"+getName()+"] received request : " + req);
			String[] reqs = req.split("#");
			String resp = null;
			switch (reqs[0]) {
			case "reserve":
				synchronized (seats) {
					if (seats.contains(reqs[1])) {
						resp = "false";
					} else {
						resp = "true";
						seats.add(reqs[1]);
					}
				}
				break;
			case "cancel":
				synchronized (seats) {
					if (seats.contains(reqs[1])) {
						resp = "true";
						seats.remove(reqs[1]);
					} else {
						resp = "false";
					}
				}
				break;
			case "all":
				resp = seats.toString().replace("[", "").replace("]", "").replace(" ", "").replace(",", "#");
				break;
			default:
				resp = "unknown";
			}
			
			try {
				oos.writeObject(resp);
				System.out.println("[server-"+getName()+"] sent response : " + resp);
			}catch(IOException e) {
				break;
			}
		}
		System.out.println("[server-"+getName()+"] disconnect  : " + socket.getRemoteSocketAddress());
	} //run end
	
}//class END
