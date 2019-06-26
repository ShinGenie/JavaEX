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
		//ȭ��ũ��˱�
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		//������ ũ��˱�
		Dimension dimen1 = f.getSize();
		//�״��� �������� ��ġǥ�����ִ� �Լ��� �˾ƾ��Ѵ�.
		// x,y��ǥ�� �������� ���ʳ��𼭸��� ��ǥ

		//���� ���߾� ��ǥ���� x,y�� �Ǽ� �������� ���߾ӿ� ��ġ�ϴ� ���� �ƴ�. 
		//�������� ������ �ݸ�ŭ �̵� �������� ������ �ݸ�ŭ �̵��ؾ���
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
				System.out.println("��ư����");
				out.write((jf.getText()).getBytes());
				System.out.println("������ ����");
				jf.setText("");
				jf.requestFocus();
			} catch (IOException e1) {e1.printStackTrace();} // ������ ����Ʈ���� getText ����
		}//jtp.insertIcon(g); -> �̹��������� ���ο� �ֱ�
	}
	
//	private void insert(String txt) {
//		txtLog.append(jf.getText()+"\n");//�α׳����� jtextxtLogrea���� �ٿ��ְ�
//		txtLog.setCaretPosition(txtLog.getDocument().getLength());// �ǾƷ��� ��ũ���Ѵ�
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
//		public void run() { // �����κ��� �޴� ���� run�� ����ִ´�
//		
//			while(true) {
//				try {
//					String msg = br.readLine();
//					System.out.print("�����κ��� ���� �޼���:"+msg);
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
