package net.itbank.Day0410;

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

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
public class TestLogin extends JFrame {

	JTextField tfID = new JTextField();
	JTextField tfPWD = new JTextField();
	JTextField tfPWD2 = new JTextField();
	JButton jbtnSubmint = new JButton();	
	JButton jbtnClose = new JButton();
	Checkbox cbxRemember = new Checkbox();
	
	
	
	
	
	
	public static void main(String[] args) {
		new TestLogin();
	} //end

	

}//class end
