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


	//운영버튼 초기화
	JPanel jpl1 = new JPanel();
	GridLayout gl1 = new GridLayout(1,3);
	JButton jb1 = new JButton("시작");
	JButton jb2 = new JButton("다시");
	JButton jb3 = new JButton("종료");

	// 게임버튼 초기화
	JPanel jpl2 = new JPanel();
	GridLayout gl2 = new GridLayout(3,3);
	JButton[] jbt = new JButton[9];


	// 유용팁
	String msg="";
	boolean flag=false;

	// 게임이미지
	ImageIcon imgDefault = new ImageIcon("images/cat1.png");
	ImageIcon dog2 = new ImageIcon("images/dog2.png");
	ImageIcon cat2 = new ImageIcon("images/cat2.png");



	public SamokGame(){

		event();

		//화면 구성
		this.setTitle("삼목게임");
		this.setSize(500,500);
		this.setVisible(true);

		//화면 중앙
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);

		//화면 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}//생성자

	public static Icon ImageIcon(Icon icon) {
		//Image img = icon.getImage();
		//Image
		
		return new ImageIcon();
	}
	public void init(){}//초기화

	
	public void event(){
		
		//화면에 판 추가
		this.add("Center",jpl2);
		this.add("South",jpl1);
		
		//운영버튼 실행
		jpl1.setLayout(gl1);
		jpl1.add(jb1);	jpl1.add(jb2);	jpl1.add(jb3);

		//게임버튼 실행
		jpl2.setLayout(gl2);
		for(int i=0;i<jbt.length;i++){
			jbt[i] = new JButton();
			jbt[i].setIcon(imgDefault); // 아이콘 넣을때 setIcon
			jpl2.add(jbt[i]);
			jbt[i].addActionListener(this);

		}
		
	}//실행

	
	public void gameWin(){}//게임결과


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
