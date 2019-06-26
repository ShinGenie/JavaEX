package net.itbank.day19;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SwingConstants;


class Counter extends Thread {
	JLabel info;
	
	Counter(JLabel info) {
		this.info= info;
	}
	
	public void run() {
		long su = 0;
		while(true) {
			su++;
			info.setText(String.valueOf(su/100.0));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {break;}
		}//while end
	}
}// Counter class END

class FrameKeyHandler implements KeyListener {
	TestThreadKey ui;
	Counter c;
	
	public FrameKeyHandler(TestThreadKey ui) {
		this.ui = ui;
	}
	
	public void keyReleased(KeyEvent e) {   }
	public void keyTyped(KeyEvent e) { 	}
	
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed : " + e.getKeyCode());
		if(e.getKeyCode()==10 || e.getKeyCode()==32) {
			if(ui.getTitle().equals("STOP") ) {
				ui.setTitle("START");
				if(c == null) {
					c = new Counter(ui.lb);
					c.start();
					//c.run(); //쓰레드아니고 일반메소드로 호출 무한루프
				}else {
					c.resume();
				}
			}else {
				ui.setTitle("STOP");
				c.suspend();
			}
		}else if(e.getKeyCode() == 27) {
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		}
	}
}//FrameKeyHandler class END


public class TestThreadKey extends JFrame {
	public JLabel lb;
	public Image img; //필드
	
	public TestThreadKey() {
		img=Toolkit.getDefaultToolkit().getImage("C:\\aaa.png");
		
		setTitle("STOP");
		setBounds(350,350,600,500);
		getContentPane().setLayout(null);
		setVisible(true);
		
		lb = new JLabel("0.00");
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		lb.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lb.setBounds(200, 130, 70, 70);
		getContentPane().add(lb);
		
		// ms접미사는 그림나오면 안보임  
		JLabel lblMs = new JLabel("ms");
		lblMs.setHorizontalAlignment(SwingConstants.CENTER);
		lblMs.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblMs.setBounds(270, 130, 70, 70);
		getContentPane().add(lblMs);
		
		this.addKeyListener(new FrameKeyHandler(this));
		
		//윈도우종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end

	public void paint(Graphics g) {
		super.paint(g); //부모껏 메소드 호출필수
		g.drawImage(img, 100, 70,this);
	}//paint end
	
	public static void main(String[] args) {
		TestThreadKey t = new TestThreadKey();
	}
}// TestThreadKey class END