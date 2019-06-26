package net.itbank.Day0412;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
	GridLayout gl2 = new GridLayout(5,5);
	JButton[] jbt = new JButton[25];

	// 유용팁
	String msg="";
	boolean flag=false;
	int su[] = new int [25];
	String ox[] = new String [25];

	// 게임이미지
	ImageIcon pet = new ImageIcon("images/pet2.png");
	ImageIcon cat = new ImageIcon("images/cat2.png");
	ImageIcon dog = new ImageIcon("images/dog2.png");
	ImageIcon[] img = new ImageIcon[25];

	// img resizabe
	public static ImageIcon iconResize(ImageIcon icon, int resizeWidth, int resizeHeight){
		Image img1 = icon.getImage();
		Image resizableImg = img1.getScaledInstance(resizeWidth, resizeHeight, java.awt.Image.SCALE_SMOOTH);
		return new ImageIcon(resizableImg);
	}//end

	public SamokGame(){
		event();
		//화면 구성
		this.setTitle("오목게임");
		this.setSize(700,700);
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
		//핸들러 추가
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		for(int i=0;i<jbt.length;i++){
			jbt[i].addActionListener(this);
		}
	}//생성자end

	public void event(){
		//운영버튼 실행
		jpl1.setLayout(gl1);
		jpl1.add(jb1);	jpl1.add(jb2);	jpl1.add(jb3);
		//게임버튼 실행
		jpl2.setLayout(gl2);
		for(int i=0;i<jbt.length;i++){
			jbt[i]=new JButton(iconResize(pet,80,80));
			jbt[i].setBorderPainted(true);
			jbt[i].setBackground(Color.white);
			jbt[i].setFocusPainted(false);
			jpl2.add(jbt[i]);
		}
		//화면에 판 추가
		this.add("Center",jpl2);
		this.add("South",jpl1);
	}//실행 end

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==this.jb1){imageclear();}
		if(ae.getSource()==this.jb2){}//gameOneBack();
		if(ae.getSource()==this.jb3){System.exit(1);}
		for(int i=0;i<jbt.length;i++){
			if(ae.getSource()==jbt[i]){
				jbt[i].setText("");
				if(flag==false){
					if(su[i]==0){
						img[i]=iconResize(cat, 80, 80);
						jbt[i].setIcon(img[i]);
						flag=true;
						su[i]=7;
						gameWin();
					}
				}else{
					if(su[i]==0){
						img[i]=iconResize(dog, 80, 80);
						jbt[i].setIcon(img[i]);
						flag=false;
						su[i]=8;
						gameWin();
					}
				}//flag 거짓 false ends
			}//if end
		}//for end
	}

	public void gameWin(){
		//대각
		if(su[0]==7&&su[6]==7&&su[12]==7&&su[18]==7&&su[24]==7){JOptionPane.showMessageDialog(jpl2, "cat win");imageclear();}
		else if(su[0]==8&&su[6]==8&&su[12]==8&&su[18]==8&&su[24]==8){JOptionPane.showMessageDialog(jpl2, "dog win");imageclear();}
		if(su[4]==7&&su[8]==7&&su[12]==7&&su[16]==7&&su[20]==7){JOptionPane.showMessageDialog(jpl2, "cat win");imageclear();}
		else if(su[4]==8&&su[8]==8&&su[12]==8&&su[16]==8&&su[20]==8){JOptionPane.showMessageDialog(jpl2, "dog win");imageclear();}
//		//가로
		for(int i=0;i<5;i++){
			if(su[i]==7&&su[i+5]==7&&su[i+10]==7&&su[i+15]==7&&su[i+20]==7){JOptionPane.showMessageDialog(jpl2, "cat win");imageclear();}
			else if(su[i]==8&&su[i+5]==8&&su[i+10]==8&&su[i+15]==8&&su[i+20]==8){JOptionPane.showMessageDialog(jpl2, "dog win");imageclear();}
		}
//		//세로
		for(int i=0;i<7;i=i+5){
			if(su[i]==7&&su[i+1]==7&&su[i+2]==7&&su[i+3]==7&&su[i+4]==7&&su[i+5]==7){JOptionPane.showMessageDialog(jpl2, "cat win");imageclear();}
			else if(su[i]==8&&su[i+1]==8&&su[i+2]==8&&su[i+3]==8&&su[i+4]==8&&su[i+5]==8){JOptionPane.showMessageDialog(jpl2, "dog win");imageclear();}
		}
//		//비겼을때
			if(su[0]!=0&&su[1]!=0&&su[2]!=0&&su[3]!=0&&su[4]!=0&&su[5]!=0&&su[6]!=0&&su[7]!=0&&su[8]!=0&&
			   su[9]!=0&&su[10]!=0&&su[11]!=0&&su[12]!=0&&su[13]!=0&&su[14]!=0&&su[15]!=0&&su[16]!=0&&su[17]!=0&&
			   su[18]!=0&&su[19]!=0&&su[20]!=0&&su[21]!=0&&su[22]!=0&&su[23]!=0&&su[24]!=0){
				JOptionPane.showMessageDialog(jpl2, "비겼습니다");
				try {Thread.sleep(3000);}catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
			this.imageclear();
			}
		}//게임결과


		private void imageclear() {
			for(int i=0;i<jbt.length;i++){
				img[i]=null;
				jbt[i].setIcon(iconResize(pet,80,80));
				flag=false;
				su[i]=0;

			}
		}

		public static void main(String[] args) {
			new SamokGame();
		}//end
	}//class END
