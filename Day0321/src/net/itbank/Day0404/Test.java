package net.itbank.Day0404;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Test implements Board, KeyListener {
	
	public static void main(String[]args) {
		System.out.println("Test class 10:42");
	}//main end

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insert(int jumin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean id() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key) {
		case KeyEvent.VK_ESCAPE:
			System.out.println("종료키 ESC 키 누름");
			break;
		case KeyEvent.VK_UP:
			System.out.println("UP방향키 누룸");
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}//class end
