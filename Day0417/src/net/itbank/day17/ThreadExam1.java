package net.itbank.day17;

import java.io.IOException;

public class ThreadExam1  extends Thread {
	String str;
	ThreadExam1 (String str){
		this.str=str;
	}//const end

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(str);
			try {Thread.sleep(3000);
			}catch(InterruptedException e) {e.printStackTrace();}
		}
	}//method end
	
	public static void main(String[] args) {
		ThreadExam1 te = new ThreadExam1("*"); 
		ThreadExam1 te1 = new ThreadExam1("¡Ú");
		te.start();
		te1.start();
		System.out.print("!!!!!");
	}
}//class end

