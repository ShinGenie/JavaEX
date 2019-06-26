package net.itbank.Day0409;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class TestLogin extends Frame implements ActionListener, KeyListener {

	TextField tf = new TextField();
	TextField tfID = new TextField(15);
	TextField tfPWD = new TextField(15);
	TextField tfPWD2 = new TextField(15);
	Checkbox cbxRemember = new Checkbox("아이디기억",false);
	Button btnSubmit = new Button("확인");
	Button btnClose = new Button("취소");



	public TestLogin(){

		Label lbID = new Label("아이디       ",Label.LEFT);		
		Label lbPWD = new Label("비밀번호1");
		Label lbPWD2 = new Label("비밀번호2");

		lbID.setFont(new Font("comic Snads Ms",Font.BOLD, 16));		
		lbPWD.setFont(new Font("comic Snads Ms",Font.BOLD, 16));
		lbPWD2.setFont(new Font("comic Snads Ms",Font.BOLD, 16));

		tfID.setFont(new Font("comic Snads Ms",Font.BOLD, 16));		
		tfPWD.setFont(new Font("comic Snads Ms",Font.BOLD, 16));
		tfPWD2.setFont(new Font("comic Snads Ms",Font.BOLD, 16));

		btnSubmit.setFont(new Font("comic Snads Ms",Font.BOLD, 16));		
		btnClose.setFont(new Font("comic Snads Ms",Font.BOLD, 16));		
		//		tfPWD.setEchoChar('*');
		//		tfPWD2.setEchoChar('*');

		/**panel 기본레이아웃 왼쪽에서 오른쪽 물 흐르듯이 FlowLayout
		 * 판넬이나 화면이 붙일때 add()메소드 사용*/
		//먼저 소소한 작은 컴포넌트 =객체=오브젝트 생성후 속성지정
		Panel panelNorth = new Panel();
		Panel panelSouth = new Panel();// 나중 각자 활용
		Panel panelCenter = new Panel();

		panelCenter.add(lbID); panelCenter.add(tfID);
		panelCenter.add(lbPWD); panelCenter.add(tfPWD);
		panelCenter.add(lbPWD2); panelCenter.add(tfPWD2);
		panelCenter.add(cbxRemember); 
		panelCenter.add(btnSubmit); panelCenter.add(btnClose);

		//add()메소드 단독으로 쓰면 Frame 상속받은 현재클래스에 붙임
		this.add("North",panelNorth);		
		this.add("Center",panelCenter);
		this.add("South",panelSouth);



		this.setTitle("로그인화면");
		this.setBounds(300,300,300,180);
		this.setBackground(Color.ORANGE);
		this.setResizable(false);
		this.setVisible(true);

		//이벤트리스너 핸들러 등록
		this.addWindowListener(new MyExit());
		tfID.addActionListener(this);
		tfPWD.addActionListener(this);
		tfPWD2.addActionListener(this);
		btnSubmit.addActionListener(this); // 버튼을 누르면 이벤트 핸들러 반드시 거쳐야
		btnClose.addActionListener(this);
		tfID.addKeyListener(this);
		tfPWD.addKeyListener(this);
		tfPWD2.addKeyListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		TextField tf = new TextField();
		String id =tfID.getText();
		String pw =tfPWD.getText();
		String pw2=tfPWD2.getText();


		if(ae.getSource()==this.tfID) {identer(id);}
		else if(ae.getSource()==btnClose) {clearText();}
		else if(ae.getSource()==btnSubmit) {}
		else if(ae.getSource()==tfPWD) {
			 if(pw.matches("[0-9]+")==false) {
				JOptionPane.showMessageDialog(this, "숫자만 입력하세요");
				tfPWD.setText("");
			}
		}



	}//end

	public void identer(String id) {
		// ID입력란 tfID
		if(id.equals("")||id==" ") {
			JOptionPane.showMessageDialog(this, "입력데이터가 공백입니다");
			tfID.requestFocus();
		}else if(id.length()!=4) { //id.consume();
			JOptionPane.showMessageDialog(this, "4자리 수입니다");
			clearText();
		}else if(id.matches("[a-z]+")==false) {
			JOptionPane.showMessageDialog(this, "소문자 입력하세요");
			clearText();
		}else {tfPWD.requestFocus();}

				
	}

	public void clearText() {
		tfID.setText("");
		tfPWD.setText("");
		tfPWD2.setText("");
		tfID.requestFocus();
		tfPWD.requestFocus();
	}

	class MyExit extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent we) {
			System.exit(0);
			System.out.println("로그인화면 종료합니다");
		}
	}

	public static void main(String[] args) {
		new TestLogin();
	} //end

	@Override
	public void keyTyped(KeyEvent e) {
////		tfID = (TextField)e.getSource();
////		if(tfID.getText().length()>3) {e.consume();
////			if(tfID.getText().equals("")||tfID.getText()==" ") {
////				JOptionPane.showMessageDialog(this, "입력데이터가 공백입니다");
////				tfID.requestFocus();
////			}else if(tfID.getText().matches("[a-z]")==false) {
////				JOptionPane.showMessageDialog(this, "소문자 입력해주세요");
////				tfID.requestFocus();
////			}
//		}
//		tfPWD = (TextField)e.getSource();
//		if(tfPWD.getText().length()>6) e.consume();
//		tfPWD2 = (TextField)e.getSource();
//		if(tfPWD2.getText().length()>6) e.consume();
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		if(ke.getKeyCode() == KeyEvent.VK_ENTER) {
			tfPWD2.requestFocus();
		}


	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}


}//class end
