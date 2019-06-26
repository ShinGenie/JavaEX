package net.hb.day22;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Imoticon extends JFrame{
	JPanel jp = new JPanel();

	JButton jb[]=new JButton[9];
	Imoticon(){
		jp.setLayout(new GridLayout(3,3));
		
		JButton jb1=new JButton(new ImageIcon("images/imo1.png"));
		JButton jb2=new JButton(new ImageIcon("images/imo2.png"));
		JButton jb3=new JButton(new ImageIcon("images/imo3.png"));
		JButton jb4=new JButton(new ImageIcon("images/imo4.png"));
		JButton jb5=new JButton(new ImageIcon("images/imo5.png"));
		JButton jb6=new JButton(new ImageIcon("images/imo6.png"));
		JButton jb7=new JButton(new ImageIcon("images/imo7.png"));
		JButton jb8=new JButton(new ImageIcon("images/imo8.png"));
		JButton jb9=new JButton(new ImageIcon("images/imo9.png"));
		jp.add(jb1);	jp.add(jb2);	jp.add(jb3);
		jp.add(jb4);	jp.add(jb5);	jp.add(jb6);
		jp.add(jb7);	jp.add(jb8);	jp.add(jb9);
		jb[0]=jb1;	jb[1]=jb2;	jb[2]=jb3;
		jb[3]=jb4;	jb[4]=jb5;	jb[5]=jb6;
		jb[6]=jb7;	jb[7]=jb8;	jb[8]=jb9;

		this.add(jp);
		this.setTitle("연습");
		this.setBounds(50,50,220,220);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for(int i=0;i<9;i++) {
//			jb[i].setContentAreaFilled(false);// 배경자체 빼기
			jb[i].setBackground(Color.white);
			jb[i].setFocusPainted(false);
			jb[i].addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) {
				for(int i=0;i<9;i++) {	
					if(e.getSource()==jb[i]) { System.exit(0);}
					}
				}
			});
		}
	}
	public static void main(String[] args) {
		new Imoticon();
	}

}
