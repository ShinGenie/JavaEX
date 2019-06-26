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
	JButton bt_start=new JButton("게임시작");
	JButton bt_next=new JButton("다시하기");
	JButton bt_exit=new JButton("게임종료");
	
	
	int[] jumsu=new int[9]; //0하고 1표식하면 계산이 어려우니 7과 8
	String[] ox=new String[9];// o or x
	String msg="";
	boolean flag=false;
	
	
	
	
	
	
	public OmokGame() {//~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		this.init();
		
		//윈도우 구성 속성 요소 크기 위치 setVisible
		this.setBounds(300, 300, 500, 500);
		this.setVisible(true);
		
		//윈도우 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트핸들러 리스너 등록 컴포넌트.addXXX리스너(this)
		for(int i=0;i<9;i++) {
			jbt[i].addActionListener(this);
		}
		bt_start.addActionListener(this); bt_next.addActionListener(this); bt_exit.addActionListener(this);
		
	
		
	}//생성자 end		~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public void init() {		
		jp1.setLayout(gl1);
		jp1.setFont(new Font("돋움", Font.BOLD, 24));
		for(int i=0;i<9;i++) {
			jbt[i]=new JButton((i+1)+" ");
			jp1.add(jbt[i]);
			//jbt[i].setIcon(imgDefault);
			jbt[i].setFont(new Font("돋움", Font.BOLD, 20));
		}
		
		jp2.setFont(new Font("돋움", Font.BOLD, 24));
		jp2.setLayout(gl2);
		jp2.add(bt_start); jp2.add(bt_next);  jp2.add(bt_exit); 
		
		
		this.add("Center",jp1);
		this.add("South",jp2);
		
		this.setTitle("삼목게임");
		
	}//init end

	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//종료버튼
		if(ae.getSource()==bt_exit) {System.exit(0);}
		else if(ae.getSource()==bt_start||ae.getSource()==bt_next) {
			for(int i=0;i<9;i++) {
				jumsu[i]=0;
				jbt[i].setText((i+1)+" ");
				jp1.add(jbt[i]);
				jbt[i].setIcon(null);
				jbt[i].setFont(new Font("돋움", Font.BOLD, 20));
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
			JOptionPane.showMessageDialog(this, "수박 승리!");
		}else if((jumsu[0]+jumsu[4]+jumsu[8])==-3||(jumsu[2]+jumsu[4]+jumsu[6])==-3||(jumsu[0]+jumsu[1]+jumsu[2])==-3||(jumsu[3]+jumsu[4]+jumsu[5])==-3||(jumsu[6]+jumsu[7]+jumsu[8])==-3||(jumsu[0]+jumsu[3]+jumsu[6])==-3||(jumsu[1]+jumsu[4]+jumsu[7])==-3||(jumsu[2]+jumsu[5]+jumsu[8])==-3) {
			for(int i=0;i<9;i++) {
				if(jumsu[i]!=-1) {
					jbt[i].setEnabled(false);
				}
			}
			JOptionPane.showMessageDialog(this, "사과 승리!");
		}else if(jumsu[0]!=0&&jumsu[1]!=0&&jumsu[2]!=0&&jumsu[3]!=0&&jumsu[4]!=0&&jumsu[5]!=0&&jumsu[6]!=0&&jumsu[7]!=0&&jumsu[8]!=0){
			for(int i=0;i<9;i++) {
				jbt[i].setEnabled(false); // setEnable - 활성 비활성 
			}
			JOptionPane.showMessageDialog(this, "게임 오버");
		}
	}//gamewin end
	
	
	public static void main(String[] args)	{//.....................................
		OmokGame og=new OmokGame();
	}//main END..............................................................................
	
	
	
	
}//class END
