package net.itbank.day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.util.Observer;

import javax.swing.JFrame;

public class Test_Image extends JFrame  implements KeyListener {    
	Image img; //필드
	int img_x=50, img_y=250 ; //필드
	
	public Test_Image() { 	
		Toolkit tk=Toolkit.getDefaultToolkit();
		img=tk.getImage("images/cat2.png");
		//생성자에서 그림지정후 paint( )그림로드
		
		Container ct=this.getContentPane();
		this.setTitle("그림이동제어");
		ct.setBackground(Color.GREEN);
		//ct.setBackground(Color.YELLOW);
		this.setBounds(200, 200, 650,550);
		this.setVisible(true);//눈에보여지는역할
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창닫기
		
		//ㅏkey리스너호출=이벤트핸들러
		addKeyListener(this);
	}//기본생성자 코드기술
	
	public void paint(Graphics g) {
		super.paint(g); //부모껏 메소드 호출필수
		g.drawImage(img, img_x, img_y,this);
	}//paint end
	
	public void keyReleased(KeyEvent e) {  }//end
	public void keyTyped(KeyEvent e){ }//end
	
	public void keyPressed(KeyEvent e) {
		int code=e.getKeyCode();
		if(code==KeyEvent.VK_RIGHT){ 
			 img_x=img_x+20; 
			 if(img_x>=580) {img_x=-30;}
		}else if(code==KeyEvent.VK_LEFT){
			 img_x=img_x-20;
			 if(img_x<-30){ img_x=590;}
		}else if(code==KeyEvent.VK_UP) {
			img_y=img_y-20;
			if(img_y<-30){ img_y=530;}
		}else if(code==KeyEvent.VK_DOWN) {
			img_y=img_y+20;
			if(img_y>540){ img_y=-25;}
		}else if(code==KeyEvent.VK_ESCAPE) {
			 System.out.println("그림이동게임을 종료합니다");
			 System.exit(0);
		}else{ } 
			 
		repaint();//paint메소드호출
	}//end

	public static void main(String[] args){
		Test_Image nt =new Test_Image( );
	}//main end
	
}//class END



