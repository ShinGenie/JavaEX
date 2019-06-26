package net.itbank.Day0412;

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

public class GUIChatClient extends JFrame implements ActionListener,Runnable{ 
	JPanel mainPan, firstPan, twoPan;  

	JLabel  msg;
	JButton btn_connect, btn_send, btn_exit;
	JTextField txt_server_ip, txt_name, txt_input;
	TextArea txt_list;
	CardLayout cardlayout; 
	
	String ip_txt;                            
	Socket sock;
	final int PORT=7500;
	PrintWriter pw=null;                
	BufferedReader br=null;            
	OutputStream os=null;
	
	public GUIChatClient() 	{
	 this.setTitle("Chatting Client(ver 2.0)");
		serverConnect();
		ChatPane();
		
		//card-----------------------------
		mainPan = new JPanel();
		cardlayout = new CardLayout();// â â ��ġ�� �����ִ� ��
		mainPan.setLayout(cardlayout);
		mainPan.add(firstPan,"����â");
		mainPan.add(twoPan,"ä��â");
//		cardlayout.show(mainPan, "����â"); //�⺻���� 
		//----------------------------------
		add(mainPan);
		setBounds(200,200,450,300);
		setVisible(true);
		
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�̺�Ʈó��-----------------------
		btn_connect.addActionListener(this);
		btn_exit.addActionListener(this);
		btn_send.addActionListener(this);
		txt_input.addActionListener(this);
		//----------------------------------
	} //end
	
	public void serverConnect() {
		//ó���̸� connectPane() 
		firstPan = new JPanel();
		JPanel pn=new JPanel();
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		
		msg = new JLabel("IP�� ��ȭ���� �Է��Ͻÿ�");
		msg.setFont(new Font("����ü", Font.BOLD, 15));
		msg.setForeground(Color.magenta);
		
		JLabel lb1 = new JLabel("���� I P : ");
		txt_server_ip = new JTextField("127.0.0.1", 15);
		//txt_server_ip = new JTextField("�����ip�ּҹ� ����ip�ּ�", 15);
		pn1.add(lb1);    pn1.add(txt_server_ip);
		
		JLabel lb2 = new JLabel("�� ȭ �� : ");
		txt_name = new JTextField("young",15);	
		
		pn2.add(lb2);    pn2.add(txt_name);
		
		pn.add(pn1);     pn.add(pn2);    pn.add(msg);
		
		btn_connect = new JButton("����������Connection");
		
		firstPan.setBorder(BorderFactory.createTitledBorder("����ä��ȭ��"));
		firstPan.setLayout(new BorderLayout(3,1));
		firstPan.add(pn,"Center");
		firstPan.add(btn_connect,"South");
	} //end
	
	public void ChatPane(){
		twoPan = new JPanel();
		JPanel  pn = new JPanel();
		txt_list = new TextArea();
		txt_input = new JTextField("",20);
		btn_send = new JButton("����");
		btn_exit = new JButton("����(q,quit)");

		pn.setBorder(BorderFactory.createTitledBorder("�ٴ�ȭ�ϱ��"));
		twoPan.setBorder(BorderFactory.createTitledBorder("��ä�ó����"));
		pn.add(txt_input);   pn.add(btn_send);  pn.add(btn_exit);
		
		twoPan.setLayout(new BorderLayout());
		twoPan.add(txt_list, "Center");
		twoPan.add(pn, "South");
	} //end

	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
			if(ob == btn_connect){ 
				cardlayout.show(mainPan, "ä��â");
				this.setTitle("�������̸�:" + txt_name.getText());
				ip_txt=txt_server_ip.getText();
				Thread th=new Thread(this);  // ������������
				th.start();
			}
		
			if(ob == btn_send) { send( ); }
			if(ob == txt_input) { send( ); }
			if(ob == btn_exit){
				//pw.println( txt_name.getText() +"�� �����մϴ�\n");
				//pw.flush();
				System.exit(1);
			}
	}	//actionPerformed end

		public void send( ){
			String text=txt_input.getText();
			if(text.equals("q")||text.equals("quit")){
			  text="ä�ù��� �����մϴ�";
			  //pw.println( txt_name.getText() +"�� �����մϴ�\n");
			  //pw.flush();
			  System.out.println("ä��Ŭ���̾�Ʈ ���� ���α׷��� ����˴ϴ�");
			  System.exit(1);
			}
		
			txt_input.setText("");
			txt_input.requestFocus(); 
			pw.println(text);
			pw.flush();
		} //end
	
		
	public void run() {
	  /*
		try{
			sock = new Socket(ip_txt, PORT);
			String nickname=txt_name.getText();
			os=sock.getOutputStream();
			pw=new PrintWriter(new OutputStreamWriter(os));
			pw.println(nickname);           
			pw.flush();
			InputStream is=sock.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
			
			String str;
			while(true)	{
				str=br.readLine();
				txt_list.append(str + "\n");
			} //while end			
		}catch(IOException e){  }		
	 */
	} //run end
	
	 public static void main(String[] args) {
	 	new GUIChatClient();
//	 	new GUIChatClient().ChatPane();
	 } //end
}//GUIChatClient class END