package net.itbank.day17;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestGame extends JFrame implements ActionListener, Runnable{

	TextArea ta = new TextArea();

	public TestGame() {//====================================================
		this.setFont(new Font("나눔고딕",Font.PLAIN,34));
		this.add("Center",ta);
		this.setTitle("초간단채팅창");
		this.setSize(300,300);
		this.setResizable(false);
		this.setVisible(true);

		//윈도종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	}//====================================================

	public void actionPerformed(ActionEvent e) { }

	public void run() { //재정의=Override
		while(true) {
			int su=0;
			//무한루프를 돌려야하는 경우 메세지내용 주고받는 횟수
			//무한루프로 처리하는 경우 서버에 접속 유저를 대기시켜야함
			su++;
			if(su%5==0) System.out.println(su+"\t");
			try {Thread.sleep(1000/2);}catch(Exception e) {}
			if(su==10)break;
		}//while end
	}//run end


	public static void main(String[] args) {

		TestGame tg = new TestGame();
//				tg.run();
		System.out.println("이름:홍길동");
		System.out.println("국어:50");
		System.out.println("수학:45");
		Thread tr = new Thread();
		tr.start();  // 무한루프처리 쓰레드로 구현  Thread 클래스 상속 Runnable 인터페이스 상속, 메소드 public void run(){무한루프처리}
		             // 메소드 start()로 run()호출
		int dan = 7;
		for(int i=0;i<30;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			try {Thread.sleep(1000/2);}catch(Exception e) {}
		}

		//---------------------------------> "무한루프처리"는 쓰레드 클레스에서 구현
		//----> 1.쓰레드 상속 extends 2.public void run(){while무한루프처리} 3. run메소드는 start메소드로 호출 
		// 4.쓰레드를 상속못하는 경우 runnable 인터페이스 상속받아서 구현  
		// start 메소드는 쓰레드 클래스 소속 


	}//main end
}//class end
