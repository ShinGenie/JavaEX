package net.itbank.day23;

//채팅창 색상 변경 메뉴 통해
//파일불러오고 저장하는 메뉴 만들기
//각 함수 분배하여 제작
//정보 입력시에만 접속하기
//퇴장하면 다시 첫번쨰 화면으로 돌아오게 하기
//이름칸과 이름변경칸에 정규식 통해서 문자와 숫자만 입력 가능하도록
//스페이스나 빈공간 null은 경고 표시나 허락하지 않기
//자기 자신에게는 귓속말 못보내게


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.omg.CORBA.CurrentHolder;

public class MClientJ extends JFrame implements ActionListener, Runnable{

	private JFrame jf = new JFrame("우리들의 메신져");
	private JPanel jp_Wframe = new JPanel(new BorderLayout());
	private JPanel jp_Cframe =new JPanel(new BorderLayout());

	private MenuBar mb = new MenuBar();
	private Menu menu_01 = new Menu("파일");
	private Menu menu_02 = new Menu("편집");
	private Menu menu_color = new Menu("채팅창 색상");
	private MenuItem m_open = new MenuItem("새로 열기");
	private MenuItem m_exit = new MenuItem("종료");
	private CheckboxMenuItem red = new CheckboxMenuItem("빨강");


	private JPanel jp_west= new JPanel();
	private JPanel[] jp=new JPanel[7];
	private JPanel jp_1 =new JPanel(new BorderLayout());
	private JPanel jp_west_profi =new JPanel(new GridLayout(7, 1));
	private JPanel jp_west_list = new JPanel();
	private JPanel jp_west_room = new JPanel();

	private JPanel jp_right= new JPanel();
	private JPanel jp_right_main= new JPanel(new BorderLayout());
	private JPanel jp_right_chat= new JPanel(new BorderLayout());
	private JPanel jp_right_bottom = new JPanel(new GridLayout(2,1));
	private JPanel jp_right_txt = new JPanel();
	private JPanel jp_right_btn = new JPanel();

	private CardLayout cl_info = new CardLayout();
	private CardLayout cl_name = new CardLayout();
	private CardLayout cl_chat = new CardLayout();
	//	private GridLayout gl_list = ;
	private List list = new List(30, false);

	private JTextField jtf_name,jtf_age,jtf_hobby,jtf_abil;			//프로필 (이름,나이,취미,특기)
	private JLabel jlab_name,jlab_sex,jlab_age,jlab_hobby,jlab_abil;			//프로필(이름,성별,나이,취미,특기)
	Checkbox cb_m,cb_f;
	CheckboxGroup cbgroup=new CheckboxGroup();
	Choice ch1=new Choice();

	private JButton jbt_btn;
	private TextArea jt_text = new TextArea(32,62);
	private JButton jb_emo = new JButton("이모티콘");
	private JButton jb_cls = new JButton("지우개");
	private Choice ch2=new Choice();
	private JButton jb_send = new JButton("	전송	");
	private JTextField jt_message= new JTextField("내용",20);

	Vector vc = new Vector();


	public MClientJ() {
		layoutSet();
		settingWindow();
		jp_right.setLayout(cl_chat);
		jp_west.setLayout(cl_info);

		//카드레이아웃 등록
		jp_west.add("login", jp_1);
		//	jp_west.add("update", );
		//	jp_west.add("friend", );
		//	jp_west.add("extra", );
		//카드레이아웃 등록
		jp_right.add("main", jp_right_main);
		jp_right.add("chat", jp_right_chat);

		cl_info.show(jp_west, "login");
		cl_chat.show(jp_right, "main");


	}//construct end


	public void layoutSet() { // 화면 디자인 넣어주세요
		//프로필 부분
		JLabel jlab_set=new JLabel("프로필 설정");
		jlab_set.setForeground(new Color(255, 94, 128));  //폰트 색깔 
		//JLabel jlab_face=new JLabel(new ImageIcon("images/github.png"));

		jlab_name=new JLabel("이름 | ");
		jlab_sex=new JLabel("성별 |    ");
		jlab_age=new JLabel("나이 | ");
		jlab_hobby=new JLabel("취미 | ");
		jlab_abil=new JLabel("특기 | ");

		jtf_name=new JTextField(10);
		jtf_age=new JTextField(10);
		jtf_hobby=new JTextField(10);
		jtf_abil=new JTextField(10);

		cb_m=new Checkbox("남   ",false,cbgroup);
		cb_f=new Checkbox("여     ",false,cbgroup);

		for(int i=0;i<7;i++) {
			jp[i]=new JPanel();
		}//for end

		jp[0].add(jlab_set);
		//jp[1].add(jlab_face);	
		jp[2].add(jlab_name);		jp[2].add(jtf_name);
		jp[3].add(jlab_sex);			jp[3].add(cb_m);			jp[3].add(cb_f);
		jp[4].add(jlab_age);			jp[4].add(jtf_age);
		jp[5].add(jlab_hobby);		jp[5].add(jtf_hobby);
		jp[6].add(jlab_abil);			jp[6].add(jtf_abil);


		for(int i=0;i<7;i++) {
			jp_west_profi.add(jp[i]);
		}//for end
		jp_1.add(jp_west_profi,"Center");

		for (int i = 1; i < 30; i++) list.add("");
		jp_west_list.add(list);
		jp_west_list.setBorder(BorderFactory.createTitledBorder("☆친구목록☆"));

		JLabel jlab_num=new JLabel("인원 수  : " + vc.size() + " 명");
		jp_west_room.add(jlab_num);
		jp_west_room.add(ch1);
		ch1.addItem("입장하실 서버");
		ch1.addItem("118.130.22.163");
		ch1.addItem("118.130.22.172");
		ch1.addItem("118.130.22.173");
		ch1.addItem("118.130.22.174");

		jlab_num.setForeground(new Color(255,94,128));


		jp_Wframe.add(jp_west);
		jp_west_list.setLayout(cl_name);

		jp_Wframe.add(jp_west_profi,"North");
		jp_Wframe.add(jp_west_list,"Center");
		jp_Wframe.add(jp_west_room,"South");


		//첫화면 부분
		jp_Cframe.add(jp_right);
		jp_right_main.setBackground(new Color(255, 233, 239));

		ImageIcon image = new ImageIcon("images/main1.jpg");
		JLabel jl_img = new JLabel(image);
		jl_img.setHorizontalAlignment(JLabel.CENTER);
		JLabel jl_txt = new JLabel("건전한 데이트를 지향합니다");
		jl_txt.setFont(new Font("굴림체",Font.PLAIN,30));
		jl_txt.setForeground(new Color(255,94,128));
		jp_right_txt.add(jl_txt);

		jbt_btn = new JButton("입장하기");
		jp_right_btn.add(jbt_btn);

		jp_right_bottom.add(jp_right_txt);	jp_right_bottom.add(jp_right_btn);


		jp_right_main.add("Center",jl_img);
		jp_right_main.add("South",jp_right_bottom);



		//chat 부분
		JPanel text = new JPanel(); //왼쪽 에서
		text.add("Center",jt_text);
		text.setBorder(BorderFactory.createTitledBorder("채팅"));

		jb_emo.setFont(new Font("굴림체", Font.BOLD,12));

		JPanel jp_choice = new JPanel(); 
		ch2.addItem("전체");
		ch2.addItem("김");
		ch2.addItem("이");
		ch2.addItem("차");
		ch2.addItem("민");
		jp_choice.add(ch2);

		JPanel send = new JPanel();
		jb_send.setFont(new Font("굴림체", Font.BOLD,12));
		jt_message.setFont(new Font("굴림체",Font.PLAIN,15));
		send.add(jb_cls);   send.add(jb_emo); 	send.add(ch2);	send.add(jt_message);	send.add(jb_send);

		jp_right_chat.add("Center",text);
		jp_right_chat.add("South",send);



		//		//카드레이아웃 등록
		//		jp_right.add("main", jp_right_main);
		//		jp_right.add("chat", jp_right_chat);


		//메뉴부분
		menu_01.add(m_open);
		menu_01.addSeparator();
		menu_01.add(m_exit);
		mb.add(menu_01);
		mb.add(menu_02);
		jf.setMenuBar(mb);
		menu_02.add(menu_color);
		menu_color.add(red);

		//메인 틀
		jp_Wframe.setPreferredSize(new Dimension(220, 0));
		jp_west.setBackground(Color.white);
		jp_Cframe.setPreferredSize(new Dimension(500, 0));
		jp_right.setBackground(new Color(255,233,239));

		jf.getContentPane().add("West", jp_Wframe);
		jf.getContentPane().add("Center", jp_Cframe);

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

		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);

		jbt_btn.addActionListener(this);
		jb_send.addActionListener(this);



		//font
		jlab_name.setFont(new Font("굴림체", Font.BOLD,12));
		jlab_sex.setFont(new Font("굴림체", Font.BOLD,12));
		jlab_age.setFont(new Font("굴림체", Font.BOLD,12));
		jlab_hobby.setFont(new Font("굴림체", Font.BOLD,12));
		jlab_abil.setFont(new Font("굴림체", Font.BOLD,12));


		//colors

		jlab_name.setForeground(new Color(255,94,128));
		jlab_sex.setForeground(new Color(255,94,128));
		jlab_age.setForeground(new Color(255,94,128));
		jlab_hobby.setForeground(new Color(255,94,128));
		jlab_abil.setForeground(new Color(255,94,128));

		jbt_btn.setBackground(new Color(255,94,128));
		jbt_btn.setForeground(Color.white);
		jt_text.setBackground(new Color(214, 240, 255));
		jt_text.setForeground(new Color(255,94,128));;
		list.setBackground(new Color(214, 240, 255));
		jtf_name.setBackground(new Color(214, 240, 255));
		jtf_age.setBackground(new Color(214, 240, 255));
		jtf_hobby.setBackground(new Color(214, 240, 255));
		jtf_abil.setBackground(new Color(214, 240, 255));

	}//settingWindow end





	@Override
	public void run() {

		
		
		
	}// run method end





	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==jb_send) {
			jt_text.append(jt_message.getText()+"\n");
			jt_message.setText("");
			jt_message.requestFocus();
		}else if(ae.getSource()==jbt_btn) {
			
				cl_chat.show(jp_right,"chat");
			//			this.setTitle("접속자이름:" + txt_name.getText());
			//			ip_txt=txt_server_ip.getText();
			//			Thread th=new Thread(this);  
			//			th.start();
		}
		else if(ae.getSource()==jb_send) {}
		else if(ae.getSource()==jb_cls) {jt_text.setText("");}
		else if(ae.getSource()==jb_emo) {}
		
		
	}//actionPerformed  end

	
	
	public void setMessage() { //메세지 보내기
		
	}//setMessage end

	
	
	
	public void emoticon(ItemEvent ie) { //이모티콘 메서드
		
	}//emoticon end
	
	
	

	public void setlist() { //사람 나가면 리스트 다시 설정

		try {

		} catch (Exception e) {

		}

	}//set list end

	
	

	public void fileLoad() { //대화 내용 불러오기 함수

		FileDialog fd=new FileDialog(this, "대화내용 불러오기", FileDialog.LOAD);
		
		try {

		} catch (Exception e) {

		}

	}//end fileLoad


	
	
	
	public void fileSave() { //대화 내용 저장 함수

		FileDialog fd=new FileDialog(this, "대화내용 저장", FileDialog.SAVE);
		
		
		try {

		} catch (Exception e) {

		}
		
	}//end fileSave





	public static void main(String[] args) {
		MClientJ mainCl = new MClientJ();
		Thread tr = new Thread(mainCl);
	}//main end

}//class end
