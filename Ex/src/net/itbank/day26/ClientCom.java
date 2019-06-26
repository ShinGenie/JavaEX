package net.itbank.day26;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class ClientCom extends JFrame implements ActionListener {
	
	JFrame f = new JFrame();
	Container contentPane = f.getContentPane();
	JTextPane jtp = new JTextPane();
	JTextField jf = new JTextField(10);
	JButton jb = new JButton("send");
//	JPanel jp = new JPanel();
	JPanel jp1 = new JPanel();
	JTextArea txtLog = new JTextArea();
	JScrollPane scrollPane;
	
	String ip = "127.0.0.1";
	Socket socket;
	BufferedReader br;
	OutputStream out=null;
	InputStreamReader isr;
	OutputStreamWriter osw;

	public ClientCom() throws UnknownHostException, IOException{
		
		socket = new Socket(ip,7777);
		
	
		
		
		
		
		f.setSize(300,300);
		f.setLayout(new BorderLayout());
		scrollPane = new JScrollPane(txtLog);
		contentPane.add(scrollPane); 
		jp1.add(jf); jp1.add(jb);
		f.add(jp1,"South");
		jb.addActionListener(this);
		//화면크기알기
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		//프레임 크기알기
		Dimension dimen1 = f.getSize();
		//그다음 프레임의 위치표시해주는 함수도 알아야한다.
		// x,y좌표는 프레임의 왼쪽끝모서리의 좌표

		//위는 정중앙 좌표값이 x,y가 되서 프레임이 정중앙에 위치하는 것은 아님. 
		//왼쪽으로 프레임 반만큼 이동 윗쪽으로 프레임 반만큼 이동해야함
		int x = (int) (dimen.getWidth()/2 - dimen1.getWidth()/2);
		int y = (int) (dimen.getHeight()/2 - dimen1.getHeight()/2);
		f.setLocation(x,y);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			
			
		if(e.getSource()==jb) {
			try {
				System.out.println("버튼누름");
				out.write((jf.getText()).getBytes());
				System.out.println("서버로 보냄");
				jf.setText("");
				jf.requestFocus();
			} catch (IOException e1) {e1.printStackTrace();} // 서버로 바이트형식 getText 보냄
		}//jtp.insertIcon(g); -> 이미지아이콘 패인에 넣기
	}
	
//	private void insert(String txt) {
//		txtLog.append(jf.getText()+"\n");//로그내용을 jtextxtLogrea위에 붙여주고
//		txtLog.setCaretPosition(txtLog.getDocument().getLength());// 맨아래로 스크롤한다
//		jf.setText("");
//		jf.requestFocus();
//	}


	
//	class Receive extends Thread {
//		
//		Receive() throws IOException{
//			
//			
//			// data == socket.getInputStream();
//			
//		}
//
//		@Override
//		public void run() { // 서버로부터 받는 것을 run에 집어넣는다
//		
//			while(true) {
//				try {
//					String msg = br.readLine();
//					System.out.print("서버로부터 받은 메세지:"+msg);
//					if(msg.charAt(0)=='/') {
//						if(msg.charAt(1)=='n') {
//							
//						}
//					}
//				} catch (IOException e) {e.printStackTrace();}
//			}
//		}
//		
//		
//	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		new ClientCom();
	}

}
