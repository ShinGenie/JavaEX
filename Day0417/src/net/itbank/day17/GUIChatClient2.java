package net.itbank.day17;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIChatClient2 extends JFrame implements ActionListener,Runnable{

	JPanel mainPan, firstPan, twoPan;
	JButton btn_connect, btn_send, btn_exit;
	JTextField txt_server_ip, txt_name, txt_input;
	TextArea txt_list;
	CardLayout cardlayout;

	String ip_txt;
	Socket sock;
	final int PORT=7500;
	///// java.io/////
	PrintWriter pw=null;
	BufferedReader br=null;
	OutputStream os=null;

	public GUIChatClient2(){
		this.setTitle("Chatting Client(ver 2.0");
		servertConnect(); // firstPan
		ChatPane(); //twoPan

		//card===============================
		mainPan = new JPanel();
		cardlayout = new CardLayout();
		mainPan.setLayout(cardlayout);

		mainPan.add(firstPan, "����â");
		mainPan.add(twoPan, "ä��â");
		cardlayout.show(mainPan, "����â");
		//===================================
		this.add(mainPan);
		this.setSize(450,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//event process======================
		btn_connect.addActionListener(this);
		btn_send.addActionListener(this);
		btn_exit.addActionListener(this);
		txt_input.addActionListener(this);
		//===================================

	}//end

	private void servertConnect() {//fisrtPan
		firstPan = new JPanel();

		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		JPanel pn3 = new JPanel();

		btn_connect = new JButton("������ ���� Connection");
		txt_server_ip = new JTextField("118.0.0.1",15);
		txt_name = new JTextField("Genie",15);

		JLabel info = new JLabel("IP�� ��ȭ���� �Է��ϼ���");
		info.setFont(new Font("����ü",Font.BOLD,15));
		info.setForeground(Color.red);

		JLabel lb1 = new JLabel("���� I P : ");

		JLabel lb2 = new JLabel("�� ȭ �� : ");
		lb2.add(txt_name);

		pn1.add(lb1); pn1.add(txt_server_ip);
		pn2.add(lb2); pn2.add(txt_name);
		pn3.add(pn1); pn3.add(pn2); pn3.add(info);
		firstPan.setLayout(new BorderLayout());
		firstPan.add("Center",pn3);
		firstPan.add("South", btn_connect);
		firstPan.setBorder(BorderFactory.createTitledBorder("����ä��ȭ��"));

	}

	private void ChatPane() {//twoPan
		twoPan = new JPanel();

		btn_send = new JButton("send");
		btn_exit = new JButton("������");
		txt_input = new JTextField("�Է��ϼ���",20);
		txt_list = new TextArea();

		twoPan.setLayout(new BorderLayout());
		twoPan.add("Center",txt_list);
		twoPan.setBorder(BorderFactory.createTitledBorder("��ȭ�ϱ�"));

		JPanel pn = new JPanel();
		pn.add(txt_input); pn.add(btn_send); pn.add(btn_exit);
		twoPan.add("South",pn);
	}


	@Override
	public void run() {
		try {
			sock = new Socket(ip_txt, PORT);
			String nickname = txt_name.getText();
			os=sock.getOutputStream();
			pw=new PrintWriter(new OutputStreamWriter(os));
			pw.println(nickname);
			pw.flush();
			InputStream is = sock.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));

			String str;
			while(true){
				str=br.readLine();
				txt_list.append(str+"\n");
			}//while end

		} catch (IOException e) {e.printStackTrace();}

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object ob = ae.getSource();
		if(ob==btn_connect){
			cardlayout.show(mainPan, "ä��â");
			this.setTitle("������ �̸�:"+txt_name.getText());
			ip_txt=txt_server_ip.getText();
			Thread th = new Thread(this);
			th.start();
		}
		if(ob==btn_send){ send(); }
		if(ob==txt_input){ send(); }
		if(ob==btn_exit){
			pw.println(txt_name.getText()+"�� �����մϴ�\n");
			pw.flush();
			System.exit(1);
		}
	}//actionPerformed end

	public void send(){
		String txt=txt_input.getText();
		txt_input.setText("");
		txt_input.requestFocus();
		pw.println(txt);
		pw.flush();
		if(txt.equals("q")||txt.equals("quit")){
			txt="ä�ù��� �����մϴ�";
			pw.println(txt_name.getText()+"�� �����մϴ�\n");
			pw.flush();
			System.out.println("ä��Ŭ���̾�Ʈ ���� ���α׷��� ����˴ϴ�");
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		new GUIChatClient2();
	} //end

}//GUIChatClient class END























