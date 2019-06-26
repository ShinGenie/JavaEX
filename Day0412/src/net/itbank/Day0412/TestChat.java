package net.itbank.Day0412;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestChat extends JFrame implements ActionListener {
	JPanel firstPan, twoPan, pn1;

	JTextField tfip, tfnick, tfmessage;
	JTextArea ta;
	JButton btnConection, btnSend, btnExit;
	BorderLayout bl;
	JLabel info, twoInnerLb;
	CardLayout cl=new CardLayout();
	JPanel mainPan = new JPanel();


	public TestChat() {//====================================================
		this.setTitle("초간단채팅창");
		//JPanel main Pan, firstPan, TwoPan; 필드 전역변수것 사용
		//첫번째 firstPan 먼저작성
		firstPan=new JPanel();

		JLabel jLb1=new JLabel("서버IP: ");
		tfip=new JTextField("127.0.0.1",20);
		JPanel pnA=new JPanel(); 
		pnA.add(jLb1); pnA.add(tfip);

		
		JLabel jLb2=new JLabel("대화명: ");
		tfnick=new JTextField("young",20);
		JPanel pnB=new JPanel();
		pnB.add(jLb2); pnB.add(tfnick);

		JLabel jLb3=new JLabel("IP와 대화명을 입력하세요");
		jLb3.setFont(new Font("굴림체",Font.BOLD,15));
		jLb3.setForeground(Color.pink);
		JPanel pnC = new JPanel();
		pnC.add(jLb3);

		JPanel pn=new JPanel();
		pn.add(pnA); pn.add(pnB); pn.add(pnC);
		
		btnConection = new JButton("서버에 접속 Connection");
		
		//firstPan판넬이 pn,btnConnecti붙여요
		firstPan.setBorder(BorderFactory.createTitledBorder("진이 다중 채팅화면"));
		firstPan.setLayout(new BorderLayout()); //보더 레이아웃은 동서남북 나타내는 것 그래서 명시해주고 동서남북처리
		firstPan.add("Center",pn);
		firstPan.add("South",btnConection);

		
		/////////////////////////////////////////////////////////////////////////
		//두번째 twoPan 두번째작성
		twoPan=new JPanel();
		JPanel pn1 = new JPanel();
		ta = new JTextArea();
		tfmessage = new JTextField("",20);
		btnSend = new JButton("보내기");
		btnExit = new JButton("종료");
		twoPan.setBorder(BorderFactory.createTitledBorder("채팅내용"));
		pn1.setBorder(BorderFactory.createTitledBorder("대화하기"));
		pn1.add(tfmessage);	pn1.add(btnSend);	pn1.add(btnExit);
		twoPan.setLayout(new BorderLayout());
		twoPan.add("Center",ta);
//		pn1.setLayout(new BorderLayout());
		twoPan.add("South",pn1);

		
		//세번째 mainPan=firstPan+twoPan
		mainPan.setLayout(cl);
		mainPan.add(firstPan,"접속창");
		mainPan.add(twoPan,"채팅창");
		cl.show(mainPan, "접속창");
		this.add(mainPan);
		
		//윈도속성 제목 크기 위치 칼라 비저블
		this.setSize(400,300);
		this.setTitle("진이네");
		this.setResizable(false);
		this.setVisible(true);
		
		//윈도종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//핸들러
		btnConection.addActionListener(this);
		btnSend.addActionListener(this);
		btnExit.addActionListener(this);
		
	}//====================================================


	public static void main(String[] args) {
		new TestChat();
	}//main end


	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnConection) {
			cl.show(mainPan, "채팅창");
			

		}else if(e.getSource()==btnSend) {
			ta.append(tfmessage.getText()+"\n");
			tfmessage.setText("");
			tfmessage.requestFocus();
		}else if(e.getSource()==btnExit) {
			System.out.println("채팅client접속화면프로그램을 종료합니다");
			System.exit(1);
		}else if(e.getSource()==tfmessage) {

		}

	}
}//class end
