package net.itbank.Day0411;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OmokGame extends JFrame implements ActionListener{

	//혹시나 쓸까해서
	Container ct = null;
	JLabel info1=new JLabel();
	JLabel info2=new JLabel();


	// 시작 다시 종료 버튼  
	JPanel jp = new JPanel();
	GridLayout gl = new GridLayout(1,3);
	JButton bt_start = new JButton("시작");
	JButton bt_next = new JButton("다시");
	JButton bt_exit = new JButton("종료");

	// 3행3열 오목 버튼 배열로
	JPanel jp2 = new JPanel();
	GridLayout gl2 = new GridLayout(3,3);
	JButton[] jbt = new JButton[9];
	ImageIcon[] img = new ImageIcon[9];
	ImageIcon imgDefault = new ImageIcon("images/ico4.gif");

	// 결과
	int[] su = new int[9]; // 0하고 1표식하면 계산할때 힘드니까 7,8
	String[] ox = new String[9]; // o x

	//쌤이 강추하는 팁팁!
	String msg="";
	boolean flag=false;


	public OmokGame	(){
		this.init();

		//숫자뿌리기
		this.event();

		//화면구성요소
		this.setSize(300, 300);
		this.setVisible(true);

		//화면닫기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//화면 중앙뜨기 
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);

		//jp 폰트 세팅
		jp.setFont(new Font("Arial Black",Font.BOLD,30));
		
		//JLabel
		


	}//생성자


	public void my() {}//초기화
	public void init() {

		jp2.setLayout(gl2);// 판넬에 3행3열의 그리드가 들어감   flowLay대신 그리드로 대체 

		jp.setLayout(gl);
		jp.add(bt_start); jp.add(bt_next);	jp.add(bt_exit);

		this.add("Center",jp2);
		this.add("South",jp);

		//핸들러 추가
		bt_exit.addActionListener(this);
		bt_next.addActionListener(this);
		bt_start.addActionListener(this);
	}//초기화



	public void event() {
		for(int i=0;i<jbt.length;i++) {
			jbt[i]=new JButton("");
			jp2.add(jbt[i]);
			jbt[i].setIcon(imgDefault);
			jbt[i].addActionListener(this);
		}
	}//event

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt_exit) {System.exit(0);} 
		else if(e.getSource()==bt_next) {  gameClear(); } 
		else if(e.getSource()==bt_start) {gameClear();} // 초기화 함수를 만들어줘야한다. 이것안됨

		for(int i=0; i<jbt.length;i++) {
			if(e.getSource()==jbt[i]) {
				jbt[i].setText("");
				if(flag==true) {
					if(ox[i]==null){
						img[i]=new ImageIcon("Images/ico1.gif");
						jbt[i].setIcon(img[i]);
						flag=false;
						su[i]=7;
						ox[i]="y";
						gamewin();
					}
				}else {
					if(ox[i]==null){
						img[i]=new ImageIcon("Images/ico2.gif");
						jbt[i].setIcon(img[i]);
						flag=true;
						su[i]=8;
						ox[i]="n";
						gamewin();
					}
				}
			}
		}//결과 
	}//end

	public void gameClear() {		
		for(int i=0;i<jbt.length;i++) {
			jbt[i].setIcon(imgDefault);
			img[i]=null;
			su[i]=0;
			ox[i]=null;
		}
		
	}//end
	
	
	public void gamewin() {
		//대각
		if(su[0]==7&&su[4]==7&&su[8]==7) {JOptionPane.showMessageDialog(this, "수박승");}
		else if (su[0]==8&&su[4]==8&&su[8]==8) {JOptionPane.showMessageDialog(this, "사과승");}
		else if (su[2]==7&&su[4]==7&&su[6]==7) {JOptionPane.showMessageDialog(this, "수박승");}
		else if (su[2]==8&&su[4]==8&&su[6]==8) {JOptionPane.showMessageDialog(this, "사과승");}
		//세로
		for(int i=0;i<7;i=i+3) {
		if(su[i]==7&&su[i+1]==7&&su[i+2]==7) {JOptionPane.showMessageDialog(this, "수박승");}
		else if(su[i]==8&&su[i+1]==8&&su[i+2]==8) {JOptionPane.showMessageDialog(this, "사과승");}
		}
		//가로
		for(int i=0;i<3;i=i+1) {
		if(su[i]==7&&su[i+3]==7&&su[i+6]==7) {JOptionPane.showMessageDialog(this, "수박승");}
		else if(su[i]==8&&su[i+3]==8&&su[i+6]==8) {JOptionPane.showMessageDialog(this, "사과승");}
		}	
		//비길때 
		//if(su[i]!=0
		
	}//win

	public static void main(String[] args) {
		new OmokGame();
	}//end


}//class END









