package net.itbank.com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.sql.Savepoint;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class Chat extends JFrame implements ActionListener,Runnable{
	String name;
	String ip ,myip;
	int port;
	JButton send_btn=new JButton("전송");
	JTextField tf=new JTextField(10);
	Socket client;
	JScrollPane jsp;
	ObjectInputStream oi;
	ObjectOutputStream oo;
	
	JMenuItem item[]=new JMenuItem[6];
	ImageIcon icon[]=new ImageIcon[6];
	JMenu menu;
	JMenuBar bar;
	JTextPane jp;
	JTextArea ta;
	JLabel open=new JLabel();
	
	
	public Chat(){
		
	}
	
	public Chat(String name,String ip,int port){
		super("채팅");
		this.name=name;
		this.ip=ip;
		this.port=port;
		
		open.setIcon(new ImageIcon(new ImageIcon("images/open.jpg").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		open.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser jf=new JFileChooser();
				FileNameExtensionFilter filter=new FileNameExtensionFilter("text파일","text","txt");
				jf.setFileFilter(filter);
				
				int r=jf.showOpenDialog(null);
				if(r!=jf.APPROVE_OPTION){
					JOptionPane.showMessageDialog(null,"파일을 선택하지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				try{
					write("open#"+jf.getSelectedFile().getPath());
				}catch(Exception ex){
					ex.getStackTrace();
				}
				
				super.mouseClicked(e);
			}
			
		});
		ta=new JTextArea(10,7);
		jp=new JTextPane();
		ta.setEditable(false);
		menu=new JMenu();
		Image ic=new ImageIcon("images/emoimage.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		menu.setIcon(new ImageIcon(ic));
		
		
		
		for(int i=0; i<icon.length; i++){
			icon[i]=new ImageIcon("images/image"+i+".png");
			icon[i]=new ImageIcon(icon[i].getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
			item[i]=new JMenuItem(icon[i]);
			item[i].addActionListener(this);
			menu.add(item[i]);
		}
		
		bar=new JMenuBar();
		bar.add(menu);
		bar.setBackground(Color.WHITE);
		jp.setBackground(Color.cyan);
		
		setJMenuBar(bar);
		
		setSize(300, 300);
		setLocation(Toolkit.getDefaultToolkit().getScreenSize().width - 300,
				Toolkit.getDefaultToolkit().getScreenSize().height -330);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "종료하시겠습니까","종료",
						JOptionPane.INFORMATION_MESSAGE);
				try{
					if(oo!=null) oo.close();
					if(oi!=null) oi.close();
					if(client!=null) client.close();
				}catch(Exception ex){
					ex.getStackTrace();
				}
				System.exit(0);
			}
		});
		
		tf.addActionListener(this);
		send_btn.addActionListener(this);
		jp.setEditable(false);
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(KeyEvent.VK_ENTER==e.getKeyCode()){
					String msg = tf.getText().trim();
					if (msg.length() > 0) {
						tf.setText("");
						tf.requestFocus();
						if (oo != null) {
							try{
								write("text#"+msg + "\n");
							}catch(Exception ex){
								ex.getStackTrace();
							}
						}
					}
				}
			}
		});
		
		JPanel bottom=new JPanel();
		bottom.setBackground(Color.WHITE);
		bottom.add(tf);
		bottom.add(send_btn);
		bottom.add(open);
		
		jsp=new JScrollPane(jp, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(bottom,BorderLayout.SOUTH);
		add(jsp,BorderLayout.CENTER);
		add(ta,BorderLayout.WEST);
		setVisible(true);
		
		try{
			client=new Socket(ip, port);
			myip=InetAddress.getLocalHost().getHostAddress();
			oi=new ObjectInputStream(client.getInputStream());
			oo=new ObjectOutputStream(client.getOutputStream());
			
			oo.writeUTF(name);
			oo.flush();
			
			Thread thread = new Thread(this);
			thread.setDaemon(true);
			thread.start();
			
		}catch(Exception e){
			e.getStackTrace();
		}
		tf.requestFocus();
	}
	
	public JTextArea getta(){
		return ta;
	}
	
	public void insertString(String str) throws BadLocationException{
		Document a=jp.getDocument();
		a.insertString(jp.getDocument().getLength(),str , null);
		jp.setCaretPosition(jp.getDocument().getLength());
	}
	
	public void write (String str) throws IOException{
		oo.writeObject(str);
		oo.flush();
	}
	
	
	@Override
	public void run() {
		String msg="";
		
		while(client!=null){
			try {
				
				
				msg = ((String)oi.readObject()).trim();
				String n[]=msg.split("#");
				
				String b=n[0].substring(n[0].length()-4);
				String c=n[0].substring(0,n[0].length()-4);
				
				if(b.equals("text")){
					insertString(c+n[1]+"\n");
				}else if(b.equals("icon")){
					String url=n[1];
					String name=n[0].substring(0,3).trim();
					ImageIcon i=new ImageIcon(url.trim());
					i=new ImageIcon(i.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
					insertString(name+"]"+"\n");
					jp.insertIcon(i);
					insertString("\n");
				}else if(b.equals("open")){
					File f=new File(n[1]);
					Scanner sc=new Scanner(f);
					while(sc.hasNext()){
						insertString(c+sc.nextLine()+"\n");
					}
				}else if(b.equals("save")){
					
				}
				
			} catch (Exception e) {
				break;
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		try{
			String msg = tf.getText().trim();
			
			Object ob=e.getSource();
			for(int i=0; i<item.length; i++){
				if(ob==item[i]){
					write("icon#"+"images/image"+i+".png");
				}
			}
			
			if(ob==send_btn){
				if (msg.length() > 0) {
					tf.setText("");
					tf.requestFocus();
					if (oo != null) {
						write("text#"+msg + "\n");
					}
				}
			}
		}catch(Exception ex){
			ex.getStackTrace();
		}
	}
}