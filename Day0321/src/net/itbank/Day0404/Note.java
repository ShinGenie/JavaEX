package net.itbank.Day0404;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Note extends Frame  {
	
	public Note(){
		//1단계 창모양 무늬만들기
		//2단계 3단계 4단계 생략
		//5단계 
		this.addWindowListener(new MyExit());
	}
	
	public void disp() {
		this.setBackground(Color.orange);
		this.setBounds(300, 300, 700, 550);
		this.setTitle("");
		this.setVisible(true);
		this.addWindowListener(new MyExit());
	}
	 
	public static void main(String[]args) {
		Note nt = new Note();
		nt.disp();
	}

	public class MyExit extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent arg0) {
			System.out.println("MyExit내부 클래스");
			System.out.println("프로그램 종료합니다 9:45");
			System.exit(1);
		}

	}//myExit end//
	
}
