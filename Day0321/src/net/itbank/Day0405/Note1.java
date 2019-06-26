package net.itbank.Day0405;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Note2 extends JFrame implements KeyListener , ActionListener, WindowListener{

	
	
	
	Note2(){//메모장만들기 
		//형태
		this.setBounds(300, 300, 300, 300);
		this.setTitle("간편메모장");
		this.setBackground(Color.pink);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		//버튼
		this.add(new JButton("버튼"));
		this.setLayout(new FlowLayout());
//		
		//textField /area
		TextField tf = new TextField(30);
		TextArea ta = new TextArea();
		this.add("South",tf);
		this.add("North",ta);
		
		
		this.setVisible(true);

	}




	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void actionPerformed(ActionEvent e) {}
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
}//Note1 class END================================

public class Note1{
	public static void main (String [] args) {
		new Note2();
	}
}









