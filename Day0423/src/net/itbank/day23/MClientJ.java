package net.itbank.day23;

//ä��â ���� ���� �޴� ����
//���Ϻҷ����� �����ϴ� �޴� �����
//�� �Լ� �й��Ͽ� ����
//���� �Է½ÿ��� �����ϱ�
//�����ϸ� �ٽ� ù���� ȭ������ ���ƿ��� �ϱ�
//�̸�ĭ�� �̸�����ĭ�� ���Խ� ���ؼ� ���ڿ� ���ڸ� �Է� �����ϵ���
//�����̽��� ����� null�� ��� ǥ�ó� ������� �ʱ�
//�ڱ� �ڽſ��Դ� �ӼӸ� ��������


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

	private JFrame jf = new JFrame("�츮���� �޽���");
	private JPanel jp_Wframe = new JPanel(new BorderLayout());
	private JPanel jp_Cframe =new JPanel(new BorderLayout());

	private MenuBar mb = new MenuBar();
	private Menu menu_01 = new Menu("����");
	private Menu menu_02 = new Menu("����");
	private Menu menu_color = new Menu("ä��â ����");
	private MenuItem m_open = new MenuItem("���� ����");
	private MenuItem m_exit = new MenuItem("����");
	private CheckboxMenuItem red = new CheckboxMenuItem("����");


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

	private JTextField jtf_name,jtf_age,jtf_hobby,jtf_abil;			//������ (�̸�,����,���,Ư��)
	private JLabel jlab_name,jlab_sex,jlab_age,jlab_hobby,jlab_abil;			//������(�̸�,����,����,���,Ư��)
	Checkbox cb_m,cb_f;
	CheckboxGroup cbgroup=new CheckboxGroup();
	Choice ch1=new Choice();

	private JButton jbt_btn;
	private TextArea jt_text = new TextArea(32,62);
	private JButton jb_emo = new JButton("�̸�Ƽ��");
	private JButton jb_cls = new JButton("���찳");
	private Choice ch2=new Choice();
	private JButton jb_send = new JButton("	����	");
	private JTextField jt_message= new JTextField("����",20);

	Vector vc = new Vector();


	public MClientJ() {
		layoutSet();
		settingWindow();
		jp_right.setLayout(cl_chat);
		jp_west.setLayout(cl_info);

		//ī�巹�̾ƿ� ���
		jp_west.add("login", jp_1);
		//	jp_west.add("update", );
		//	jp_west.add("friend", );
		//	jp_west.add("extra", );
		//ī�巹�̾ƿ� ���
		jp_right.add("main", jp_right_main);
		jp_right.add("chat", jp_right_chat);

		cl_info.show(jp_west, "login");
		cl_chat.show(jp_right, "main");


	}//construct end


	public void layoutSet() { // ȭ�� ������ �־��ּ���
		//������ �κ�
		JLabel jlab_set=new JLabel("������ ����");
		jlab_set.setForeground(new Color(255, 94, 128));  //��Ʈ ���� 
		//JLabel jlab_face=new JLabel(new ImageIcon("images/github.png"));

		jlab_name=new JLabel("�̸� | ");
		jlab_sex=new JLabel("���� |    ");
		jlab_age=new JLabel("���� | ");
		jlab_hobby=new JLabel("��� | ");
		jlab_abil=new JLabel("Ư�� | ");

		jtf_name=new JTextField(10);
		jtf_age=new JTextField(10);
		jtf_hobby=new JTextField(10);
		jtf_abil=new JTextField(10);

		cb_m=new Checkbox("��   ",false,cbgroup);
		cb_f=new Checkbox("��     ",false,cbgroup);

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
		jp_west_list.setBorder(BorderFactory.createTitledBorder("��ģ����ϡ�"));

		JLabel jlab_num=new JLabel("�ο� ��  : " + vc.size() + " ��");
		jp_west_room.add(jlab_num);
		jp_west_room.add(ch1);
		ch1.addItem("�����Ͻ� ����");
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


		//ùȭ�� �κ�
		jp_Cframe.add(jp_right);
		jp_right_main.setBackground(new Color(255, 233, 239));

		ImageIcon image = new ImageIcon("images/main1.jpg");
		JLabel jl_img = new JLabel(image);
		jl_img.setHorizontalAlignment(JLabel.CENTER);
		JLabel jl_txt = new JLabel("������ ����Ʈ�� �����մϴ�");
		jl_txt.setFont(new Font("����ü",Font.PLAIN,30));
		jl_txt.setForeground(new Color(255,94,128));
		jp_right_txt.add(jl_txt);

		jbt_btn = new JButton("�����ϱ�");
		jp_right_btn.add(jbt_btn);

		jp_right_bottom.add(jp_right_txt);	jp_right_bottom.add(jp_right_btn);


		jp_right_main.add("Center",jl_img);
		jp_right_main.add("South",jp_right_bottom);



		//chat �κ�
		JPanel text = new JPanel(); //���� ����
		text.add("Center",jt_text);
		text.setBorder(BorderFactory.createTitledBorder("ä��"));

		jb_emo.setFont(new Font("����ü", Font.BOLD,12));

		JPanel jp_choice = new JPanel(); 
		ch2.addItem("��ü");
		ch2.addItem("��");
		ch2.addItem("��");
		ch2.addItem("��");
		ch2.addItem("��");
		jp_choice.add(ch2);

		JPanel send = new JPanel();
		jb_send.setFont(new Font("����ü", Font.BOLD,12));
		jt_message.setFont(new Font("����ü",Font.PLAIN,15));
		send.add(jb_cls);   send.add(jb_emo); 	send.add(ch2);	send.add(jt_message);	send.add(jb_send);

		jp_right_chat.add("Center",text);
		jp_right_chat.add("South",send);



		//		//ī�巹�̾ƿ� ���
		//		jp_right.add("main", jp_right_main);
		//		jp_right.add("chat", jp_right_chat);


		//�޴��κ�
		menu_01.add(m_open);
		menu_01.addSeparator();
		menu_01.add(m_exit);
		mb.add(menu_01);
		mb.add(menu_02);
		jf.setMenuBar(mb);
		menu_02.add(menu_color);
		menu_color.add(red);

		//���� Ʋ
		jp_Wframe.setPreferredSize(new Dimension(220, 0));
		jp_west.setBackground(Color.white);
		jp_Cframe.setPreferredSize(new Dimension(500, 0));
		jp_right.setBackground(new Color(255,233,239));

		jf.getContentPane().add("West", jp_Wframe);
		jf.getContentPane().add("Center", jp_Cframe);

	}//layoutSet end





	public void settingWindow() { //addlistener, setFont �� �־��ּ���

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
		jlab_name.setFont(new Font("����ü", Font.BOLD,12));
		jlab_sex.setFont(new Font("����ü", Font.BOLD,12));
		jlab_age.setFont(new Font("����ü", Font.BOLD,12));
		jlab_hobby.setFont(new Font("����ü", Font.BOLD,12));
		jlab_abil.setFont(new Font("����ü", Font.BOLD,12));


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
			//			this.setTitle("�������̸�:" + txt_name.getText());
			//			ip_txt=txt_server_ip.getText();
			//			Thread th=new Thread(this);  
			//			th.start();
		}
		else if(ae.getSource()==jb_send) {}
		else if(ae.getSource()==jb_cls) {jt_text.setText("");}
		else if(ae.getSource()==jb_emo) {}
		
		
	}//actionPerformed  end

	
	
	public void setMessage() { //�޼��� ������
		
	}//setMessage end

	
	
	
	public void emoticon(ItemEvent ie) { //�̸�Ƽ�� �޼���
		
	}//emoticon end
	
	
	

	public void setlist() { //��� ������ ����Ʈ �ٽ� ����

		try {

		} catch (Exception e) {

		}

	}//set list end

	
	

	public void fileLoad() { //��ȭ ���� �ҷ����� �Լ�

		FileDialog fd=new FileDialog(this, "��ȭ���� �ҷ�����", FileDialog.LOAD);
		
		try {

		} catch (Exception e) {

		}

	}//end fileLoad


	
	
	
	public void fileSave() { //��ȭ ���� ���� �Լ�

		FileDialog fd=new FileDialog(this, "��ȭ���� ����", FileDialog.SAVE);
		
		
		try {

		} catch (Exception e) {

		}
		
	}//end fileSave





	public static void main(String[] args) {
		MClientJ mainCl = new MClientJ();
		Thread tr = new Thread(mainCl);
	}//main end

}//class end
