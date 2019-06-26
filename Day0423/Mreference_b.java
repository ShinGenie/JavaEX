package SKCJ.can.du;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mreference_b extends JFrame{
	JPanel jp_mr,jp_profi,jp_al,jp_room;
	List list_al;
	JButton jbt_enter;  //�����ϱ�
	JTextField jtf_name,jtf_age,jtf_hobby,jtf_abil;			//������ (�̸�,����,���,Ư��)
	JLabel jlab_name,jlab_sex,jlab_age,jlab_hobby,jlab_abil,jlab_msg;			//������(�̸�,����,����,���,Ư��), ���¸޼���
	ImageIcon img_face;			//������ �̹���
	
	Choice ch1=new Choice();
	Checkbox cb_m,cb_f;
	CheckboxGroup cbgroup=new CheckboxGroup();
	
	
	public Mreference_b() {
		jp_mr =new JPanel();
		jp_profi=new JPanel();
		jp_al=new JPanel();
		jp_room=new JPanel();
		
		jbt_enter=new JButton("�����ϱ�");
		
		this.setTitle("����Ʈ ä�ù�");
		
		
		profile();    
		accessList();
		
		jp_room.add(ch1);
		ch1.addItem("�����Ͻ� ����");
		ch1.addItem("118.130.22.163");
		ch1.addItem("118.130.22.173");
		ch1.addItem("118.130.22.174");
		
		
		this.add(jp_profi,"North");
		this.add(jp_al,"Center");
		this.add(jp_room,"South");
		
		setSize(220, 620);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		setLocation(xpos, ypos);
		setBackground(Color.GRAY);
		setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
	}
	
	public void profile() {  //������
		
		GridLayout gd_profi=new GridLayout(7, 1);
		jp_profi.setLayout(gd_profi);
		JPanel[] jp=new JPanel[7];
		
		JLabel jlab_set=new JLabel("������ ����");
		img_face=new ImageIcon();
		
		jlab_name=new JLabel("�̸� | ");
		jlab_sex=new JLabel("���� |      ");
		jlab_age=new JLabel("���� | ");
		jlab_hobby=new JLabel("��� | ");
		jlab_abil=new JLabel("Ư�� | ");
		
		jtf_name=new JTextField(10);
		jtf_age=new JTextField(10);
		jtf_hobby=new JTextField(10);
		jtf_abil=new JTextField(10);
		
		cb_m=new Checkbox("��    ",false,cbgroup);
		cb_f=new Checkbox("��       ",false,cbgroup);
		
		
		for(int i=0;i<7;i++) {
			jp[i]=new JPanel();
		}//for end
		
		jp[0].add(jlab_set);
	//	jp[1].add(img_face);	
		jp[2].add(jlab_name);		jp[2].add(jtf_name);
		jp[3].add(jlab_sex);			jp[3].add(cb_m);			jp[3].add(cb_f);
		jp[4].add(jlab_age);			jp[4].add(jtf_age);
		jp[5].add(jlab_hobby);		jp[5].add(jtf_hobby);
		jp[6].add(jlab_abil);			jp[6].add(jtf_abil);
	
		
		for(int i=0;i<7;i++) {
			jp_profi.add(jp[i]);
		}//for end
		
		
	}//profile end
	
	public void accessList() {   //����Ʈ_���� ���� X
		GridLayout gd_al=new GridLayout(10, 1);

		JLabel jlab_al=new JLabel("������ ���");

		
		
		jlab_al.setForeground(Color.WHITE);
		jp_al.setBackground(Color.pink);  //������ ����
		
		jp_al.add(jlab_al,"North");

		
		
		
	}//AccessList end
	
	public static void main(String[] args) {
	new Mreference_b();
	}
	
}//class END
