package net.itbank.Day0405;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class First extends Frame {

	public First() {
		
		Panel pan=new Panel();
		Button b1=new Button("�űԵ��");
		Button b2=new Button("��ü���");
		Button b3=new Button("�̸��˻�");
		Button b4=new Button("����");
		Button b5=new Button("����");
		Button b6=new Button("����¡����");
		Button b7=new Button("����˻�");
		Button b8=new Button("���װ˻�");
		Button b9=new Button("�̸��˻�");
		Button b10=new Button("����˻�");
		Button b11=new Button("���ǰ˻�");
		Button b12=new Button("���α׷� ����");
		pan.add(b1); pan.add(b2); pan.add(b3);
		pan.add(b4); pan.add(b5); pan.add(b6);
		pan.add(b7); pan.add(b8); pan.add(b9);
		pan.add(b10); pan.add(b11); pan.add(b12);
		
		this.add(pan);
		this.setBackground(Color.ORANGE);
		this.setBounds(300, 300, 500, 250);
		this.setSize(300, 200);
		this.setVisible(true);
		
		// �⺻��ġ(x,y),ũ��(����,����)�ʼ�, setVisible(true) <- �̰ž����� ��¸���
	}
	
	
	public static void main(String[] args) {
		new First();
	}//main end
}//class end
