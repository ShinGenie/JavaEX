package net.itbank.day18;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;

import net.itbank.day18.handler.BtRefreshActionHandler;
import net.itbank.day18.handler.BtsActionHandler;

public class ClientUI extends JFrame {
	public JTextArea taLog;
	public List<JToggleButton> bts;
	public JButton btRefresh;
	
	public ClientNetworker net;
	
	public ClientUI(String ip) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		net = new ClientNetworker(ip);
		setComponents();
		addListeners();
	}//end
	
	public void addListeners() {
		for(JToggleButton b : bts) {
			b.addActionListener(new BtsActionHandler(this));
		}
		btRefresh.addActionListener(new BtRefreshActionHandler(this));
	}//emnd

	public void setComponents() {
		setTitle("RESERVE");
		setResizable(false);
		setSize(500, 360);
		
		setLocation(1440/2-500/2, 900/2-360/2);
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 231, 470, 90);
		getContentPane().add(scrollPane);

		taLog = new JTextArea();
		taLog.setFont(new Font("��������ڵ�", Font.PLAIN, 12));
		taLog.setEditable(false);
		taLog.setText("[SYSTEM] �¼����� ���� ����..");
		scrollPane.setViewportView(taLog);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("��������ڵ�", Font.PLAIN, 12));
		tabbedPane.setBounds(12, 10, 470, 178);
		getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("RESERVE", null, panel, null);
		panel.setLayout(new GridLayout(4, 8, 5, 5));
		
		btRefresh = new JButton("REFRESH");
		btRefresh.setFont(new Font("��������ڵ�", Font.PLAIN, 12));
		btRefresh.setBounds(191, 198, 97, 23);
		getContentPane().add(btRefresh);
		bts = new ArrayList<>();
		for(int r=1; r<=4; r++) {
			for(char c='A'; c<='H'; c++) {
				String s =  r +"-"+c;
				// System.out.println(s);
				JToggleButton bt = new JToggleButton(s);
				bt.setFont(new Font("��������ڵ�", Font.PLAIN, 11));
				panel.add(bt);
				bts.add(bt);
			}
		}
	}//end
	
}//class END
