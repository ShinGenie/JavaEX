package net.itbank.Day0410;

import java.awt.Button;

import javax.swing.JFrame;

public class Game2 extends JFrame {
	private Button btnconnect=new Button("��������");
	
	public Game2() {  
		 //this.btnstart
		 add("Center",btnconnect);
		
	  //������Ӽ� ũ����ġĮ������ 
		this.setBounds(300,300,500,300); //x,y,����,����
		this.setVisible(true);
		
		//�������ڵ�����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//������ end
	
	
	public static void main(String[] args) {
		Game2 star=new Game2();
	}//end
}//class END
