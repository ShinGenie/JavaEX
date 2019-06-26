package net.itbank.Day0410;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.math.BigDecimal;

import javax.swing.*;


public class Game extends JFrame implements ActionListener {

	//	private Button btnstart=new Button("서버 접속");

	/**현재 입력된 값을 저장해 놓는 변수*/

	private Button btnExit=new Button("프로그램종료");
	
	JButton[] bt = new JButton[9];
	GridLayout gl = new GridLayout(3,3);
	JPanel jpl = new JPanel();
	
//	JButton[] bt1 = {'%','√','x',"CE','C','←'};
	GridLayout gl1 = new GridLayout(3,3);
	JPanel jpl1 = new JPanel();
	
	
	
	
	JTextField jtf = new JTextField();
	//쌤이 사랑하는 코드
	String msg="";
	Label txt;
	
	Button b0 = new Button("0");
	Button bCE = new Button("CE");
	Button bE = new Button("E");	
	Button bplus = new Button("+");
	Button bret = new Button("=");
	Button back = new Button("←");	

	

	



	public Game() {

		/**글자*/
		add("North",jtf);
		jtf.setFont(new Font("Arial", Font.BOLD, 16));
		jtf.setHorizontalAlignment(JTextField.RIGHT);
	
		/**숫자판*/
		for(int i=0;i<bt.length;i++) {
			bt[i]= new JButton(""+(i+1)+"");
			jpl.add(bt[i]);
			bt[i].addActionListener(this);	
		}
		
		/**종료 버튼 하단*/
		add("South",btnExit);
		btnExit.setFont(new Font("Arial", Font.BOLD, 16));

		/**윈도우 속성 크기 칼라 제목  비주얼 부분 - 수작업*/
		this.add(jpl);
		jpl.setLayout(gl);
		this.setSize(300, 300);
		this.setVisible(true);
		
		//screen center
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);

		/**윈도우 자동종료 -> 이것 불러줘야 닫힘*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		// 버튼나가기 
		btnExit.addActionListener(this);

		b0.addActionListener(this);
		bCE.addActionListener(this);
		bE.addActionListener(this);
		bplus.addActionListener(this);
		bret.addActionListener(this);
		back.addActionListener(this);


	}


	//	JTextField inputText = new JTextField("", SwingConstants.CENTER); // 사용자 입력을 받는 텍스트 필드
	//	  inputText.setHorizontalAlignment(JTextField.RIGHT); // 프롬프트를 오른쪽 정렬 시킨다.


	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==btnExit) {System.exit(1);} // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 이것때문에 자동닫힘
		if(e.getSource()==bCE) {msg=""; jtf.setText("");}
		if(e.getSource()==bE) {msg=""; jtf.setText("");}
		
		for(int i=0;i<bt.length;i++) {
			if(e.getSource()==bt[i]) {
				msg=msg+bt[i].getText();
				jtf.setText(msg);		
			}
		}
		
		if(e.getSource()==b0) {msg+="0"; jtf.setText(msg);}
		if(e.getSource()==bCE) {msg+=""; jtf.setText(msg);}
		if(e.getSource()==bE) {msg+=""; jtf.setText(msg);}
		if(e.getSource()==b0) {msg+="0"; jtf.setText(msg);}
		if(e.getSource()==back) {
			msg=msg.substring(0,(msg.length()-1)); 
			jtf.setText(msg);
		}


	}


	public static void main(String[] args) {
		new Game();
	}

}//class end
