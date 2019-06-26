package net.itbank.Day0412;

import java.awt.Button;

import java.awt.Component;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

class GridBagFrame2 extends Panel implements ActionListener 
{
	GridBagConstraints c;
	public GridBagFrame2()
	{
		GridBagLayout gridbag=new GridBagLayout();
		setLayout(gridbag);
		c=new GridBagConstraints();
		c.weightx=1.0;
		c.weighty=1.0;
		// ������ �й��ϴ� ����, ���0�̸� ����� ����.

		c.fill=GridBagConstraints.BOTH; // ��ü�� ä����

		layout(new Button("1��°"),0,0,1,2);  // ��ư���� + ����
		layout(new Button("2��°"),1,1,1,1);
		layout(new Button("3��°"),2,1,1,1);
		layout(new Button("4��°"),3,1,3,1);
		layout(new Button("5��°"),0,2,1,2);
		layout(new Button("6��°"),1,2,1,1);
		layout(new Button("7��°"),1,3,1,1);
		layout(new Button("8��°"),2,2,1,1);
		layout(new Button("9��°"),2,3,1,1);
		layout(new Button("10��°"),3,2,3,2);
		// layout(new Button(),4,4,1,1);
		// layout(new Button(),5,4,1,1);
		
//		//��������
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void layout(Component obj, int x, int y,int width, int height)
	{
		c.gridx=x; // ������ġ x
		c.gridy=y; // ������ġ y
		c.gridwidth=width; // �����̳� �ʺ�
		c.gridheight=height;  // �����̳� ����
		add(obj,c);
	}
	public static void main(String[] args)
	{
		Frame test=new Frame();
		test.setSize(500,300);
		test.add(new GridBagFrame2());
		test.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}



























