package net.itbank.day19;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

public class Client extends JFrame implements Runnable{
	private Container con;
	
	private JTextField input;
	private JTextArea display;
	private JScrollPane viewport;
	
	private JButton send;
	
	private JPanel panel;
	
	//�޴�
	private JMenuBar menubar;
	private JMenu file;
	private JMenuItem save;
	private JMenuItem filesend;
	private JMenuItem exit;
	
	//��µ���
	private PrintWriter pw;
	
	//�Էµ���
	private BufferedReader br;
	
	//���ᵵ��
	private InetAddress address;
	private Socket socket;
	
	//���̵�
	private String id;
	
	//���� ����â
	private JFileChooser fileSelect = new JFileChooser(".");
	
	//���ϸ�
	private String filename ;
	
	public Client(){
		setTitle("Chat Client");
		init();
		menu();
		event();
		
		setSize(new Dimension(400, 700));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = screen.width/2 - getWidth()/2;
		int ypos = screen.height/2 - getHeight()/2;
		setLocation(xpos, ypos);
		//setResizable(false);
		setVisible(true);
		
		setId();
		connect();
	}//end
	
	public void setId(){
		String id = null;
		do{
			id = JOptionPane.showInputDialog("���̵� �Է�");
			this.setTitle(id+ " ���Ӽ���");
		}while(id == null||id.trim().equals(""));
		this.id = id;
	}//end
	
	public void init(){
		con = this.getContentPane();
		
		input = new JTextField();
		display = new JTextArea();
		viewport = new JScrollPane();
		input.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		display.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		viewport.setViewportView(display);
		
		con.setLayout(new BorderLayout());
		con.add(viewport, BorderLayout.CENTER);
		panel = new JPanel();
		con.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout());
		panel.add(input, BorderLayout.CENTER);
		send = new JButton("������");
		panel.add(send, BorderLayout.EAST);
	}//end
	
	public void send(String text){
		try{
			pw.println(text);
			pw.flush();
		}catch(Exception err){
			err.printStackTrace();
		}
	}//end
	
	public void send(){
		try{
			pw.println("["+id+"] "+input.getText().trim());
			pw.flush();
	           if(input.getText().equals('q') || input.getText().equals("quit")) {
	        	   System.out.println("���α׷��� �����մϴ�");
	        	   System.exit(1);
	           }
			input.setText("");
		}catch(Exception err){
			err.printStackTrace();
		}
	}//end
	
	public void event(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		send.addActionListener(e->{
			send();
		});
		
		input.addActionListener(e->{
			send();
		});
		
		save.addActionListener(e->{
			//���ڱ���
		});
		
		filesend.addActionListener(e->{
			int select = fileSelect.showOpenDialog(this);
			if(select != 0) return;
			File file = fileSelect.getSelectedFile();
			filename = file.getName();
			System.out.println("client �޴��׼Ǹ����� �������� = " +  filename);
			long filesize = file.length();
			send("$sdfile"+filename+"::"+filesize);
			display.append(filename+ "  save access\n");
		});
		
		exit.addActionListener(y->{
			//System.out.println("�޴� ���α׷������մϴ�");
			//System.exit(1);
		});
	}//end
	
	public void menu(){
		menubar = new JMenuBar();
		file = new JMenu("����");
		save = new JMenuItem("ä�� ���� ����");
		filesend = new JMenuItem("���� ����");
		exit = new JMenuItem("����");
		
		this.setJMenuBar(menubar);
		menubar.add(file);
		file.add(save);
		file.add(filesend);
		file.addSeparator();
		file.add(exit);
	}//end
	
	public void connect(){
		try{
			address = InetAddress.getByName("127.0.0.1");
			socket = new Socket(address, Server.PORT);
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
			Thread thread = new Thread(this);
			thread.start();
		}catch(Exception e){
			alert("�������� �������� �ʽ��ϴ�.\n��� �� �ٽ� �õ��Ͻʽÿ�");
			System.exit(-1);
		}
	}//end
	
	public void addText(String text){
		display.append(text+"\n");
		viewport.getVerticalScrollBar().setValue(viewport.getVerticalScrollBar().getMaximum());
	}//end
	
	public synchronized void sendFile(){
		Thread th = new Thread(){
			public void run(){
				try{
				  FileInputStream fis = new FileInputStream(filename);
					OutputStream output = socket.getOutputStream();
					File file = new File("/file/"+filename);
					FileOutputStream fos = new FileOutputStream(file);
					BufferedOutputStream bos2 = new BufferedOutputStream(fos);
					
					int i=0;
					//byte[] buffer = new byte[1024];
					
					while((i = fis.read()) != -1){
						   bos2.write(i);
							//fos.write(buffer, 0, readBytes);
							//readBytes += readBytes;
				  }
					display.append(filename+" ���Ͼ��ε� ��������\n");
					bos2.close();
					fis.close(); fos.close();
					output.close();
				}catch(Exception e){	}
			}
		};
		th.setDaemon(true);
		th.start();
	}//end
	 
	public void run() {
		try{
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String msg = null;
			while(true){
				msg = br.readLine();
				if(msg.equals("$sdstart")){
					sendFile();
					continue;
				}
				if(msg!=null){
					addText(msg);
				}
			}
		}catch(Exception e){
			alert("������ ������ ����Ǿ����ϴ�.");
			System.exit(-1);
		}
	}//end
	
	public void alert(String msg){
		JOptionPane.showMessageDialog(this, msg);
	}//end
	
	public static void main(String[] ar){
		new Client();
	}//end
	
}//Client class END