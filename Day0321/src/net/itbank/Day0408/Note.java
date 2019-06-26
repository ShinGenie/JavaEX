package net.itbank.Day0408;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Note extends Frame implements  ActionListener{
	private TextField tf=new TextField(33); //한줄=싱글라인, 하단=남쪽 South
	private TextArea ta=new TextArea(); //여러줄=멀티영역, 센타=중앙 Center
	private Button btnExit = new Button( "종료버튼" ); //나중에 판넬에 add합니다
	private Button btnSend = new Button("메세지보내기");
	private ImageIcon img1 = new ImageIcon("images/x.gif");
	private ImageIcon img2 = new ImageIcon("images/y.gif");
	private JButton jExit = new JButton("img1");
	private JButton jsend = new JButton("img2");
	
	private Panel pan=new Panel( ); //simplest container쟁반역할=캐리어역할
	
	public Note( ){   
		  ta.setFont(new Font("Comic Sans MS", Font.BOLD, 42));
		  ta.setBackground(Color.LIGHT_GRAY);
		  tf.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		  
		  //add붙이기 = 레이아웃= Frame상속이라서 기본레이아웃 BorderLayout
			pan.add(new Label(" 메세지:", Label.RIGHT)); 
			pan.add(tf); pan.add(jsend); pan.add(jExit);
		
		  this.add("Center", ta);
		  this.add("North", pan); //this.add("South", tf);
		
  		//1단계   윈도우모양만듬=화면
  		this.setBackground(Color.PINK); 
  		this.setBounds(300, 300, 600, 350); 
  		this.setTitle("초간단메모장");
  		this.setVisible(true); 
  		
  		//마지막단계 감시자이벤트 핸들러 꼭꼭꼭추가
  		//this.addWindowListener(this); 첫번째 WindowListener 상속
  		//MyExit me = new MyExit();
  		this.addWindowListener(new MyExit());
  		//this.addWindowListener(new WindowAdapter() {
			//	public void windowClosing(WindowEvent e) { System.exit(1);} 			
			//});
  		
  		tf.addActionListener(this);
  		btnExit.addActionListener(this);
  		btnSend.addActionListener(this);
  		jExit.addActionListener(this);
  		jsend.addActionListener(this);
  }//end
  
	public static void main(String[] args)  {
	  new Note( );
	}//end

	
	@Override
	public void actionPerformed(ActionEvent ae) { //버튼클릭, 입력란 입력후enter이벤트적용
		if(ae.getSource()==tf) {  getMessage(); }
		else if(ae.getSource()==btnSend) { getMessage(); }
		else if(ae.getSource()==btnExit) { myExit();}
		else if(ae.getSource()==jExit) { getMessage(); }
		else if(ae.getSource()==jsend) { myExit();}
	}//actionPerformed end
	
	 public void getMessage( ) {//우리가만든 non-static메소드
			String msg=this.tf.getText();
			this.ta.append(">> "+msg+"\n"); //setText메소드 비권장
			if(msg.equals("exit") || msg.equals("EXIT")) {
				this.myExit();
			}
			this.tf.setText("");  
	 }//end

	 public void myExit( ) {//우리가만든 non-static메소드
		 System.out.print("프로그램 종료합니다 ");
		 System.exit(0); 
	 }
	
	  class MyExit extends WindowAdapter {
			public void windowClosing(WindowEvent e) { System.exit(1);} 			  	
	  }

	
}//Note class END================================










