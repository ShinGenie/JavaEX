package net.itbank.day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

//자바교재 120~123페이지 참고
public class Test_Image_1 extends JFrame  implements KeyListener{    
	Image img;
	int img_x=50, img_y=50; 
	
	
	public Test_Image_1() { 	
		Toolkit tk=Toolkit.getDefaultToolkit();
		img=tk.getImage("images/cat2.png");
		//생성자에서 그림지정 후 paint( )그림로드
		
//		Image resized = img.
		
		Container ct=this.getContentPane();	
		this.setTitle("그림이동제어");
		ct.setBackground(new Color(221, 255, 206));
		this.setBounds(200, 200, 800,800);
		setVisible(true);	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창닫기
		
		//윈도우화면에서 키를 눌렸을때 이벤트핸들러
		this.addKeyListener(this);

	}//기본생성자 코드기술
	
	public void paint(Graphics g) { //자동메모리 로드 실행
		super.paint(g); //부모껏 메소드 호출필수
		g.drawImage(img, img_x, img_y, 100, 100, this);
	}//paint end
	
	public static void main(String[] args){ //자동메모리로드 실행
		new Test_Image_1( );
	}//main end

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		int code = ke.getKeyCode();

		switch(code) {
		case KeyEvent.VK_RIGHT : img_x+=20; break;
		case KeyEvent.VK_LEFT : img_x-=20; break;
		case KeyEvent.VK_UP : img_y-=20; break;	
		case KeyEvent.VK_DOWN : img_y+=20; break;	
		}
		if(img_x<0) {img_x=50;
		}else if(img_x>800) {img_x=680;
		}else if(img_y<0) {img_y=30;
		}else if(img_y>800) {img_y=800;}
		this.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}//class END



