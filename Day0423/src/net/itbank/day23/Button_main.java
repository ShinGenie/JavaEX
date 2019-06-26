package net.itbank.day23;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Button_main extends JFrame {
	
	private JPanel jp_left;
	private JPanel jp_right;
	private JPanel jp_rBtn;
	private JPanel jp_bottom;
	private JPanel jp_txt;
	private JPanel jp_btn;
	private JLabel jl_txt;
	private JLabel jl_img;
	ImageIcon image;
	JButton jbt_btn;

	

	public Button_main() {
		
		jp_left = new JPanel();
		jp_left.setBounds(0,0,220,620);
		jp_left.setBackground(Color.black);
		
		
		jp_right = new JPanel(new BorderLayout());
		jp_right.setBounds(220,0,500,620);
		jp_right.setBackground(new Color(255, 233, 239));

		image = new ImageIcon("images/main1.jpg");
		jl_img = new JLabel(image);
		jl_img.setHorizontalAlignment(JLabel.CENTER);
		
		jp_bottom = new JPanel(new GridLayout(2,1));
		
		jp_txt = new JPanel();
		jl_txt = new JLabel("건전한 데이트를 지향합니다");
		jl_txt.setFont(new Font("굴림체",Font.PLAIN,30));
		jp_txt.add(jl_txt);
		
		jp_btn = new JPanel();
		jbt_btn = new JButton("입장하기");
		jp_btn.add(jbt_btn);
		
		jp_bottom.add(jp_txt);	jp_bottom.add(jp_btn);
		
		
		jp_right.add("Center",jl_img);
		jp_right.add("South",jp_bottom);
		

		
		// 화면중앙
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		this.setLocation(xpos, ypos);
		
		// 화면설정
		this.setSize(720, 620);
//		this.setBackground(Color.yellow);
		this.setResizable(false);
		this.setVisible(true);
		this.add(jp_left);
		this.add("East",jp_right);
	

		
		// 화면종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		 Button_main bt_m = new Button_main();
	}

}
