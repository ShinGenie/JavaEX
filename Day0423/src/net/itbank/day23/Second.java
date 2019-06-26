package net.itbank.day23;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Second extends JFrame{
	JPanel jp_left,jp_right,jp_FIRST,jp_SECOND,jp_MAIN;
	JPanel jp_mr,jp_al; //
	List list_al;
	JButton jbt_enter;
	JTextField jtf_name,jtf_age,jtf_hobby,jtf_abil;
	JLabel jl_infoImg, jl_infoTitle, jlab_name,jlab_sex,jlab_age,jlab_hobby,jlab_abil;


	String imgPath;
	//	ImageIcon originFace,resizeFace, img_main_ad;

	Choice ch1;
	Checkbox cb_m,cb_f;
	CheckboxGroup cbgroup;
	
	JFrame jf;
	MenuBar mb;
	Menu Menu, Menu1;
	MenuItem MenuItem,MenuItem1,MenuItem2;



	//	public static ImageIcon reImg(ImageIcon img, int w, int h) {
	//		Image reImg = img.getImage();
	//		Image resize = reImg.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
	//		Icon reImgNew=new ImageIcon(resize);
	//		return reImgNew;
	//	}

	JPanel jp_profi = new JPanel();
	JPanel jp_List = new JPanel();
	JPanel jp_room = new JPanel();

	JPanel jp_mainAd = new JPanel();
	JButton btn = new JButton("�����ϱ�");
	JPanel jp_btn = new JPanel();

	public  Second() {
		//���� ������ 
		JPanel jp_left = new JPanel();
		GridLayout gl0 = new GridLayout(1,1);
		JPanel jp_left0 = new JPanel();
		jp_left0.setLayout(new BorderLayout());
		jp_left.setLayout(gl0);
		JPanel jp_right = new JPanel();
		BorderLayout bl = new BorderLayout();
		jp_right.setLayout(bl);
		jp_right.setAlignmentX(LEFT_ALIGNMENT);
		/////////////////////////////////////


		//		jp_left.setLayout();

		//		jp_left.setBackground(Color.ORANGE);  //Color(255,233,239)
		//		jp_right.setBackground(Color.pink);

		bar(); //��ܹ�
		profi(); //������
		person(); // ������� 
		serverbtn();// ������ư
		
		//������ ȭ��
		JTextArea ta = new JTextArea("����",50,10);
		JButton  jbt_eraser = new JButton(" ���찳  ");
		JButton jbt_emoti = new JButton(" �̸�Ƽ�� ");
		
		
		JLabel al = new JLabel();
		Choice ch2 = new Choice();
		al.add(ch2);
		ch2.addItem("  ��ü    "); ch2.addItem(" �Ҹ� "); 
		ch2.addItem(" �ĸ�");	ch2.addItem(" ���� "); 
		JTextField tf_txt = new JTextField(30);
		JButton jbt_send = new JButton(" ������ ");
		al.add(tf_txt);
		
		JPanel jp2 = new JPanel();
		jp2.setAlignmentX(LEFT_ALIGNMENT);
		jp2.add(jbt_eraser); jp2.add(jbt_emoti); 
		jp2.add(al);  jp2.add(jbt_send);
		

		jp_left0.add(jp_profi,"North");
		jp_left0.add(jp_List,"Center");
		jp_left0.add(jp_room,"South");
		jp_left.add(jp_left0,"South");

		jp_right.add(tf_txt,"Center");
		jp_right.add(jp2,"South");
		/////////////////////////////////////////
		this.add(jp_left,"West");
		this.add(jp_right,"Center");
		/////////////////////////////////////////
//		ImageIcon imgAd = new ImageIcon("images/main1.jpg");
//		JLabel jl_img = new JLabel(imgAd);
//		//		jp_mainAd = new JPanel();
//		//		jp_mainAd.setLayout(new GridLayout(2,1));
//		jp_mainAd.add(jl_img); 
//		jp_mainAd.setBackground(new Color(255,233,239));
//		jp_btn.add(btn);
//		jp_btn.setBackground(new Color(255,233,239));





		//�⺻ȭ��
		this.setSize(720, 620);
		this.setTitle("����Ʈ ä�ù�");
		//	this.setLayout();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		setLocation(xpos, ypos);
		this.setResizable(false);

		this.setVisible(true);
		//ȭ������
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void bar() {
		jf = new JFrame();
		mb = new MenuBar(); //�޴��� ����
		

		Menu = new Menu("����"); // �޴�1����
//		jMenu1 = new Menu("����"); // �޴�2����
//
//		jMenuItem = new MenuItem("���ο���"); //�޴�������1.1����
//		jMenuItem1 = new MenuItem("����"); // �޴�������1.2����
//		jMenuItem2 = new MenuItem("ä��â ���ٲٱ�"); //�޴�������2.1����
//
//
//		jMenu.add(jMenuItem);
//		jMenu.addSeparator();
//		jMenu.add(jMenuItem1);
//		jMenu1.add(jMenuItem2);

//		mb.add(jMenu);
//		mb.add(jMenu1);

//		jMenu.setMnemonic('F');
//		jMenu1.setMnemonic('E');

		jf.setMenuBar(mb);

	}

	public void profi() {
		GridLayout gl = new GridLayout(7,1);
		jp_profi.setLayout(gl);
		jp_profi.setAlignmentX(LEFT_ALIGNMENT);
		JPanel jp[]=new JPanel[7];

		jl_infoTitle = new JLabel("������ ����");
		jl_infoTitle.setForeground(new Color(255, 94,128));
		jl_infoImg = new JLabel(new ImageIcon("images/cat1.png"));
		jlab_name = new JLabel("�̸� : ");
		jlab_name.setForeground(new Color(255, 94,128));
		jlab_age = new JLabel("���� : ");
		jlab_age.setForeground(new Color(255, 94,128));
		jlab_sex = new JLabel("���� :        ");
		jlab_sex.setForeground(new Color(255, 94,128));
		jlab_hobby = new JLabel("��� : ");
		jlab_hobby.setForeground(new Color(255, 94,128));
		jlab_abil = new JLabel("Ư�� : ");
		jlab_abil.setForeground(new Color(255, 94,128));

		jtf_name = new JTextField(10);
		jtf_age = new JTextField(10);
		jtf_hobby = new JTextField(10);
		jtf_abil = new JTextField(10);

		cb_m = new Checkbox(" ��   ",false,cbgroup);
		cb_f = new Checkbox(" ��   ",false,cbgroup);
		cbgroup = new CheckboxGroup();


		for(int i=0;i<7;i++) {
			jp[i]=new JPanel();
			jp[i].setBackground(new Color(255,233,239));
			jp[i].setFont(new Font("�������",Font.PLAIN,12));
			jp[i].setForeground(new Color(255,94,128));
		}

		jp[0].add(jl_infoTitle);
		jp[1].add(jl_infoImg);
		jp[2].add(jlab_name);	jp[2].add(jtf_name);
		jp[3].add(jlab_age);	jp[3].add(jtf_age);
		jp[4].add(jlab_sex);	jp[4].add(cb_m); jp[4].add(cb_f);
		jp[5].add(jlab_hobby);	jp[5].add(jtf_hobby);
		jp[6].add(jlab_abil);	jp[6].add(jtf_abil);

		for(int i=0;i<7;i++) {
			jp_profi.add(jp[i]);
			jp_profi.setForeground(new Color(255,94,128));
		}

	}// ������ end

	public void person() {
		GridLayout g12 = new GridLayout(10,1);
		JLabel jl_personList = new JLabel("    �������       ");
		jl_personList.setForeground(Color.white);
		jp_List.setBackground(Color.pink);
		jp_List.add(jl_personList,"North"); 
		jp_List.setLayout(g12);
	}//������� end

	public void serverbtn() {
		ch1 = new Choice();
		jp_room.add(ch1);
		ch1.addItem("    �����Ͻ� ����       ");
		ch1.addItem("118.130.22.163");
		ch1.addItem("118.130.22.173");
		ch1.addItem("118.130.22.174");
	}

	public void chat() {
		
	}




	public static void main(String[] args) {
		Second s = new Second();

	}

}
