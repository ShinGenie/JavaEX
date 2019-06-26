package net.itbank.com;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainClass extends JFrame implements ActionListener{
	private JButton serverbtn=new JButton("서버");
	//private JButton clientbtn=new JButton("클라이언트");
	private JButton exitbtn=new JButton("종료");
	private ServerSocket server;
	private Socket socket;
	private final int port=7777;
	
	public MainClass(){
		super("메인");
		setLayout(new GridLayout(2,1));
		add(serverbtn);
		serverbtn.addActionListener(this);
		
		//add(clientbtn);
		//clientbtn.addActionListener(this);
		
		add(exitbtn);
		exitbtn.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				exitMessage();
			}
		});
		
		setBounds(300, 300, 150, 150);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==serverbtn){
			JOptionPane.showMessageDialog(this, "재실행해주세요.");
			dispose();
			try{
				server=new ServerSocket(port);
				System.out.println(getTime.getTimes()+"서버 생성");
				while(true){
					socket=server.accept();
					Thread t=new PerClient(socket);
					t.start();
				}
			}catch(Exception ex){
				ex.getStackTrace();
			}
		}else{
			exitMessage();
		}
	}
	
	public void exitMessage(){
		int ok=JOptionPane.showConfirmDialog(this, "종료하시겠습니까?",
				"종료", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
		if(ok==JOptionPane.YES_OPTION){
			System.exit(0);
		}else{
			setVisible(false);
			new MainClass();
		}
	}
	
	public static void main(String[] args) {
		new MainClass();
	}
}