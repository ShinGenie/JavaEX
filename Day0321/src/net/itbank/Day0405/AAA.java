package net.itbank.Day0405;


import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AAA extends Frame implements WindowListener {

	AAA(){
		
		this.setBackground(Color.BLUE);
		super.setBounds(100, 100, 500, 750);
		super.setTitle("연습삼아 만들어보기");
		super.setVisible(true);
		super.addWindowListener(this);
	}//AAA end
	
	public static void main(String[] args) {
		new AAA();

	}

	@Override public void windowClosing(WindowEvent e) {System.exit(0);}
	@Override public void windowOpened(WindowEvent e) { }
	@Override public void windowClosed(WindowEvent e) { }
	@Override public void windowIconified(WindowEvent e) { }
	@Override public void windowDeiconified(WindowEvent e) { }
	@Override public void windowActivated(WindowEvent e) { }
	@Override public void windowDeactivated(WindowEvent e) { }

}//class end

























