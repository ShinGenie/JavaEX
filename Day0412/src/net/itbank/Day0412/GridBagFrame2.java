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
		// 여백을 분배하는 변수, 모두0이면 가운데로 모임.

		c.fill=GridBagConstraints.BOTH; // 전체를 채워라

		layout(new Button("1번째"),0,0,1,2);  // 버튼생성 + 부착
		layout(new Button("2번째"),1,1,1,1);
		layout(new Button("3번째"),2,1,1,1);
		layout(new Button("4번째"),3,1,3,1);
		layout(new Button("5번째"),0,2,1,2);
		layout(new Button("6번째"),1,2,1,1);
		layout(new Button("7번째"),1,3,1,1);
		layout(new Button("8번째"),2,2,1,1);
		layout(new Button("9번째"),2,3,1,1);
		layout(new Button("10번째"),3,2,3,2);
		// layout(new Button(),4,4,1,1);
		// layout(new Button(),5,4,1,1);
		
//		//윈도종료
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void layout(Component obj, int x, int y,int width, int height)
	{
		c.gridx=x; // 시작위치 x
		c.gridy=y; // 시작위치 y
		c.gridwidth=width; // 컨테이너 너비
		c.gridheight=height;  // 컨테이너 높이
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




























