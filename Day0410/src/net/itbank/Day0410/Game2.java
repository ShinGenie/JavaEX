package net.itbank.Day0410;

import java.awt.Button;

import javax.swing.JFrame;

public class Game2 extends JFrame {
	private Button btnconnect=new Button("서버접속");
	
	public Game2() {  
		 //this.btnstart
		 add("Center",btnconnect);
		
	  //윈도우속성 크기위치칼라제목 
		this.setBounds(300,300,500,300); //x,y,가로,높이
		this.setVisible(true);
		
		//윈도우자동종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//생성자 end
	
	
	public static void main(String[] args) {
		Game2 star=new Game2();
	}//end
}//class END
