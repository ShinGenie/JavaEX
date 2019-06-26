package net.itbank.day18.handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

import net.itbank.day18.ClientUI;


public class BtsActionHandler implements ActionListener {
	ClientUI ui;
	public BtsActionHandler(ClientUI clientUI) {
		this.ui = clientUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JToggleButton src =(JToggleButton)e.getSource();
		String txt = src.getText();
		if(src.isSelected()) {
			String rst = ui.net.sendAndReceive("reserve#"+txt);
			String c = ui.taLog.getText();
			if(rst.equals("true")) {
				c += "\n[SYSTEM] " + txt+ " ���� ����"; 
			}else {
				c += "\n[SYSTEM] " + txt+ " ���� ���� (�̹� ����� �¼��̴�.)";
				src.setSelected(false);
			}
			ui.taLog.setText(c);
		} else {
			String rst = ui.net.sendAndReceive("cancel#"+txt);
			String c = ui.taLog.getText();
			if(rst.equals("true")) {
				c += "\n[SYSTEM] " + txt+ " ������� ����"; 
			}else {
				c += "\n[SYSTEM] " + txt+ " ������� ���� (�̹� ��ҵ� �¼��̴�.)";
			}
			ui.taLog.setText(c);
		}
	}//end
}//class END

/*
 * ��� ��ư�� �� �ϳ��� �׼�Handler�� ó���ϴ� ��Ȳ��
 * �׷� �� �׼��� � ��ư�� ���ؼ� �۵��ϴ°����� �˾ƾ� ��.
 * 
 * Object obj= e.getSource();	// �̺�Ʈ�� �߻���Ų ��ü�� ����.
 * ���� JToggleButton�鸸 ���� �ڵ鷯�� ó���ϱ� ������, JToggleButton ��ü��
 * Casting�� �ؼ� ó�� why? 100���� �±� ������
 * 	JToggleButton src = (JToggleButton)obj;
 *  
 * Ȥ�� index�� ������
 * 	int idx = ui.bts.indexOf(obj);
 *  JToggleButton sr = ui.bts.get(idx);
 * 
 * ��������   src == sr ���� true��.
 * 
 * src.getText()  : �۾� ��������
 * src.isSelected() : ���õ� ��Ȳ���� �ƴ���
 * 
 * 
 * src.setSelected(false);	���� ���� Ǯ��
 * src.setSelected(false);	���� ���� ��Ű��
 * 
 */
