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
		this.setTitle("�ʰ���ä��â");
		//JPanel main Pan, firstPan, TwoPan; �ʵ� ���������� ���
		//ù��° firstPan �����ۼ�
		firstPan=new JPanel();

		JLabel jLb1=new JLabel("����IP: ");
		tfip=new JTextField("127.0.0.1",20);
		JPanel pnA=new JPanel(); 
		pnA.add(jLb1); pnA.add(tfip);

		
		JLabel jLb2=new JLabel("��ȭ��: ");
		tfnick=new JTextField("young",20);
		JPanel pnB=new JPanel();
		pnB.add(jLb2); pnB.add(tfnick);

		JLabel jLb3=new JLabel("IP�� ��ȭ���� �Է��ϼ���");
		jLb3.setFont(new Font("����ü",Font.BOLD,15));
		jLb3.setForeground(Color.pink);
		JPanel pnC = new JPanel();
		pnC.add(jLb3);

		JPanel pn=new JPanel();
		pn.add(pnA); pn.add(pnB); pn.add(pnC);
		
		btnConection = new JButton("������ ���� Connection");
		
		//firstPan�ǳ��� pn,btnConnecti�ٿ���
		firstPan.setBorder(BorderFactory.createTitledBorder("���� ���� ä��ȭ��"));
		firstPan.setLayout(new BorderLayout()); //���� ���̾ƿ��� �������� ��Ÿ���� �� �׷��� ������ְ� ��������ó��
		firstPan.add("Center",pn);
		firstPan.add("South",btnConection);

		
		/////////////////////////////////////////////////////////////////////////
		//�ι�° twoPan �ι�°�ۼ�
		twoPan=new JPanel();
		JPanel pn1 = new JPanel();
		ta = new JTextArea();
		tfmessage = new JTextField("",20);
		btnSend = new JButton("������");
		btnExit = new JButton("����");
		twoPan.setBorder(BorderFactory.createTitledBorder("ä�ó���"));
		pn1.setBorder(BorderFactory.createTitledBorder("��ȭ�ϱ�"));
		pn1.add(tfmessage);	pn1.add(btnSend);	pn1.add(btnExit);
		twoPan.setLayout(new BorderLayout());
		twoPan.add("Center",ta);
//		pn1.setLayout(new BorderLayout());
		twoPan.add("South",pn1);

		
		//����° mainPan=firstPan+twoPan
		mainPan.setLayout(cl);
		mainPan.add(firstPan,"����â");
		mainPan.add(twoPan,"ä��â");
		cl.show(mainPan, "����â");
		this.add(mainPan);
		
		//�����Ӽ� ���� ũ�� ��ġ Į�� ������
		this.setSize(400,300);
		this.setTitle("���̳�");
		this.setResizable(false);
		this.setVisible(true);
		
		//��������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//�ڵ鷯
		btnConection.addActionListener(this);
		btnSend.addActionListener(this);
		btnExit.addActionListener(this);
		
	}//====================================================


	public static void main(String[] args) {
		new TestChat();
	}//main end


	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnConection) {
			cl.show(mainPan, "ä��â");
			

		}else if(e.getSource()==btnSend) {
			ta.append(tfmessage.getText()+"\n");
			tfmessage.setText("");
			tfmessage.requestFocus();
		}else if(e.getSource()==btnExit) {
			System.out.println("ä��client����ȭ�����α׷��� �����մϴ�");
			System.exit(1);
		}else if(e.getSource()==tfmessage) {

		}

	}
}//class end
