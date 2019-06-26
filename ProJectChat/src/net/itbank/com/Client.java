package net.itbank.com;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame implements ActionListener{
	String ip ,id ,pw;
	final int port=7777;
	
	JLabel name_la=new JLabel("이름");
	JButton ok_btn=new JButton("확인");
	JButton regist=new JButton("회원가입");
	JLabel id_jl=new JLabel("ID");
	JLabel pw_jl=new JLabel("PW");
	
	JTextField id_tf=new JTextField();
	JTextField pw_tf=new JTextField();
	
	JTextField port_tf=new JTextField();
	JTextField name_tf=new JTextField();
	JTextField ip_tf=new JTextField();
	JPanel bottom=new JPanel();
	JPanel center=new JPanel();
	
	public Client(){
		super("회원");
		center.setLayout(new GridLayout(4,1));
		
		setLayout(new BorderLayout());
		setSize(200,150);
		setLocation((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2-200, 
				(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2-150);
		
		ip="118.130.22.166";
		
		center.add(id_jl);
		center.add(id_tf);
		
		center.add(pw_jl);
		center.add(pw_tf);
		
		bottom.setLayout(new FlowLayout());
		bottom.add(ok_btn);
		bottom.add(regist);
		
		add(center,BorderLayout.CENTER);
		add(bottom,BorderLayout.SOUTH);
		
		id_tf.requestFocus();
		ok_btn.addActionListener(this);
		regist.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int ok=JOptionPane.showConfirmDialog(null, "종료하시겠습니까","종료",
						JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if(ok==JOptionPane.YES_OPTION){
					System.exit(0);
				}else{
					setVisible(false);
					new Client();
				}
			}
			
		});
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		new Chat("",ip,port);
	}
	
	public static void main(String[] args) {
		new Client();
	}
}