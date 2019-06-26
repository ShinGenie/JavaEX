package net.itbank.Day0410;

import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	private BorderLayout bl = new BorderLayout();
	private BorderLayout bl1 = new BorderLayout();
	private BorderLayout bl2 = new BorderLayout();
	private Panel mainPl = new Panel();
	private Panel up_pl = new Panel();
	private Panel down_pl = new Panel();
	private GridLayout down_gl = new GridLayout(5,4,3,3);
	private Panel btpl = new Panel();
	private Label lb1 =  new Label("라벨1");
	private Label lb2 =  new Label("라벨2");
	private Panel lb_up_1 = new Panel();
	private TextField tf1 = new TextField(10);
	private TextField tf2 = new TextField(10);
//	private TextArea ta = new TextArea("",1, 47);

	
	
	private MenuBar mbr = new MenuBar();
	private Menu mu = new Menu("파일");
	private MenuItem mi1 = new MenuItem("새 게임");
	private MenuItem mi2 = new MenuItem("종료");
	
	private JButton[] bt = new JButton[9];
	private Button bt1 = new Button("1");
	private Button bt2 = new Button("2");
	private Button bt3 = new Button("3");
	private Button bt4 = new Button("4");
	private Button bt5 = new Button("5");
	private Button bt6 = new Button("6");
	private Button bt7 = new Button("7");
	private Button bt8 = new Button("8");
	private Button bt9 = new Button("9");
	private Button bt0 = new Button("0");
	private Button btgop = new Button("X");
	private Button btdivide = new Button("/");
	private Button btplus = new Button("+");
	private Button btminus = new Button("-");
	private Button btnamugi = new Button("%");
	private Button btdelete = new Button("←");
	private Button btcancel = new Button("C");
	private Button btpoint = new Button(".");
	private Button btequal = new Button("=");
	private Button btbt = new Button("???");
	
	Stack<String> Stack = new Stack<String>();
	
	
	
	public MyFrame() {
		this.setSize(400, 600);
		this.setTitle("계산기");
		tf2.setFont(new Font("Consolas", Font.BOLD, 20));
		tf1.setFont(new Font("Consolas", Font.PLAIN, 60));
//		ta.setBackground(Color.LIGHT_GRAY);
//		tf.setBackground(Color.PINK);
		mbr.add(mu);
		mu.add(mi1);
		mu.addSeparator();
		mu.add(mi2);
		setMenuBar(mbr);
	
		this.add(mainPl);
		mainPl.setLayout(bl);
		mainPl.add("North" ,up_pl);
//		up_pl.add(lb1);
		up_pl.add(lb_up_1);
		lb_up_1.setLayout(bl2);
		lb_up_1.add("North", tf2);
		lb_up_1.add("Center", tf1);
		mainPl.add("Center", down_pl);
//		down_pl.add(lb2);
		down_pl.setLayout(down_gl);
		down_pl.add(btbt);
		down_pl.add(btcancel);
		down_pl.add(btdelete);
		down_pl.add(btnamugi);
		down_pl.add(bt1);
		down_pl.add(bt2);
		down_pl.add(bt3);
		down_pl.add(btdivide);
		down_pl.add(bt4);
		down_pl.add(bt5);
		down_pl.add(bt6);
		down_pl.add(btgop);
		down_pl.add(bt7);
		down_pl.add(bt8);
		down_pl.add(bt9);
		down_pl.add(btminus);
		down_pl.add(btequal);
		down_pl.add(bt0);
		down_pl.add(btpoint);
		down_pl.add(btplus);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		bt7.addActionListener(this);
		bt8.addActionListener(this);
		bt9.addActionListener(this);
		bt0.addActionListener(this);
		btgop.addActionListener(this);
		btminus.addActionListener(this);
		btplus.addActionListener(this);
		btdivide.addActionListener(this);
		btnamugi.addActionListener(this);
		btpoint.addActionListener(this);
		btequal.addActionListener(this);
		btdelete.addActionListener(this);
		btcancel.addActionListener(this);
		btbt.addActionListener(this);
		btbt.addActionListener(this);
		tf1.addActionListener(this);
//		tf2.addActionListener(this);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - this.getHeight()/2);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setLocation(x, y);
		this.setResizable(true);
		this.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==bt0) {tf2.setText("0"); getMessage();}
		if (e.getSource()==bt1) {tf2.setText("1"); getMessage();}
		if (e.getSource()==bt2) {tf2.setText("2"); getMessage();}
		if (e.getSource()==bt3) {tf2.setText("3"); getMessage();}
		if (e.getSource()==bt4) {tf2.setText("4"); getMessage();}
		if (e.getSource()==bt5) {tf2.setText("5"); getMessage();}
		if (e.getSource()==bt6) {tf2.setText("6"); getMessage();}
		if (e.getSource()==bt7) {tf2.setText("7"); getMessage();}
		if (e.getSource()==bt8) {tf2.setText("8"); getMessage();}
		if (e.getSource()==bt9) {tf2.setText("9"); getMessage();}
		if (e.getSource()==btgop) {
			tf2.setText(" X ");
			Stack.push("*");
			
		}
			
		
	}

	public void yunsan(ActionEvent ae) {
		
		if(ae.getSource() == btplus) {
			
		}else if(ae.getSource() == btminus) {
			
		}else if(ae.getSource() == btgop) {
			
		}else if(ae.getSource() == btdivide) {
			
		}else if(ae.getSource() == btnamugi) {
			
		}
		
		
	}
	
	
	
	public void getMessage() {
		String msg = tf2.getText();
		Stack.push(msg);
		this.tf1.setText(msg + " ");
//		tf1.setText("");
		
	}
	
	
	
}



public class Calculater {

	public static void main(String[] args) {

		MyFrame bf = new MyFrame();
			
	}

}
