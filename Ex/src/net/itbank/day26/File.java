package net.itbank.day26;

import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.swing.JFrame;

public class File extends JFrame implements ActionListener  {
	TextArea ta_out = new TextArea(25,1);
	TextField tf_name = new TextField(10);
	OutputStream out;

	public void fileSave() {
		FileDialog fd = new FileDialog(this, "대화내용저장", FileDialog.SAVE);
		String fi=fd.getFile();
		String dir=fd.getDirectory();
		
		java.io.File f = new java.io.File(fi+dir);
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.println(ta_out.getText());
			pw.close();
			ta_out.append("대화내용저장되었습니다");
		} catch (FileNotFoundException e) {e.printStackTrace();}
	}// fileSave
		
	public void fileOpen() {
		FileDialog fd = new FileDialog(this, "파일열기", FileDialog.LOAD);
		String dir=fd.getDirectory();
		String f=fd.getFile();
		try {
			FileReader fr = new FileReader(dir+f);
			BufferedReader br = new BufferedReader(fr);
			try {
				while(true) {
					String data="";
					if(data==null)break;
					data=br.readLine();
					out.write(data.getBytes());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {e.printStackTrace();}
		
	}//fileOpen end
		
	public void connect() {	}

	public void actionPerformed(ActionEvent e) {
		
	}//action end
	
	public static void main(String[] args) {
		
	}//main end

	
}// class end
