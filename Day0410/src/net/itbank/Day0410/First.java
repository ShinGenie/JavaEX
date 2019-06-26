package net.itbank.Day0410;

import java.awt.Label;

import javax.swing.JTextField;

public class First {
	Label txt;	
	

	public static void main(String[] args) {
		
		new First().txt= new Label("º°º°");
		new First().add(new First().txt);
		JTextField txt = new JTextField("123", 30);
		txt.setHorizontalAlignment(JTextField.RIGHT);
	}//end


	private void add(Label txt2) {
		// TODO Auto-generated method stub
		
	}
}//class END
