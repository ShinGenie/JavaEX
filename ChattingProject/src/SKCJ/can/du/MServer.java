package SKCJ.can.du;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class MServer extends JFrame implements Runnable, ActionListener{
	//유저데이터 담는 파일
	Vector vc = new Vector();
	Vector vc2 = new Vector();
	
	TextArea ta = new TextArea();
	JButton jbexit = new JButton("서버 종료");
	ServerSocket sc;
	static userlist[] su = new userlist[30];
	static int num = 0;


	public MServer() {

		super("Main 서버");
		this.add(ta,"Center");
		this.add(jbexit,"South");
		this.setBounds(10,10,400,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jbexit.addActionListener(this);

	}//생성자 end

	public void run() {
		try {
			sc = new ServerSocket(8282);
		} catch (Exception e) {System.out.println("오류 재입력" + e); return;}
		while(true) {
			try {
				ta.append("접속 대기중\n");		
				Socket sock = sc.accept();	
				ta.append("접속처리\n");

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
				//테스트
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
		String say="안녕하세요..";
		
	}
	
	
	

	class Service extends Thread{

		public String myname = "guest";
		public String gender="false";
		public String age="0";
		public String hobby=" ";
		public String say="안녕하세요..";
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
					ta.append("메세지 받아드림 : " + msg + "\n");
					if(msg == null)return;
					if(msg.charAt(0) == '/') {
						if(msg.charAt(1) == 's') {
							String name = msg.substring(2, msg.indexOf('-'));
							for (int i = 0; i < vc.size(); i++) {
								Service serv = (Service) vc.elementAt(i);
								if(name.equals(serv.myname)) {
									serv.message("/s"+myname + " 님이 보낸 메세지>> " + msg.substring(msg.indexOf('-')+1));
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
							//	sc.close();  //소켓 끊기
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

		
		public void message(String msg) throws Exception	{ //개인에게 메세지 보내기

			out.write((msg+"\n").getBytes());
//			ta.append("보냄: "+ msg + "\n" );

		}//message end


		public void messageAll(String msg) { // 전체에게 메세지 보내기
			ta.append("보냄: "+ msg + "\n" );
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





