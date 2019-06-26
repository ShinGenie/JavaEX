package net.itbank.Day0411;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SamokGame extends JFrame implements ActionListener {


	//���ư �ʱ�ȭ
	JPanel jpl1 = new JPanel();
	GridLayout gl1 = new GridLayout(1,3);
	JButton jb1 = new JButton("����");
	JButton jb2 = new JButton("�ٽ�");
	JButton jb3 = new JButton("����");

	// ���ӹ�ư �ʱ�ȭ
	JPanel jpl2 = new JPanel();
	GridLayout gl2 = new GridLayout(3,3);
	JButton[] jbt = new JButton[9];


	// ������
	String msg="";
	boolean flag=false;

	// �����̹���
	ImageIcon imgDefault = new ImageIcon("images/cat1.png");
	ImageIcon dog2 = new ImageIcon("images/dog2.png");
	ImageIcon cat2 = new ImageIcon("images/cat2.png");



	public SamokGame(){

		event();

		//ȭ�� ����
		this.setTitle("������");
		this.setSize(500,500);
		this.setVisible(true);

		//ȭ�� �߾�
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);

		//ȭ�� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}//������

	public static Icon ImageIcon(Icon icon) {
		//Image img = icon.getImage();
		//Image
		
		return new ImageIcon();
	}
	public void init(){}//�ʱ�ȭ

	
	public void event(){
		
		//ȭ�鿡 �� �߰�
		this.add("Center",jpl2);
		this.add("South",jpl1);
		
		//���ư ����
		jpl1.setLayout(gl1);
		jpl1.add(jb1);	jpl1.add(jb2);	jpl1.add(jb3);

		//���ӹ�ư ����
		jpl2.setLayout(gl2);
		for(int i=0;i<jbt.length;i++){
			jbt[i] = new JButton();
			jbt[i].setIcon(imgDefault); // ������ ������ setIcon
			jpl2.add(jbt[i]);
			jbt[i].addActionListener(this);

		}
		
	}//����

	
	public void gameWin(){}//���Ӱ��


	@Override
	public void actionPerformed(ActionEvent ae) {
		for(int i=0;i<jbt.length;i++){
			if(ae.getSource()==jbt[i]){
				jbt[i].setIcon(cat2);
				
			}
		}
	}


	public static void main(String[] args) {
		new SamokGame();
	}//end
	
	
}//class END
