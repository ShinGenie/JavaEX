package net.itbank.day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

//�ڹٱ��� 120~123������ ����
public class Test_Image_1 extends JFrame  implements KeyListener{    
	Image img;
	int img_x=50, img_y=50; 
	
	
	public Test_Image_1() { 	
		Toolkit tk=Toolkit.getDefaultToolkit();
		img=tk.getImage("images/cat2.png");
		//�����ڿ��� �׸����� �� paint( )�׸��ε�
		
//		Image resized = img.
		
		Container ct=this.getContentPane();	
		this.setTitle("�׸��̵�����");
		ct.setBackground(new Color(221, 255, 206));
		this.setBounds(200, 200, 800,800);
		setVisible(true);	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â�ݱ�
		
		//������ȭ�鿡�� Ű�� �������� �̺�Ʈ�ڵ鷯
		this.addKeyListener(this);

	}//�⺻������ �ڵ���
	
	public void paint(Graphics g) { //�ڵ��޸� �ε� ����
		super.paint(g); //�θ� �޼ҵ� ȣ���ʼ�
		g.drawImage(img, img_x, img_y, 100, 100, this);
	}//paint end
	
	public static void main(String[] args){ //�ڵ��޸𸮷ε� ����
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



