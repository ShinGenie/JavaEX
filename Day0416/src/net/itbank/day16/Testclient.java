package net.itbank.day16;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.TextArea;

import javax.swing.JFrame;

public class Testclient extends JFrame {
	
	Button btnExit = new Button("종료하기"); //new 키워드는 메모리 할당공간 지정=heap 영역
	TextArea ta; // 선언만
	String msg; // 선언만
	int su; // 선언만 
	// 필드는 배열처럼 선언만해도 초기값이 있다. "null"
	
	
	public Testclient() {
		int su = 3; // 지역변수  -> 초기화해줘야함
		// 전역변수와 지역변수가 동일하면 지역변수가 먼저 우선순위
		ta = new TextArea();
		this.add("Center",btnExit);
		System.out.println("지역변수 su="+su);// 지역변수는 반드시 초기화
		System.out.println("전역변수 su="+this.su);// 전역변수 접근은 this.로 한다!!!!
		//지역변수가 없으면 this. 상관없이 전역변수것 가르킨다.
		
		//화면 구성크기, 보여주기
		Container ct = new Container();
		ct.getParent();
		ct.setBackground(Color.green);
		this.setBounds(300,300,500,300);
		this.setVisible(true);
		
		//이벤트 핸들러 추가 
		
		//화면종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//기본생성자
	
	

	public static void main(String[] args) {
		new Testclient(); 

	}//main end		

}//class end
