package net.itbank.Day0405;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.*;
import javax.swing.JFrame; //frame �� �ڽ�

public class Book extends JFrame {

	public void Book() {
		Container ct = this.getContentPane();
		this.setBackground(Color.CYAN);
		this.setBounds(300, 300, 900, 750);
		this.setTitle("BookŬ���� �ʰ��ܸ޸���");
		this.setVisible(true); // ��¥ â �����ֱ�
		this.addWindowListener(new MyExit());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[]args) {
		Book bk = new Book();
		bk.Book();
	}

	public class MyExit extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent arg0) {
			System.out.println("MyExit���� Ŭ����");
			System.out.println("���α׷� �����մϴ� 9:45");
			System.exit(1);
		}

	}//myExit end//

}
