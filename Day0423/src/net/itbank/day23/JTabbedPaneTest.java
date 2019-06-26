package net.itbank.day23;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Jpanel01 extends JPanel{
	private JButton jb1;
	private JScrollPane jsp;
	private JTextArea jta;
	
	Jpanel01(){
		setLayout(null);
		jb1= new JButton("1번버튼");
		jb1.setSize(70,20);
		jb1.setLocation(10, 10);
		add(jb1);
		
		jta = new JTextArea();
		
		jsp = new JScrollPane(jta);
		jsp.setSize(200,150);
		jsp.setLocation(10, 40);
		add(jsp);
		
	}
}
class Jpanel02 extends JPanel{
	private JTextField tf;
	private JPasswordField psf;
	
	Jpanel02(){
		setLayout(null);
		JLabel lb = new JLabel("아이디");
		lb.setBounds(31,40,67,15);
		add(lb);
		
		tf=new JTextField();
		tf.setBounds(123, 40, 116, 21);
		add(tf);
		tf.setColumns(10);
		
		JLabel lb1=new JLabel("암호");
		lb1.setBounds(31,84,67,15);
		add(lb1);
		
		psf = new JPasswordField();
		psf.setBounds(123,83,116,21);
		add(psf);
		
		JButton btn = new JButton("버튼");
		btn.setSize(70,20);
		btn.setLocation(10, 10);
		add(btn);
	}
}
class Jpanel03 extends JPanel{
	private JLabel lb_name;
	private JLabel lb_sex;
	private JLabel lb_hobby;
	private JLabel lb_nation;
	private JLabel lb_introduce;
	
	private JTextField tf_name;
	
	private JRadioButton rb_boy;
	private JRadioButton rb_girl;
	private JRadioButton[] sex=new JRadioButton[2];
	private String sexx="";
	
	private JCheckBox[] checkbox=new JCheckBox[3];
	private JCheckBox cb_Movie;
	private JCheckBox cb_Reding;
	private JCheckBox cb_Circle;
	private String[] check= {"","",""};
	
	private JComboBox comb_nation;
	private String[]nationalist = {"레국","태국","중국","미국"};
	
	private JTextArea ta_introduce;
	private JButton bt_save;
	
	Jpanel03(){
		setLayout(null);
		//라벨
		lb_name = new JLabel("이름:");
		lb_name.setSize(100,20);
		lb_name.setLocation(20, 50);
		lb_sex = new JLabel("성별:");
		lb_sex.setBounds(20, 100, 100, 20);
		lb_hobby = new JLabel("취미:");
		lb_hobby.setBounds(20, 150, 100, 20);
		lb_nation = new JLabel("국가:");
		lb_nation.setBounds(20, 200, 100, 20);
		lb_introduce = new JLabel("소개:");
		lb_introduce.setBounds(20, 250, 100, 20);
		
		//텍스트 필드
		tf_name = new JTextField();
		tf_name.setBounds(100,50,200,20);
		
		//라디오버튼
		ButtonGroup g = new ButtonGroup();
		sex[0]=new JRadioButton("남");
		sex[0].setBounds(100,100,50,20);		
		sex[1]=new JRadioButton("여");
		sex[1].setBounds(200,100,50,20);
		g.add(sex[0]); g.add(sex[1]);
		
		//체크박스 
		checkbox[0]=new JCheckBox("영화");
		checkbox[0].setBounds(100,150,60,20);		
		checkbox[1]=new JCheckBox("독서");
		checkbox[1].setBounds(160,150,60,20);
		checkbox[2]=new JCheckBox("걷기");
		checkbox[2].setBounds(220,150,60,20);
		
		//콤보박스 
		comb_nation = new JComboBox(nationalist);
		comb_nation.setBounds(100,200,80,20);
		
		//textArea, 
		ta_introduce = new JTextArea();
		ta_introduce.setEditable(false);
		JScrollPane scp = new JScrollPane(ta_introduce);
		scp.setBounds(100, 255, 200, 150);
		
		//button 
		bt_save = new JButton("저장");
		bt_save.setBounds(150, 430, 100, 20);
		bt_save.addActionListener(new EventHandlerSave()); // 버튼리스터 등록
		
		add(lb_name);	add(lb_sex);	add(lb_hobby);
		add(lb_nation);	add(lb_introduce);	
		add(tf_name);
		add(sex[0]);	add(sex[1]);	
		add(checkbox[0]);	add(checkbox[1]);	add(checkbox[2]);	
		add(comb_nation);
		add(scp);	add(bt_save);
		
		
	}
	
	class EventHandlerSave implements ActionListener {

		
		@Override
		public void actionPerformed(ActionEvent e) {
			//텍스트 필드값 가져오기
			String a = tf_name.getText();
			//라디오버튼값 가져오기
			if(sex[0].isSelected()) sexx="남";
			else if(sex[1].isSelected()) sexx="여";
			//체크박스 값 가져오기
			if(checkbox[0].isSelected()) check[0]="영화";
			else check[0]="";
			if(checkbox[1].isSelected()) check[1]="독서";
			else check[1]="";
			if(checkbox[2].isSelected()) check[2]="걷기";
			else check[2]="";
			//콤보박스 값 가져오기 
			String d=(String) comb_nation.getSelectedItem();
			//TextArea 필드에 출력보이기
			ta_introduce.append("이름="+a+"\n");
			ta_introduce.append("성별="+sexx+"\n");
			ta_introduce.append("취미="+check[0]+check[1]+check[2]+"\n");
			ta_introduce.append("국가="+d+"\n");
		}
		
	}
	
}



public class JTabbedPaneTest extends JFrame {
	public Jpanel01 jpanel011 = null;
	public Jpanel02 jpanel021 = null;
	public Jpanel03 jpanel031 = null;
	
	
	public void process() {
		JTabbedPaneTest win = new JTabbedPaneTest();
		win.setTitle("frame test");
		win.jpanel011 = new Jpanel01();
		win.jpanel021 = new Jpanel02();
		win.jpanel031 = new Jpanel03();
		
		JTabbedPane jtab = new JTabbedPane();// JTabbedPane 객체생성
		
		jtab.add("화면1", win.jpanel011);
		jtab.add("화면2", win.jpanel021);
		jtab.add("화면3", win.jpanel031);
		
		win.add(jtab);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(500,700);
		win.setVisible(true);
		
		
	
	}
		public static void main(String[] args) {
			System.out.println("국어");
			JTabbedPaneTest jtab = new JTabbedPaneTest();
			jtab.process();
	}

}
