package net.itbank.day18;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.midi.SysexMessage;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestGame extends JFrame implements Runnable  { // �������̽� implements�� �׻� ������ �������

	int su=0;
	@Override
	public void run() {
		while(true) {
			su++;
			System.out.print(su+"\t");
			if(su%5==0) System.out.println();
			try {Thread.sleep(300);}catch(Exception e) {   }
		}//while end
	}//run end

	public static void main(String[] args) {
		TestGame tg = new TestGame();
		Thread tr = new Thread(new TestGame()); // �ڱ��ڽ� this ������, static �̱� ������ �����ڷ� �ֱ�
		tr.start();

		System.out.println("�̸�:ȫ�浿");
		System.out.println("����:90");
		System.out.println("����:85");
		int dan=7;
		for(int i=1;i<30;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			try {Thread.sleep(300);}catch(Exception e) {   }
		}//for end
	}//main end
}//class END





