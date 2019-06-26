package net.itbank.day23;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
import java.net.*;

public class Server extends JFrame{

	private Container con;
	private JButton send;
	private JTextArea ta;
	private JScrollPane viewport;
	
	//��������
	public static final int PORT = 12345;
	private ServerSocket server;
	private Socket socket;
	
	//Ŭ���̾�Ʈ ���� ����Ʈ
	private ArrayList<UserInfo> user;
	
	class UserInfo extends Thread{
		private String userId;
		private Socket socket;
		private BufferedReader br;
		private PrintWriter pw;
		
		public UserInfo(Socket socket) {
			try{
				this.socket = socket;
				this.br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				this.pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
				this.setDaemon(true);
				this.start();
			}catch(Exception e){
				e.printStackTrace();
			}
		}//end
		
		public void setUserId(String userId){
			this.userId = userId;
		}//end
		
		public String getUserId(){
			return userId;
		}//end
		
		public Socket getSocket() {
			return socket;
		}//end
		
		public BufferedReader getBr() {
			return br;
		}//end
		
		public PrintWriter getPw() {
			return pw;
		}//end
		
		public void close(){
			try{
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(socket != null) socket.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}//end
		
		public void run() {
			//echo ��� ����
			String msg = "";
			while(true){
				try{
					msg = br.readLine();
					System.out.println("���� run�޼ҵ� msg  " + msg);
					String first=msg.substring(0,7);
					System.out.println("���� run�޼ҵ�  first  " + first);
					//if(msg.startsWith("$sdfile")){
					  if(first.equals("$sdfile")) {
					  String filename = msg.substring(7).split("::")[0];
						System.out.println("���� run�޼ҵ� ���ϸ� = " + filename);
						long filesize = Long.parseLong(msg.substring(7).split("::")[1]);
						setFileReceiver(this, filename, filesize);
						continue;
					  }
					//}
					if(msg != null){
						addText(socket + " : " + msg);
						echo(msg);
					}
				}catch(Exception e){ 
					System.out.println("���Ͽ���=" + e.toString());	
					removeUser(this);	
					}
			}//while end
		}
		
	}//class END
	
	public Server(){
		setTitle("Young Chat Server");
		init();
		event();
		menu();
		setSize(new Dimension(500, 600));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = screen.width/2 - getWidth()/2;
		int ypos = screen.height/2 - getHeight()/2;
		setLocation(xpos-100, ypos-100);
		setVisible(true);
		serverStart();
	}//end
	
	public void init(){
		con = this.getContentPane();
		
		ta = new JTextArea();
		ta.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		ta.setEditable(false);
		ta.setBackground(Color.PINK);
		viewport = new JScrollPane();
		viewport.setViewportView(ta);
		
		con.setLayout(new BorderLayout());
		con.add(viewport, BorderLayout.CENTER);
	}//end
	
	public void event(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end
	
	public void menu(){}
	
	public void addText(String text){
		ta.append(text+"\n");
		viewport.getVerticalScrollBar().setValue(viewport.getVerticalScrollBar().getMaximum());
	}//end

	public void serverStart(){
		addText("Server Start...  12345");
		user = new ArrayList<UserInfo>();
		
		//���� ���Ѵ��
		try{
			server = new ServerSocket(PORT);
			while(true){
				socket = server.accept();
				addUser(socket);
			}
		}catch(Exception e){
			alert("���� �̹� ������");
			return;
		}
	}//end
	
	public synchronized void setFileReceiver(UserInfo sender, String filename, long filesize){
		//echo �̿��Ͽ� ���� ���� ���۽�Ű��
		echo("$sdstart", sender);
		
		Thread receive = new Thread(){
			public void run(){
				try{
					InputStream input = sender.getSocket().getInputStream();
					byte[] buffer = new byte[1024];
					long totalReadBytes = 0;//�� ���� �����ͷ�
					int readBytes;//1ȸ ���� �����ͷ�
					
					System.out.println("filename="+filename  );
					File file = new File("file/"+filename);//������Ʈ����� file������ ����
					FileOutputStream fos = new FileOutputStream(file);
					BufferedOutputStream bos2 = new BufferedOutputStream(fos);
					
					while((readBytes = input.read(buffer))!=-1){
						//fos.write(buffer, 0, readBytes);
						bos2.write(readBytes);
						readBytes += readBytes;
					}
					ta.append(filename+" ���Ͼ��ε� ��������\n");
					bos2.close();		input.close();	fos.close();
				}catch(Exception e){
					System.out.println(e.toString());	
				}
			}
		};
		receive.setDaemon(true);
		receive.start();
	}//end
	
	public void addUser(Socket socket){
		user.add(new UserInfo(socket));
		//addText("���� ���� : " + socket.toString());
	}//end
	
	public void removeUser(UserInfo target){
		if(user==null||user.size()==0) return;
		if(user.contains(target)){
			user.remove(target);
			addText("���� ���� : " + target.toString());
			target.close();
		}
	}//end
	
	public void alert(String msg){
		JOptionPane.showMessageDialog(this, msg);
	}//end
	
	public void echo(String text){
		for(UserInfo target : user){
			target.getPw().println(text);
			target.getPw().flush();
		}
	}//end
	
	public void echo(String text, UserInfo target){
		target.getPw().println(text);
		target.getPw().flush();
	}//end
	
	public static void main(String[] args) {
		new Server();
	}//end
	
}//Server class END
