package SKCJ.can.du;
//처음 화면에서 리스트 뜨게
import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import SKCJ.can.du.MServer.Service;

public class MClient extends JFrame implements ActionListener, Runnable{

	private JFrame jf = new JFrame("데이트 채팅방");
	private JPanel jp_Wframe = new JPanel(new BorderLayout());
	private JPanel jp_Cframe =new JPanel(new BorderLayout());

	private MenuBar mb = new MenuBar();
	private Menu menu_01 = new Menu("파일");
	private Menu menu_02 = new Menu("편집");
	private MenuItem chat_color = new MenuItem("채팅창 색상");
	private MenuItem font_color = new MenuItem("글씨 색상");
	private MenuItem m_save = new MenuItem("대화내용 저장");
	private MenuItem m_load = new MenuItem("대화내용 불러오기");
	private MenuItem f_send = new MenuItem("파일 열기");
	private MenuItem m_exit = new MenuItem("종료");
	private Color c1, c2;

	private CardLayout cl_scroll = new CardLayout();
	private CardLayout cl_info = new CardLayout();
	private CardLayout cl_say = new CardLayout();
	private CardLayout cl_chat = new CardLayout();
	
	private JPanel jp_west= new JPanel();
	//1번 main
	private JPanel[] jp=new JPanel[8];
	private JPanel jp_west_main =new JPanel(new GridLayout(7, 1));
	//2번 login
	private JPanel jp_west_login =new JPanel(new BorderLayout());
	private JPanel jp_login_north =new JPanel(new GridLayout(1,2));
	private JPanel jp_login_south =new JPanel(new GridLayout(5,1));
	private JPanel jp_login_say=new JPanel(new BorderLayout());
	//3번 other
	private JPanel jp_west_other =new JPanel(new BorderLayout());
	private JPanel jp_other_north =new JPanel(new GridLayout(1,2));
	private JPanel jp_other_south =new JPanel(new GridLayout(5,1));	

	//west 아래
	private JPanel jp_west_list = new JPanel();
	private JPanel jp_west_room = new JPanel();

	private List list = new List(30);

	private JPanel jp_right= new JPanel();
	private JPanel jp_right_main= new JPanel(new BorderLayout());
	private JPanel jp_right_chat= new JPanel(new BorderLayout());
	private JPanel jp_right_bottom = new JPanel(new GridLayout(2,1));
	private JPanel jp_right_txt = new JPanel();
	private JPanel jp_right_btn = new JPanel();

	private JTextField jtf_name,jtf_age,jtf_hobby;			//프로필 (이름,나이,취미,특기)
	private JLabel jlab_name,jlab_gender,jlab_age,jlab_hobby;			//프로필(이름,성별,나이,취미,특기)
	private JLabel jlab_name2=new JLabel("",JLabel.CENTER);
	private JLabel jlab_say=new JLabel("안녕하세요..",JLabel.CENTER);
	private JTextField jtf_say=new JTextField(jlab_say.getText(),15);

	JLabel jlab_age2=new JLabel("",JLabel.CENTER);
	JLabel jlab_hobby2=new JLabel("",JLabel.CENTER);
	
	JLabel jlab_name3=new JLabel("",JLabel.CENTER);
	private JLabel jlab_say3=new JLabel("낯선 사람",JLabel.CENTER);
	JLabel jlab_age3=new JLabel("나이 | 00",JLabel.CENTER);
	JLabel jlab_hobby3=new JLabel("취미 | TV시청",JLabel.CENTER);
	
	JCheckBox cb_m;
	JCheckBox cb_f;
	CheckboxGroup cbgroup=new CheckboxGroup();
	Choice ch1=new Choice();

	private JButton jbt_btn = new JButton("입장하기");
	private JTextPane jt_text = new JTextPane();  
	private JButton jb_out = new JButton("로그아웃");
	private JButton jb_out2 = new JButton("로그아웃");
	private JButton jb_say = new JButton("메세지 수정");
	private JButton jb_back = new JButton("돌아가기");
	private JButton jb_roomout = new JButton("대화방 퇴장하기");
	private JButton jb_emo = new JButton("이모티콘");
	private JButton jb_cls = new JButton("지우개");
	private Choice ch2=new Choice();
	private JButton jb_send = new JButton("	전송	");
	private JTextField jt_message= new JTextField("",20);

	Vector vc = new Vector();
	
	private StyledDocument doc;
	private StyledDocument doc2;
	private SimpleAttributeSet right;

	OutputStream out;
	BufferedReader br;
	Socket sc;
	MServer ms;
	int count = 0;
	String myname=" ";
	Boolean gender=false;
	int age=0;
	String hobby=" ";
	String say1="안녕하세요..";
	String ic="images/mars/png";

	Boolean say=false;
	int con_num = 0;
	int wh_count = 0;
	int st_num = 0;
	
	//Dialog_out dOut;
	Calendar now;
	int hh,mm;
	String time;
	

	JFrame jte;
		
	userlist[] su = new userlist[30];
	
	JDialog E_jd;
	JTabbedPane E_jtp;
	JPanel E_j;
	JPanel E_jp1;
	JPanel E_jp2;
	JPanel E_jp3;

	JButton jb[] = new JButton[27];
	String data="/image";
	TitledBorder friend;

	public void emoticon() { //이모티콘 메서드
		E_jd=new JDialog();
		E_jtp=new JTabbedPane();
		E_j=new JPanel();
		E_jp1=new JPanel();
		E_jp2=new JPanel();
		E_jp3=new JPanel();

		E_jtp.add("피치",E_jp1);	E_jtp.add("라이언",E_jp2);	E_jtp.add("카카오",E_jp3);
		E_j.add(E_jtp);
		E_jd.add(E_j);

		E_jp1.setLayout(new GridLayout(3,3));
		E_jp2.setLayout(new GridLayout(3,3));
		E_jp3.setLayout(new GridLayout(3,3));
		
		for(int i=0; i<27;i++){
			jb[i]=new JButton(new ImageIcon("images/imo"+(i+1)+".jpg"));
			jb[i].setBackground(Color.white);
			jb[i].setFocusPainted(false);
			jb[i].addActionListener(this);
		}

		for(int i=0;i<9;i++){
			E_jp1.add(jb[i]);
		}
		for(int i=9;i<18;i++){
			E_jp2.add(jb[i]);
		}
		for(int i=18;i<27;i++){
			E_jp3.add(jb[i]);
		}

		E_jd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2-16);  //x변 /16
		int ypos = (int)(screen.getHeight()/2);  //(y변+10) /9
		E_jd.setBounds(xpos,ypos,280,290);
		
		E_jd.setResizable(false);
		E_jd.setTitle("이모티콘");
		E_jd.setVisible(false);
		
	}//emoticon end
	
	
	public MClient() {
		emoticon();
		layoutSet();
		settingWindow();
		
		jp_right.setLayout(cl_chat);
		jp_west.setLayout(cl_info);
		jp_login_say.setLayout(cl_say);

		jp_west.add("main",jp_west_main);
		jp_west.add("login",jp_west_login);
		jp_west.add("other",jp_west_other);
		
		jp_login_say.add("메세지",jlab_say);
		jp_login_say.add("수정",jtf_say);

		jp_right.add("main", jp_right_main);
		jp_right.add("chat", jp_right_chat);

		cl_info.show(jp_west,"main");
		cl_say.show(jp_login_say,"메세지");
		cl_chat.show(jp_right,"main");
	}//construct end


	public void layoutSet() { // 화면 디자인 넣어주세요
		//JTextPane 레이아웃
		jt_text.setPreferredSize(new Dimension(460,495));
		jt_text.setEditable(false);
		
		doc=jt_text.getStyledDocument();
		doc2=jt_text.getStyledDocument();
		
		Style def=StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
		Style s =doc.addStyle("그래이", def);
		StyleConstants.setForeground(s, new Color(94, 108, 119)); // 그래이 프로필보기
		s=doc.addStyle("보내는 귓속말", def);
		StyleConstants.setForeground(s,new Color(135, 62, 22)); 
		s=doc.addStyle("내가 쓴 귓속말", def);
		StyleConstants.setForeground(s,new Color(104, 84, 10)); 
		s=doc.addStyle("red", def);
		StyleConstants.setForeground(s,Color.red); 
		s=doc.addStyle("black", def);
		StyleConstants.setForeground(s,Color.black);
		s=doc.addStyle("핑크", def);
		StyleConstants.setForeground(s,new Color(255, 22, 119)); // 받은 메세지색깔 핑크
		s=doc.addStyle("연한보라", def);
		StyleConstants.setForeground(s,new Color(126, 62, 209));// 내가쓴 메세지 연한보라
		StyleConstants.setAlignment(s, StyleConstants.ALIGN_RIGHT);  ///
		s=doc.addStyle("small", def);
		StyleConstants.setFontSize(s, 11);
		s=doc.addStyle("under", def);
		StyleConstants.setUnderline(s, true);
		s=doc.addStyle("italic", def);
		StyleConstants.setItalic(s, true);
		StyleConstants.setFontSize(s, 18);
		
		JPanel j=new JPanel();
		j.add(jt_text);
		
		JScrollPane jsp=new JScrollPane(j,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);		
		jsp.setViewportView(jt_text);
		//프로필 부분
		JLabel jlab_set=new JLabel("프로필 설정");
		jlab_set.setForeground(new Color(255, 94, 128));  //폰트 색깔 
		JLabel jlab_face=new JLabel(new ImageIcon("images/img1.png"));

		jlab_name=new JLabel("이름 | ");
		jlab_gender=new JLabel("성별 |  ");
		jlab_age=new JLabel("나이 | ");
		jlab_hobby=new JLabel("취미 | ");

		jtf_name=new JTextField(10);
		jtf_age=new JTextField(10);
		jtf_hobby=new JTextField(10);

		cb_m=new JCheckBox("남   ",false);
		cb_m.setBackground(new Color(255, 233, 239));
		cb_m.setForeground(new Color(255,94,128));
		cb_f=new JCheckBox("여     ",false);
		cb_f.setBackground(new Color(255, 233, 239));
		cb_f.setForeground(new Color(255,94,128));

		for(int i=0;i<8;i++) {
			jp[i]=new JPanel();
			jp[i].setBackground(new Color(255, 233, 239));
		}//for end

		jp[0].add(jlab_set);
		//jp[1].add(jlab_face);	
		jp[2].add(jlab_name);		jp[2].add(jtf_name);
		jp[3].add(jlab_gender);		jp[3].add(cb_m);			jp[3].add(cb_f);
		jp[4].add(jlab_age);			jp[4].add(jtf_age);
		jp[5].add(jlab_hobby);		jp[5].add(jtf_hobby);

		for(int i=0;i<7;i++) {
			jp_west_main.add(jp[i]);
		}//for end
		jp_login_north.add(jb_out);		jp_login_north.add(jb_say);

		ImageIcon img1=new ImageIcon("images/img1.png");  //이미지 가져오기
		JLabel jlab_login_img=new JLabel(img1);
		jp_login_south.setBackground(new Color(255, 233, 239));
		jp_login_say.setBackground(new Color(255, 233, 239));
		jp_login_south.add(jlab_name2);  //성별 이미지 넣기
		jp_login_south.add(jp_login_say);
		jp_login_south.add(jlab_age2);
		jp_login_south.add(jlab_hobby2);
		
		jp_west_login.setBackground(new Color(255, 233, 239));
		jp_west_login.add(jp_login_north,"North");
		jp_west_login.add(jlab_login_img,"Center");
		jp_west_login.add(jp_login_south,"South");

		jp_other_north.setBackground(new Color(255, 233, 239));
		jp_other_north.add(jb_out2);		jp_other_north.add(jb_back);

		ImageIcon img2=new ImageIcon("images/img1.png");  //이미지 가져오기
		JLabel jlab_other_img=new JLabel(img2);
		
		jlab_say3.setForeground(new Color(255, 94, 128));
		jlab_age3.setForeground(new Color(255, 94, 128));
		jlab_hobby3.setForeground(new Color(255, 94, 128));
		jp_other_south.add(jlab_name3);  //성별 이미지 넣기
		jp_other_south.add(jlab_say3);
		jp_other_south.add(jlab_age3);
		jp_other_south.add(jlab_hobby3);

		jp_west_other.setBackground(new Color(255, 233, 239));
		jp_other_north.setBackground(new Color(255, 233, 239));
		jp_other_south.setBackground(new Color(255, 233, 239));
		jp_west_other.add(jp_other_north,"North");
		jp_west_other.add(jlab_other_img,"Center");
		jp_west_other.add(jp_other_south,"South");

		for (int i = 0; i < 30; i++) list.add("");
		jp_west_list.add(list);
		jp_west_list.setBackground(new Color(255, 233, 239));
		
		friend = BorderFactory.createTitledBorder("    ☆친구목록☆   (인원 수: 0 명)");
		jp_west_list.setBorder(friend);
		friend.setBorder(BorderFactory.createLineBorder(new Color(255, 233, 239)));
		friend.setTitleColor(new Color(255,94,128));
		
		jp_west_room.add(ch1);
		ch1.addItem("입장하실 서버");
		ch1.addItem("118.130.22.163");
		ch1.addItem("118.130.22.172");
		ch1.addItem("118.130.22.173");
		ch1.addItem("118.130.22.174");
		ch1.addItem("127.0.0.1");

		jp_Wframe.add(jp_west,"North");
		jp_Wframe.add(jp_west_list,"Center");
		jp_Wframe.add(jp_west_room,"South");

		jp_west_list.setLayout(cl_scroll);
		jp_west_room.setLayout(cl_scroll);
		
		//첫화면 부분
		jp_Cframe.add(jp_right);
		jp_right_main.setBackground(new Color(255, 233, 239));

		ImageIcon image = new ImageIcon("images/main1.jpg");
		JLabel jl_img = new JLabel(image);
		jl_img.setHorizontalAlignment(JLabel.CENTER);
		JLabel jl_txt = new JLabel("건전한 데이트를 지향합니다");
		jl_txt.setFont(new Font("나눔고딕",Font.PLAIN,30));
		jl_txt.setForeground(new Color(255,94,128)); //진한색
		jp_right_txt.add(jl_txt);
		jp_right_txt.setBackground(new Color(255, 233, 239));

		jp_right_btn.add(jbt_btn);
		jp_right_btn.setBackground(new Color(255, 233, 239)); //연한색

		jp_right_bottom.add(jp_right_txt);	jp_right_bottom.add(jp_right_btn);
		
		jp_right_main.add("Center",jl_img);
		jp_right_main.add("South",jp_right_bottom);

		//첫화면 부분
		jp_Cframe.add(jp_right);
		jp_right_main.setBackground(new Color(255, 233, 239));

		image = new ImageIcon("images/main1.jpg");
		jl_img = new JLabel(image);
		jl_img.setHorizontalAlignment(JLabel.CENTER);
		jl_txt = new JLabel("건전한 데이트를 지향합니다");
		jl_txt.setFont(new Font("굴림체",Font.PLAIN,30));
		jl_txt.setForeground(new Color(255,94,128));
		jp_right_txt.add(jl_txt);

		jp_right_btn.add(jbt_btn);

		jp_right_bottom.add(jp_right_txt);	jp_right_bottom.add(jp_right_btn);

		jp_right_main.add("Center",jl_img);
		jp_right_main.add("South",jp_right_bottom);

		//chat 부분
		JPanel text = new JPanel(); //왼쪽 에서
		text.add("Center",jsp);
		text.setBackground(new Color(255, 233, 239));
		TitledBorder chat;
		chat = BorderFactory.createTitledBorder("채팅");
		text.setBorder(chat);
		chat.setBorder(BorderFactory.createLineBorder(new Color(255,94,128)));
		chat.setTitleColor(new Color(255,94,128));
		
		jb_emo.setFont(new Font("굴림체", Font.BOLD,12));

		JPanel jp_choice = new JPanel(); 
		ch2.addItem("전체");

		jp_choice.add(ch2);
		jp_choice.setLayout(cl_scroll);

		JPanel send = new JPanel();
		send.setBackground(new Color(255, 233, 239));
		jb_send.setFont(new Font("굴림체", Font.BOLD,12));
		jt_message.setFont(new Font("굴림체",Font.PLAIN,15));
		jb_cls.setFont(new Font("굴림체",Font.PLAIN,12));
		send.add(jb_cls);   send.add(jb_emo); 	send.add(ch2);	send.add(jt_message);	send.add(jb_send);

		jp_right_chat.add("Center",text);
		jp_right_chat.add("South",send);

		jlab_say.setForeground(new Color(255,94,128));
		
		//메뉴부분
		menu_01.add(m_save);
		menu_01.add(m_load);
		menu_01.add(f_send);
		menu_01.addSeparator();
		menu_01.add(m_exit);
		mb.add(menu_01);
		mb.add(menu_02);
		jf.setMenuBar(mb);
		menu_02.add(chat_color);
		//메인 틀
		jp_Wframe.setPreferredSize(new Dimension(220, 0));
		jp_west.setBackground(Color.white);
		jp_Cframe.setPreferredSize(new Dimension(500, 0));
		jp_right.setBackground(new Color(255,233,239));

		jf.getContentPane().add("West", jp_Wframe);
		jf.getContentPane().add("Center", jp_Cframe);
		jf.pack();
	}//layoutSet end


	public void settingWindow() { //addlistener, setFont 등 넣어주세요
		jf.setSize(720, 620);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - jf.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - jf.getHeight()/2);
		jf.setLocation(xpos, ypos);
		setBackground(Color.WHITE);
		jf.setResizable(false);
		jf.setVisible(true);

		jbt_btn.addActionListener(this);
		jb_send.addActionListener(this);
		chat_color.addActionListener(this);
		font_color.addActionListener(this);
		m_exit.addActionListener(this);
		m_save.addActionListener(this);
		m_load.addActionListener(this);
		f_send.addActionListener(this);
		jt_message.addActionListener(this);
		jb_out.addActionListener(this);
		jb_out2.addActionListener(this);
		jb_back.addActionListener(this);
		jb_say.addActionListener(this);
		jb_cls.addActionListener(this);
		jb_emo.addActionListener(this);
		cb_f.addActionListener(this);
		cb_m.addActionListener(this);
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					out.write(("/q" + jtf_name.getText() +"\n").getBytes());
					System.out.println("사용자 로그 아웃 : " + jtf_name.getText());
//					jt_text.append("★★★★★" + jtf_name + "님이 로그아웃 하셨습니다. ★★★★★\r\n");
					insertString("★★★★★" + jtf_name + "님이 로그아웃 하셨습니다. ★★★★★\r\n");
//					br.close();
//					out.close();
//					sc.close();
					setlist(jtf_name.getText());
				} catch (Exception ae) {
					System.out.println("로그아웃 중 오류 : " + ae.getMessage());
				}
				System.exit(1);
			}
		});
		
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					if(list.getSelectedItem().equals(myname)) {
						cl_info.show(jp_west, "login");
					}else if(list.getSelectedItem().equals("")) {
						return;
					}else {
						System.out.println("테스트중입니다."+list.getSelectedItem()	);
						try {
							out.write(("/o"+myname+"-"+list.getSelectedItem()+"\n").getBytes());
						} catch (IOException e1) {	e1.printStackTrace();	}					
						cl_info.show(jp_west, "other");
					}
			}
		});
		


		//font
		jlab_name.setFont(new Font("굴림체", Font.BOLD,12));
		jlab_gender.setFont(new Font("굴림체", Font.BOLD,12));
		jlab_age.setFont(new Font("굴림체", Font.BOLD,12));
		jlab_hobby.setFont(new Font("굴림체", Font.BOLD,12));
		jt_text.setFont(new Font("굴림체", Font.BOLD,15));

		//colors
		jlab_name.setForeground(new Color(255,94,128));
		jlab_gender.setForeground(new Color(255,94,128));
		jlab_age.setForeground(new Color(255,94,128));
		jlab_hobby.setForeground(new Color(255,94,128));

		jbt_btn.setBackground(new Color(255,94,128));
		jbt_btn.setForeground(Color.white);
		jbt_btn.setBorderPainted(false);
		jb_cls.setBackground(new Color(255,94,128));
		jb_cls.setForeground(Color.white);
		jb_cls.setBorderPainted(false);
		jb_emo.setBackground(new Color(255,94,128));
		jb_emo.setForeground(Color.white);
		jb_emo.setBorderPainted(false);
		
		jb_out.setBackground(new Color(255,94,128));
		jb_out.setBorderPainted(false);
		jb_out.setForeground(new Color(214, 214, 214));
		
		jb_out2.setBackground(new Color(255,94,128));
		jb_out2.setBorderPainted(false);
		jb_out2.setForeground(new Color(214, 214, 214));
		
		jb_back.setBackground(new Color(255,94,128));
		jb_back.setBorderPainted(false);
		jb_back.setForeground(Color.white);
		jb_roomout.setBackground(new Color(255,94,128));
		jb_say.setBackground(new Color(255,94,128));
		jb_say.setBorderPainted(false);
		jb_say.setForeground(Color.white);
		jb_send.setBackground(new Color(255,94,128));
		jb_send.setBorderPainted(false);
		jb_send.setForeground(Color.white);
		
		jt_text.setBackground(new Color(255, 150, 180));   //채팅화면 배경색 바꿀 것
		jt_text.setForeground(Color.WHITE);
		jtf_name.setBackground(new Color(214, 240, 255));
		jtf_age.setBackground(new Color(214, 240, 255));
		jtf_hobby.setBackground(new Color(214, 240, 255));

		jp_west_list.setBackground(new Color(255, 233, 239));
		list.setBackground(new Color(255, 220, 255));

		//연핑크 setBackground(new Color(255, 220, 255));
		//하늘 setBackground(new Color(214, 240, 255));
	}//settingWindow end 


  @Override
  public void run() {
     int su = 0;
     while(true) {
   	   now=Calendar.getInstance();
			hh=now.get(now.HOUR_OF_DAY);
			mm=now.get(now.MINUTE);
			time="("+hh+":"+mm+")";
			
        try {
           String msg = br.readLine();
           System.out.println("서버로부터 받아온 메세지 : " + msg);

           if(msg == null) return;
           if(msg.charAt(0) == '/') {

              if(msg.charAt(1) == 'c') { //접속했을때 
                 if(con_num != 0 && wh_count == 0) {
                    list.removeAll();
                    for (int i = 0; i < 30; i++) {
                       list.add("");
                    }
                 }
                 count++;
                 list.replaceItem(msg.substring(2), su);
                 su++;
                 insertString(doc.getLength(),"*****"+msg.substring(2) + "님이 입장하셨습니다.*****\r\n",doc.getStyle("italic"));
                 if(!myname.equals(msg.substring(2)))
                    ch2.add(msg.substring(2));
                 jlab_name2.setText(jtf_name.getText());
                 jlab_name2.setForeground(new Color(255,94,128));
                 jlab_age2.setText("나이 | "+jtf_age.getText());
                 jlab_age2.setForeground(new Color(255,94,128));
                 jlab_hobby2.setText("취미 | "+jtf_hobby.getText());
                 jlab_hobby2.setForeground(new Color(255,94,128));
                 
              }else if(msg.charAt(1) == 'n') {////////////이름바꾸기

              }else if(msg.charAt(1) == 's') {////////////귓속말
            	  insertString(doc.getLength(),"[귓속말] "+msg.substring(2),doc.getStyle("보내는 귓속말"));
            	  insertString(doc.getLength(),time+"\r\n",doc.getStyle("small"));

              }else if(msg.charAt(1) == 'i') {////////////이모티콘
						int index=msg.indexOf(">")+1;
						System.out.println(msg.substring(index)+"이모티콘 업로드 중..\r\n");
						ImageIcon i=new ImageIcon(msg.substring(index));
						i=new ImageIcon(i.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
						insertString(msg.substring(2,index));
						jt_text.insertIcon(i);
						insertString(doc.getLength(),time+"\r\n",doc.getStyle("small"));
					}
	  else if(msg.charAt(1) == 'o') {////////////다른 사람 프로필 보기
						
		            	  String [] arr=msg.substring(2).split("-");
		            	  jlab_name3.setText(arr[0]+"");
		            	  jlab_age3.setText("나이 | "+arr[1]+"");
		            	  jlab_hobby3.setText("취미 | "+arr[2]+"");
		            	  jlab_say3.setText(arr[3]+"");
		            	  
		              }else if(msg.charAt(1) == 'q') {
                 String name = msg.substring(2);
                 //jt_text.append("*****" + name +"님이 퇴장하셨습니다.*****\r\n");
                 insertString(doc.getLength(),"*****" + name +"님이 퇴장하셨습니다.*****\r\n",doc.getStyle("italic"));
                 count--;
                 su--;
                 for(int i = 0; i < list.getItemCount(); i++) {
                    if(name.equals(list.getItem(i))) {
                       list.remove(i);
                       for (int j = 0; j < list.getItemCount(); j++) {
                          if(list.getItem(j)=="" || list.getItem(j)==null) {
                             list.remove(j);
                          }else {
                             break;
                          }
                       }
                       break;
                    }
                 }
              }
           }else {
         	  if(!(msg.substring(0, msg.indexOf(">")).equals(myname))) {
        		  	insertString(doc.getLength(),msg,doc.getStyle("핑크"));
        	  		insertString(doc.getLength(),time+"\r\n",doc.getStyle("small"));
        	  }else {
        			insertString(doc2.getLength(),msg,doc2.getStyle("연한보라"));
        	  		insertString(doc2.getLength(),time+"\r\n",doc2.getStyle("small"));
        	  }
           }
        } catch (IOException | BadLocationException e) {
           System.out.println("정보 받아오기 오류 : " + e.getMessage());
           wh_count = 0;
           return;
        } finally {
        	friend.setTitle("    ☆친구목록☆   (인원 수: "+su+" 명)");
		}
        wh_count++;
     }
  }// run method end


	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==cb_m)
			cb_f.setSelected(false);
		
		else if(ae.getSource()==cb_f)
			cb_m.setSelected(false);
		
		if(ae.getSource()==jb_send  || ae.getSource()==jt_message) {
			sendMessage();
		}
		else if(ae.getSource()==jbt_btn) {

			if(!(jtf_name.getText() == null) && !(jtf_age.getText() == null) &&(!(cb_m.isSelected() == false)|| !(cb_f.isSelected() == false))) {
				if(!ch1.getSelectedItem().equals("입장하실 서버")) {
					if(Integer.parseInt(jtf_age.getText()) >98 || Integer.parseInt(jtf_age.getText()) < 20 ) {
						JOptionPane.showMessageDialog(this,"나이제한은 20 ~ 99 입니다.", "입장 불가", JOptionPane.WARNING_MESSAGE);
						return;
					}else {
						connect();
						saveUserData();
						count++;
					}
				}else {
					JOptionPane.showMessageDialog(this,"서버를 선택해주세요", "입장 불가", JOptionPane.WARNING_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(this,"이름, 성별, 나이는 필수 기재 항목입니다.", "입장 불가", JOptionPane.WARNING_MESSAGE);
			}

		}
		
		else if(ae.getSource()==jb_cls) {jt_text.setText("");}
		else if(ae.getSource()==jb_emo) {
			E_jd.setVisible(true);
			
		}
		
		else if(ae.getSource()==chat_color) {
			c1 = JColorChooser.showDialog(this, "채팅창 색깔 바꾸기", Color.LIGHT_GRAY);
			jt_text.setBackground(c1);
			list.setBackground(c1);
			jtf_name.setBackground(c1);
			jtf_age.setBackground(c1);
			jtf_hobby.setBackground(c1);
		}
		
		else if(ae.getSource()==font_color) {
			c2 = JColorChooser.showDialog(this, "폰트 색깔 바꾸기", Color.LIGHT_GRAY);
			jt_text.setForeground(c2);

		}
		
		else if(ae.getSource() == m_load) {
			fileLoad();
		}
		
		else if(ae.getSource() == m_save) {
			fileSave();
		}
		
		else if(ae.getSource() == f_send) {
			fileSend();
		}
		
		else if(ae.getSource()==jb_say&&say==false) {
			cl_say.show(jp_login_say, "수정");
			jb_say.setText("완료");
			say=true;
		}
		
		else if(ae.getSource()==jb_say&&say==true) {
			String a=jtf_say.getText();
			jlab_say.setText(a);

			try {
				out.write(("/u"+myname+"-"+a+"\n").getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
			cl_say.show(jp_login_say, "메세지");
			jb_say.setText("메세지 수정");
			say=false;
		}
		
		else if(ae.getSource()==jb_out||ae.getSource()==jb_out2) {
			roomexit();
		}
		
		else if(ae.getSource()==jb_back) {
			cl_info.show(jp_west,"login");
		}

		for(int i=0; i<27; i++){
			if(ae.getSource()==jb[i]){
				try {
				out.write(("/iimages/imo"+(i+1)+".jpg"+"\n").getBytes());
				} catch (IOException e) {
				e.printStackTrace();
				}
			}
		}//for end
	}//actionPerformed  end


	public void sendMessage() { //메세지 보내기
		String msg = jt_message.getText();
		try {
			if(ch2.getSelectedItem().equals("전체")) {
				if(jt_message.getText() != null || jt_message.getText() != "") {
					out.write((jt_message.getText() + "\n").getBytes());
				}
			}else {
				whisper();
			}
			jt_message.setText("");
			jt_message.requestFocus();
		} catch (Exception e) {
			System.out.println("보내기 오류 : " + e.getMessage());
		}
	}//setMessage end



	public void whisper() throws BadLocationException { //귓속말
		try {
			String name = ch2.getSelectedItem();
			if(name == null || name == "") {
				insertString("***** 귓속말 할 대상을 찾지 못했습니다. *****");
			}else {
				out.write(("/s" + name + "-" + jt_message.getText() + "\n").getBytes());
				System.out.println("귓속말 전달 >> /s" + name + " - " + jt_message.getText());
				insertString(doc.getLength(),"[귓속말] " + name + "님 에게   >> " + jt_message.getText() + "\r\n",doc.getStyle("내가 쓴 귓속말"));
			}
		} catch (Exception e) {
			insertString(e.getMessage());
		}
	}//whisper end


	public void saveUserData() {
		try {
			myname = jtf_name.getText();
			age = Integer.parseInt(jtf_age.getText());
			hobby = jtf_hobby.getText();
			say1=jlab_say.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	 public void setlist(String name) { //사람 나가면 리스트 다시 설정
     try {
        for(int i=0; i<30; i++) {
           if(list.getItem(i).equals(name)) {
              list.remove(i);
              list.add("");
              count--;
           }
        }
     } catch (Exception e) {
        e.getMessage();
     }finally {
		friend.setTitle("    ☆친구목록☆   (인원 수: "+su+" 명)");
	}
  }//set list end

	 
	public void fileLoad() { //대화 내용 불러오기 함수
		
			FileDialog fd=new FileDialog(this, "대화내용 불러오기", FileDialog.LOAD);
			String dir = fd.getDirectory();
			String file = fd.getFile();
			fd.show();
			
			if(dir == null || file == null) return;
			try {
				FileReader fr = new FileReader(dir+file);
				BufferedReader br = new BufferedReader(fr);
				while(true) {
					String data = "";
					data = br.readLine();
					if(data == null) break;
					//jt_text.append(data + "\n");
					insertString(data + "\n");
				}
			} catch (Exception e) {	}
	}//end fileLoad

	public void fileSave() { //대화 내용 저장 함수

		FileDialog fd=new FileDialog(this, "대화내용 저장", FileDialog.SAVE);
		fd.show();
		String dir = fd.getDirectory();
		String file = fd.getFile();

		if(dir == null || file == null) return;
		File f = new File(dir+file);

		try {
			PrintWriter pw = new PrintWriter(f);
			pw.println(jt_text.getText());
			pw.close();
			//jt_text.append("대화 내용이 저장되었습니다.\r\n");
			insertString("대화 내용이 저장되었습니다.\r\n");
		} catch (Exception e) {
			System.out.println("파일 저장 오류 : " + e.getMessage());
		}

	}//end fileSave
	

	public void fileSend() { //파일 전송 함수
		FileOutputStream fos;
		FileDialog fd=new FileDialog(this, "파일 열기", FileDialog.LOAD);
		String dir = fd.getDirectory();
		String file = fd.getFile();
		fd.show();

		if(dir == null || file == null) return;

		try {
			FileReader fr = new FileReader(dir+file);
			BufferedReader br = new BufferedReader(fr);

		} catch (Exception e) {

		}

	}//end fileSend



	public void connect() {	//서버 접속
		ch1.setEnabled(false);
		cl_info.show(jp_west,"login");
		cl_chat.show(jp_right,"chat");
		//		ms.vc.add(e);
		JOptionPane.showMessageDialog(this, "      **** 로그인 성공 **** \n 오늘도 좋은 인연 만나세요~!", "환영합니다", JOptionPane.NO_OPTION);
		try {

			String ipnum = ch1.getSelectedItem();
			sc = new Socket(ipnum, 8282);
			br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			out = sc.getOutputStream();
			if(cb_m.isSelected()) 
				gender=false; 
			else if(cb_f.isSelected()) 
				gender=true;
			out.write((jtf_name.getText()+"/"+jtf_age.getText()+"/"+jtf_hobby.getText()+"/"+jlab_say.getText()+"/"+gender + "\n").getBytes());
			System.out.println((jtf_name.getText()+"/"+jtf_age.getText()+"/"+jtf_hobby.getText()+"/"+jlab_say.getText()+gender));
			System.out.println("접속 아이디 서버로  >> " + jtf_name.getText());

			new Thread(this).start();
			jt_message.requestFocus();
		} catch (Exception e) {
			System.out.println("시스템 오류 : " + e.getMessage());
		}
	}//connect end

	public void roomexit() { // 채팅창 나가기 기능  **시스템 종료 아님**
		try {
			out.write(("/q" +jlab_name2.getText() +"\n").getBytes());
			System.out.println("사용자 로그 아웃 : " + jlab_name2.getText());
			//jt_text.append("★★★★★" + myname + "님이 로그아웃 하셨습니다. ★★★★★\r\n");
			insertString("★★★★★" + myname + "님이 로그아웃 하셨습니다. ★★★★★\r\n");
			cl_info.show(jp_west,"main");
			cl_chat.show(jp_right,"main");
			ch1.setEnabled(true);
			jtf_name.setText("");
			jtf_age.setText("");
			jtf_hobby.setText("");
			jt_text.setText("");
			jtf_name.requestFocus();
			sc.close();
			br.close();
			out.close();
			setlist(myname);
		} catch (Exception e) {
			System.out.println("로그아웃 중 오류 : " + e.getMessage());
		}
	}//roomexit end

	
	public void insertString(String str) throws BadLocationException{
		Document a=jt_text.getDocument();
		a.insertString(jt_text.getDocument().getLength(),str , null);
		jt_text.setCaretPosition(jt_text.getDocument().getLength());
	}
	
	
	private void insertString(int length, String string, Style style) {
		Document a=jt_text.getDocument();
		try {
			a.insertString(length,string , style);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jt_text.setCaretPosition(jt_text.getDocument().getLength());
	}


	public static void main(String[] args) {
		MClient mainCl = new MClient();
		Thread tr = new Thread(mainCl);

	}//main end
	
	
	class userlist{
		String myname = "guest";
		Boolean gender=false;
		int age=0;
		String hobby=" ";
		String say="안녕하세요..";
	}

}//class end


