package net.itbank.Day0412;

import java.awt.Button;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GridBagFrame extends JFrame  {
	private Label lbReceive = new Label("받는 사람: ",Label.RIGHT);
	private Label lbContent = new Label("내용: ",Label.RIGHT);
	private Label lbFile = new Label("첨부파일: ",Label.RIGHT);
	private Button btnSearch = new Button("찾아보기");
	private Button btnSend = new Button("보내기");
	private TextField toPerson = new TextField(40);
	private TextField file = new TextField(30);
	private TextArea content = new TextArea(5,40);
	
	private GridBagLayout gBag = new GridBagLayout();
	
	 GridBagFrame(){
		this.setLayout(gBag);
		this.insert(lbReceive,0,0,1,1);
		this.insert(toPerson,1,0,3,1);
		this.insert(lbContent,0,1,1,1);
		this.insert(lbFile,3,0,1,1);
		this.insert(btnSend,4,0,4,1);
		this.insert(file,1,2,2,1);
		this.insert(content,1,1,3,1);
		this.insert(btnSearch,3,2,1,1);
		this.pack();
		this.setResizable(false);
		this.setBounds(300, 300, 500, 250);
		this.setTitle("진이네");
//		this.setVisible(true);
		
	//윈도종료
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}//생성자

	private void insert(Component cmpt, int i, int j, int k, int l) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=i;
		gbc.gridy=j;
		gbc.gridwidth=k;
		gbc.gridheight=l;
		this.gBag.setConstraints(cmpt, gbc);
		this.add(cmpt);
		
	}

	public static void main(String[] args) {
		new GridBagFrame();
		new GridBagFrame().setVisible(true);
	}
	
}//class end



























