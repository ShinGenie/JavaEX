package net.itbank.Day0412;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OmokGame extends JFrame implements ActionListener{
	Container ct=null;
	JLabel info1=new JLabel();
	JLabel info2=new JLabel();
	JLabel info3=new JLabel();
	
	JPanel jp=new JPanel();
	GridLayout gl=new GridLayout(1,3);
	
	JPanel jp1=new JPanel();
	GridLayout gl1=new GridLayout(3,3);
	JButton[] jbt=new JButton[9];
	ImageIcon[] img=new ImageIcon[9];
	ImageIcon imgDefault=new ImageIcon("images/ico4.gif");
	
	JPanel jp2=new JPanel();
	GridLayout gl2=new GridLayout(1,3);
	JButton bt_start=new JButton("���ӽ���");
	JButton bt_next=new JButton("�ٽ��ϱ�");
	JButton bt_exit=new JButton("��������");
	
	
	int[] jumsu=new int[9]; //0�ϰ� 1ǥ���ϸ� ����� ������ 7�� 8
	String[] ox=new String[9];// o or x
	String msg="";
	boolean flag=false;
	
	
	
	
	
	
	public OmokGame() {//~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		this.init();
		
		//������ ���� �Ӽ� ��� ũ�� ��ġ setVisible
		this.setBounds(300, 300, 500, 500);
		this.setVisible(true);
		
		//������ ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�̺�Ʈ�ڵ鷯 ������ ��� ������Ʈ.addXXX������(this)
		for(int i=0;i<9;i++) {
			jbt[i].addActionListener(this);
		}
		bt_start.addActionListener(this); bt_next.addActionListener(this); bt_exit.addActionListener(this);
		
	
		
	}//������ end		~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public void init() {		
		jp1.setLayout(gl1);
		jp1.setFont(new Font("����", Font.BOLD, 24));
		for(int i=0;i<9;i++) {
			jbt[i]=new JButton((i+1)+" ");
			jp1.add(jbt[i]);
			//jbt[i].setIcon(imgDefault);
			jbt[i].setFont(new Font("����", Font.BOLD, 20));
		}
		
		jp2.setFont(new Font("����", Font.BOLD, 24));
		jp2.setLayout(gl2);
		jp2.add(bt_start); jp2.add(bt_next);  jp2.add(bt_exit); 
		
		
		this.add("Center",jp1);
		this.add("South",jp2);
		
		this.setTitle("������");
		
	}//init end

	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//�����ư
		if(ae.getSource()==bt_exit) {System.exit(0);}
		else if(ae.getSource()==bt_start||ae.getSource()==bt_next) {
			for(int i=0;i<9;i++) {
				jumsu[i]=0;
				jbt[i].setText((i+1)+" ");
				jp1.add(jbt[i]);
				jbt[i].setIcon(null);
				jbt[i].setFont(new Font("����", Font.BOLD, 20));
				jbt[i].setEnabled(true);
			}
		}
		
		for(int i=0;i<9;i++) {
			//if(ae.getActionCommand()==null)
			if(ae.getSource()==this.jbt[i]&&this.jbt[i].getIcon()==null) {
				this.jbt[i].setText("");
				if(flag==true) {
					this.jbt[i].setIcon(img[i]=new ImageIcon("images/ico1.gif"));
					flag=false;
					jumsu[i]=1;
					ox[i]="O";
					gamewin();
				}else {
					this.jbt[i].setIcon(img[i]=new ImageIcon("images/ico2.gif"));
					flag=true;
					jumsu[i]=-1;
					ox[i]="X";
					gamewin();
				}//flag if
			}//if end
		}//for end
		
	}//actionPerformed end
	
	public void gamewin() {
		if((jumsu[0]+jumsu[4]+jumsu[8])==3||(jumsu[2]+jumsu[4]+jumsu[6])==3||(jumsu[0]+jumsu[1]+jumsu[2])==3||(jumsu[3]+jumsu[4]+jumsu[5])==3||(jumsu[6]+jumsu[7]+jumsu[8])==3||(jumsu[0]+jumsu[3]+jumsu[6])==3||(jumsu[1]+jumsu[4]+jumsu[7])==3||(jumsu[2]+jumsu[5]+jumsu[8])==3) {
			for(int i=0;i<9;i++) {
				if(jumsu[i]!=1) {
					jbt[i].setEnabled(false);
				}
			}
			JOptionPane.showMessageDialog(this, "���� �¸�!");
		}else if((jumsu[0]+jumsu[4]+jumsu[8])==-3||(jumsu[2]+jumsu[4]+jumsu[6])==-3||(jumsu[0]+jumsu[1]+jumsu[2])==-3||(jumsu[3]+jumsu[4]+jumsu[5])==-3||(jumsu[6]+jumsu[7]+jumsu[8])==-3||(jumsu[0]+jumsu[3]+jumsu[6])==-3||(jumsu[1]+jumsu[4]+jumsu[7])==-3||(jumsu[2]+jumsu[5]+jumsu[8])==-3) {
			for(int i=0;i<9;i++) {
				if(jumsu[i]!=-1) {
					jbt[i].setEnabled(false);
				}
			}
			JOptionPane.showMessageDialog(this, "��� �¸�!");
		}else if(jumsu[0]!=0&&jumsu[1]!=0&&jumsu[2]!=0&&jumsu[3]!=0&&jumsu[4]!=0&&jumsu[5]!=0&&jumsu[6]!=0&&jumsu[7]!=0&&jumsu[8]!=0){
			for(int i=0;i<9;i++) {
				jbt[i].setEnabled(false); // setEnable - Ȱ�� ��Ȱ�� 
			}
			JOptionPane.showMessageDialog(this, "���� ����");
		}
	}//gamewin end
	
	
	public static void main(String[] args)	{//.....................................
		OmokGame og=new OmokGame();
	}//main END..............................................................................
	
	
	
	
}//class END
