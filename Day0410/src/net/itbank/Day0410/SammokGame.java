package net.itbank.Day0410;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SammokGame extends JFrame implements ActionListener{
	// 강사님이 아끼는 전역변수 // 권장!
	//ActionLister안에 엑션펄폼드 
	
	String msg="";
	boolean flag=false;
	
	JButton[] bt = new JButton[9];

	JPanel centerPan = new JPanel();
	GridLayout gl = new GridLayout(3,3,5,5); //3행3열 가로 세로 간격
	
	Container cn = this.getContentPane();
	
	ImageIcon img1 = new ImageIcon("images/ico1.gif");
	ImageIcon img2 = new ImageIcon("images/ico2.gif");
	ImageIcon img3 = new ImageIcon("images/ico3.gif");
	ImageIcon img4 = new ImageIcon("images/ico4.gif");
	ImageIcon bar = new ImageIcon("images/bar.gif");
	JLabel info = new JLabel("여기에 이름을 출력");

	public SammokGame() {}

	public SammokGame(String kind) {

		centerPan.setFont(new Font("Arial Black",Font.BOLD, 500));

		//화면위치 visible속성기술
		this.setTitle("삼목게임");
		this.setSize(300, 300);
		this.add("Center",centerPan);
		centerPan.setLayout(gl);
		

		// 버튼배열
		for(int i=0;i<bt.length;i++) {
			bt[i]= new JButton(""+(i+1)+"");
			centerPan.add(bt[i]);
			bt[i].addActionListener(this);
			
		this.setVisible(true);
			
		//
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		this.setLocation(xpos,ypos);
		this.setResizable(false);
//		this.setVisible(true);
		
		//윈도 종료처리 메소드 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	
	}// 생성자 end


	@Override
	public void actionPerformed(ActionEvent ae) {
		
		for(int i=0;i<bt.length;i++) {
			if(ae.getSource()==bt[i]) {
				updown(i);
			}
		}
	}
//	if(bt[i].getIcon()==null) {
//		
//	}
	
		public void updown(int i) {
			
			if(flag==true) {
				if(bt[i].getIcon()==null) {
					bt[i].setText("");
					bt[i].setIcon(img1);
					flag=false;
				}
			}else if(flag==false){
					bt[i].setText("");
					bt[i].setIcon(img2);
					flag=true;	
			}	
//			if(flag==false) {
//				bt[i].setText("");
//				bt[i].setIcon(img1);
//			}
		}

	public static void main(String[] args) {
		new SammokGame("삼목게임");
	}//main end

}//class end
