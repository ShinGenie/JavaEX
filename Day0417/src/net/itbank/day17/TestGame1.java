package net.itbank.day17;

import java.io.IOException;
import javax.swing.JFrame;

public class TestGame1  extends JFrame implements Runnable {

	public static void main(String[] args) {
		TestGame1 tg1 = new TestGame1();
		tg1.run();
		Thread tr = new Thread(tg1);
		tr.start();
	}//main end

	public void run() {
		while(true) {//���ѷ���ó��
		}
	}


}//class end

