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
		this.setFont(new Font("�������",Font.PLAIN,34));
		this.add("Center",ta);
		this.setTitle("�ʰ���ä��â");
		this.setSize(300,300);
		this.setResizable(false);
		this.setVisible(true);

		//��������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	}//====================================================

	public void actionPerformed(ActionEvent e) { }

	public void run() { //������=Override
		while(true) {
			int su=0;
			//���ѷ����� �������ϴ� ��� �޼������� �ְ�޴� Ƚ��
			//���ѷ����� ó���ϴ� ��� ������ ���� ������ �����Ѿ���
			su++;
			if(su%5==0) System.out.println(su+"\t");
			try {Thread.sleep(1000/2);}catch(Exception e) {}
			if(su==10)break;
		}//while end
	}//run end


	public static void main(String[] args) {

		TestGame tg = new TestGame();
//				tg.run();
		System.out.println("�̸�:ȫ�浿");
		System.out.println("����:50");
		System.out.println("����:45");
		Thread tr = new Thread();
		tr.start();  // ���ѷ���ó�� ������� ����  Thread Ŭ���� ��� Runnable �������̽� ���, �޼ҵ� public void run(){���ѷ���ó��}
		             // �޼ҵ� start()�� run()ȣ��
		int dan = 7;
		for(int i=0;i<30;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			try {Thread.sleep(1000/2);}catch(Exception e) {}
		}

		//---------------------------------> "���ѷ���ó��"�� ������ Ŭ�������� ����
		//----> 1.������ ��� extends 2.public void run(){while���ѷ���ó��} 3. run�޼ҵ�� start�޼ҵ�� ȣ�� 
		// 4.�����带 ��Ӹ��ϴ� ��� runnable �������̽� ��ӹ޾Ƽ� ����  
		// start �޼ҵ�� ������ Ŭ���� �Ҽ� 


	}//main end
}//class end
