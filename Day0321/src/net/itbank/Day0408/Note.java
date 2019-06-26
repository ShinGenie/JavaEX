package net.itbank.Day0408;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Note extends Frame implements  ActionListener{
	private TextField tf=new TextField(33); //����=�̱۶���, �ϴ�=���� South
	private TextArea ta=new TextArea(); //������=��Ƽ����, ��Ÿ=�߾� Center
	private Button btnExit = new Button( "�����ư" ); //���߿� �ǳڿ� add�մϴ�
	private Button btnSend = new Button("�޼���������");
	private ImageIcon img1 = new ImageIcon("images/x.gif");
	private ImageIcon img2 = new ImageIcon("images/y.gif");
	private JButton jExit = new JButton("img1");
	private JButton jsend = new JButton("img2");
	
	private Panel pan=new Panel( ); //simplest container��ݿ���=ĳ�����
	
	public Note( ){   
		  ta.setFont(new Font("Comic Sans MS", Font.BOLD, 42));
		  ta.setBackground(Color.LIGHT_GRAY);
		  tf.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		  
		  //add���̱� = ���̾ƿ�= Frame����̶� �⺻���̾ƿ� BorderLayout
			pan.add(new Label(" �޼���:", Label.RIGHT)); 
			pan.add(tf); pan.add(jsend); pan.add(jExit);
		
		  this.add("Center", ta);
		  this.add("North", pan); //this.add("South", tf);
		
  		//1�ܰ�   �������縸��=ȭ��
  		this.setBackground(Color.PINK); 
  		this.setBounds(300, 300, 600, 350); 
  		this.setTitle("�ʰ��ܸ޸���");
  		this.setVisible(true); 
  		
  		//�������ܰ� �������̺�Ʈ �ڵ鷯 �������߰�
  		//this.addWindowListener(this); ù��° WindowListener ���
  		//MyExit me = new MyExit();
  		this.addWindowListener(new MyExit());
  		//this.addWindowListener(new WindowAdapter() {
			//	public void windowClosing(WindowEvent e) { System.exit(1);} 			
			//});
  		
  		tf.addActionListener(this);
  		btnExit.addActionListener(this);
  		btnSend.addActionListener(this);
  		jExit.addActionListener(this);
  		jsend.addActionListener(this);
  }//end
  
	public static void main(String[] args)  {
	  new Note( );
	}//end

	
	@Override
	public void actionPerformed(ActionEvent ae) { //��ưŬ��, �Է¶� �Է���enter�̺�Ʈ����
		if(ae.getSource()==tf) {  getMessage(); }
		else if(ae.getSource()==btnSend) { getMessage(); }
		else if(ae.getSource()==btnExit) { myExit();}
		else if(ae.getSource()==jExit) { getMessage(); }
		else if(ae.getSource()==jsend) { myExit();}
	}//actionPerformed end
	
	 public void getMessage( ) {//�츮������ non-static�޼ҵ�
			String msg=this.tf.getText();
			this.ta.append(">> "+msg+"\n"); //setText�޼ҵ� �����
			if(msg.equals("exit") || msg.equals("EXIT")) {
				this.myExit();
			}
			this.tf.setText("");  
	 }//end

	 public void myExit( ) {//�츮������ non-static�޼ҵ�
		 System.out.print("���α׷� �����մϴ� ");
		 System.exit(0); 
	 }
	
	  class MyExit extends WindowAdapter {
			public void windowClosing(WindowEvent e) { System.exit(1);} 			  	
	  }

	
}//Note class END================================










