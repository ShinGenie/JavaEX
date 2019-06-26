package net.itbank.Day0405;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class First extends Frame {

	public First() {
		
		Panel pan=new Panel();
		Button b1=new Button("신규등록");
		Button b2=new Button("전체출력");
		Button b3=new Button("이름검색");
		Button b4=new Button("삭제");
		Button b5=new Button("수정");
		Button b6=new Button("페이징구분");
		Button b7=new Button("은행검색");
		Button b8=new Button("공항검색");
		Button b9=new Button("이름검색");
		Button b10=new Button("사람검색");
		Button b11=new Button("물건검색");
		Button b12=new Button("프로그램 종료");
		pan.add(b1); pan.add(b2); pan.add(b3);
		pan.add(b4); pan.add(b5); pan.add(b6);
		pan.add(b7); pan.add(b8); pan.add(b9);
		pan.add(b10); pan.add(b11); pan.add(b12);
		
		this.add(pan);
		this.setBackground(Color.ORANGE);
		this.setBounds(300, 300, 500, 250);
		this.setSize(300, 200);
		this.setVisible(true);
		
		// 기본위치(x,y),크기(가로,세로)필수, setVisible(true) <- 이거없으면 출력못함
	}
	
	
	public static void main(String[] args) {
		new First();
	}//main end
}//class end
