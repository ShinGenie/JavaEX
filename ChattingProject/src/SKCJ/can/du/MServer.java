package SKCJ.can.du;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class MServer extends JFrame implements Runnable, ActionListener{
	//���������� ��� ����
	Vector vc = new Vector();
	Vector vc2 = new Vector();
	
	TextArea ta = new TextArea();
	JButton jbexit = new JButton("���� ����");
	ServerSocket sc;
	static userlist[] su = new userlist[30];
	static int num = 0;


	public MServer() {

		super("Main ����");
		this.add(ta,"Center");
		this.add(jbexit,"South");
		this.setBounds(10,10,400,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jbexit.addActionListener(this);

	}//������ end

	public void run() {
		try {
			sc = new ServerSocket(8282);
		} catch (Exception e) {System.out.println("���� ���Է�" + e); return;}
		while(true) {
			try {
				ta.append("���� �����\n");		
				Socket sock = sc.accept();	
				ta.append("����ó��\n");

				Service svi = new Service(sock);
				svi.start();
				String a=svi.br.readLine();
				String [] array=a.split("/");
				
				this.su[num] = new userlist();
				svi.myname = array[0];
				this.su[num].myname = svi.myname;
				svi.age=array[1];
				this.su[num].age = svi.age;
				svi.hobby=array[2];
				this.su[num].hobby = svi.hobby;
				svi.say=array[3];
				this.su[num].say = svi.say;
				svi.gender=array[4];
				this.su[num].gender = svi.gender;
				svi.messageAll("/c"+svi.myname);
				vc.add(svi);
				num++;
				vc2.add(array);
				
				for (int i = 0; i < vc.size(); i++) {
					Service svi1 = (Service)vc.elementAt(i);
					svi.message("/c"+ svi1.myname);
				}
				//�׽�Ʈ
				for (int i = 0; i < num; i++) {
					System.out.println(su[i].myname);
					System.out.println(su[i].age);
					System.out.println(su[i].hobby);
					System.out.println(su[i].say);
				}

			} catch (Exception e) {e.printStackTrace();}
		}
	}//run end
	
	class userlist{
		String myname = "guest";
		String gender="false";
		String age="0";
		String hobby=" ";
		String say="�ȳ��ϼ���..";
		
	}
	
	
	

	class Service extends Thread{

		public String myname = "guest";
		public String gender="false";
		public String age="0";
		public String hobby=" ";
		public String say="�ȳ��ϼ���..";
		Socket sock;
		BufferedReader br;
		OutputStream out;
		MClient mc;
		
		String from;
		String who;

		Service(){	}
		Service(Socket sock){
			this.sock = sock;
			try {

				InputStream is = sock.getInputStream();
				br = new BufferedReader(new InputStreamReader(is));

				out = sock.getOutputStream();


			} catch (Exception e) {
				e.printStackTrace();
			}

		}//service construct end


		public void run() {

			while(true) {
				try {
					String msg = br.readLine();
					ta.append("�޼��� �޾Ƶ帲 : " + msg + "\n");
					if(msg == null)return;
					if(msg.charAt(0) == '/') {
						if(msg.charAt(1) == 's') {
							String name = msg.substring(2, msg.indexOf('-'));
							for (int i = 0; i < vc.size(); i++) {
								Service serv = (Service) vc.elementAt(i);
								if(name.equals(serv.myname)) {
									serv.message("/s"+myname + " ���� ���� �޼���>> " + msg.substring(msg.indexOf('-')+1));
								}
							}
						}
						else if(msg.charAt(1) == 'q') {
							try {
								String namei = br.readLine();
								for (int i = 0; i < vc.size(); i++) {
									Service serv = (Service)vc.get(i);
									if(myname.equals(serv.myname)) {
										vc.remove(i);
										num--;
										su[i].myname = su[i+1].myname;
										su[i].age = su[i+1].age;
										su[i].hobby = su[i+1].hobby;
										su[i].say = su[i+1].say;
										break;
									}

								}
								messageAll("/q" + myname);
								//br.close();
								//out.close();
							//	sc.close();  //���� ����
								return;
							} catch (Exception e) {
								messageAll("/q" + myname);
							}
						}
						else if(msg.charAt(1) == 'i') {
//							for (int i = 0; i < vc.size(); i++) {
//								Service serv = (Service) vc.elementAt(i);
								messageAll("/i"+myname + ">" + msg.substring(2));
								//serv.message("/i"+myname + " >"+msg.substring(2));
							}
						else if(msg.charAt(1) == 'o') {
							System.out.println(msg);
							for(int i=0; i<vc.size();i++) {
								String [] a=new String [5];
								a=(String[]) vc2.elementAt(i);
								System.out.println(a);
								from=msg.substring(2, msg.indexOf("-"));
								who=msg.substring(msg.indexOf("-")+1);
								System.out.println(from+"__"+who);
								if(a[0].equals(who)) {
									messageAll("$"+from+"-"+a);
								}
							}
							}
					}
					else {
						messageAll(myname + ">" + msg);
					}
					
				} catch (Exception e) {
					e.getMessage();
					return;
				}
			}
		}//service class run end

		
		public void message(String msg) throws Exception	{ //���ο��� �޼��� ������

			out.write((msg+"\n").getBytes());
//			ta.append("����: "+ msg + "\n" );

		}//message end


		public void messageAll(String msg) { // ��ü���� �޼��� ������
			ta.append("����: "+ msg + "\n" );
			if(msg.charAt(0)=='$') {
				for (int i = 0; i < vc.size(); i++) {
					try {
						Service svi = (Service)vc.elementAt(i);
						if(svi.myname.equals(from)) {
							svi.message("/o"+msg.substring(msg.indexOf('-')+1));
							System.out.println("/o"+msg.substring(msg.indexOf('-')+1));
							System.out.println(msg.substring(msg.indexOf('-')+1));
						}
					} catch (Exception e) { vc.removeElementAt(i--);;	}

				}
			}else {
				for (int i = 0; i < vc.size(); i++) {
					try {
						Service svi = (Service)vc.elementAt(i);
						svi.message(msg);
					} catch (Exception e) { vc.removeElementAt(i--);;	}
	
				}
			}
		}//messageAll end
	}//service class end


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbexit)
			System.exit(0);
	}//actionPerformed method end



	public static void main(String[] args) {
		MServer cs = new MServer();
		Thread th=new Thread(cs);
		th.start();
	}//main end

}//class end





