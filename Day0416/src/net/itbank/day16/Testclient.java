package net.itbank.day16;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.TextArea;

import javax.swing.JFrame;

public class Testclient extends JFrame {
	
	Button btnExit = new Button("�����ϱ�"); //new Ű����� �޸� �Ҵ���� ����=heap ����
	TextArea ta; // ����
	String msg; // ����
	int su; // ���� 
	// �ʵ�� �迭ó�� �����ص� �ʱⰪ�� �ִ�. "null"
	
	
	public Testclient() {
		int su = 3; // ��������  -> �ʱ�ȭ�������
		// ���������� ���������� �����ϸ� ���������� ���� �켱����
		ta = new TextArea();
		this.add("Center",btnExit);
		System.out.println("�������� su="+su);// ���������� �ݵ�� �ʱ�ȭ
		System.out.println("�������� su="+this.su);// �������� ������ this.�� �Ѵ�!!!!
		//���������� ������ this. ������� ���������� ����Ų��.
		
		//ȭ�� ����ũ��, �����ֱ�
		Container ct = new Container();
		ct.getParent();
		ct.setBackground(Color.green);
		this.setBounds(300,300,500,300);
		this.setVisible(true);
		
		//�̺�Ʈ �ڵ鷯 �߰� 
		
		//ȭ������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//�⺻������
	
	

	public static void main(String[] args) {
		new Testclient(); 

	}//main end		

}//class end
