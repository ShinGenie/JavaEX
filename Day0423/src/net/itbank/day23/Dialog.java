package net.itbank.day23;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

class Dialog_out extends JDialog{
	
	Socket sock;
	BufferedReader br;
	OutputStream os;

	Dialog_out(JFrame frame, String title){
		super(frame,title);
		//		new Imoticon_1();

		JPanel jp = new JPanel();
		JButton jb[]=new JButton[9];
		jp.setLayout(new GridLayout(3,3));

		JButton jb1=new JButton(new ImageIcon("images/imo1.png"));
		JButton jb2=new JButton(new ImageIcon("images/imo2.png"));
		JButton jb3=new JButton(new ImageIcon("images/imo3.png"));
		JButton jb4=new JButton(new ImageIcon("images/imo4.png"));
		JButton jb5=new JButton(new ImageIcon("images/imo5.png"));
		JButton jb6=new JButton(new ImageIcon("images/imo6.png"));
		JButton jb7=new JButton(new ImageIcon("images/imo7.png"));
		JButton jb8=new JButton(new ImageIcon("images/imo8.png"));
		JButton jb9=new JButton(new ImageIcon("images/imo9.png"));
		jp.add(jb1);	jp.add(jb2);	jp.add(jb3);
		jp.add(jb4);	jp.add(jb5);	jp.add(jb6);
		jp.add(jb7);	jp.add(jb8);	jp.add(jb9);
		jb[0]=jb1;	jb[1]=jb2;	jb[2]=jb3;
		jb[3]=jb4;	jb[4]=jb5;	jb[5]=jb6;
		jb[6]=jb7;	jb[7]=jb8;	jb[8]=jb9;

		this.add(jp);
		this.setBounds(50,50,220,220);
		this.setResizable(false);
		


		for(int i=0;i<9;i++) {
//			jb[i].setContentAreaFilled(false);// 배경자체 빼기
			
			jb[i].setBackground(Color.white);
			jb[i].setFocusPainted(false);
			jb[i].addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) {
					for(int i=0;i<9;i++) {	
						if(e.getSource()==jb[i]) { 
							String data="";			
							dispose();}
					}
				}
			});
		}
	}

}




public class Dialog extends JFrame{
	Dialog_out dOut;
	Socket sock;
	BufferedReader br;
	OutputStream os;
	
	JFrame frame1 = new JFrame();
	Container contentPane = frame1.getContentPane();
	
	JPanel jp = new JPanel();
	JPanel jp1 = new JPanel();
	JTextArea jtp = new JTextArea(10,10);
	JButton btn = new JButton("이모티콘");
	
	
	public Dialog(){
		super("예제프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jp.add(jtp); jp.add(btn); 
		dOut = new Dialog_out(this,"끝내자");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn) dOut.setVisible(true);
			}
		});
		getContentPane().add(jp);
		setSize(300,300);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Service sv=new Service();
		sv.start();
	}
	
	class Service extends Thread{
		
		public void connect() {
			try {
				
				sock = new Socket("118.130.22.163", 8282);//소켓지정
				System.out.println("connected...");
				br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
				os=sock.getOutputStream(); // 서버로 보냄

			} catch (Exception e) {
				// TODO: handle exception
			}
		}


		public void run() {
			String data="";
			try {
				data=br.readLine();
				System.out.println("서버로부터 읽음 : "+data);
				if(data.charAt(0)=='/') {
					if(data.charAt(1)=='i') {
						data.substring(2);
						jtp.append(data);
					}
				}
				System.out.println(data+":서버에서 클라이언트에게 보냄");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			super.run();
		}
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Dialog();
	}

}
