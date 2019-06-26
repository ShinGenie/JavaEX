package net.itbank.day17;

import java.io.IOException;

public class ThreadExam2 implements Runnable {
	String str;
	ThreadExam2 (String str){
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
		ThreadExam2 te = new ThreadExam2("*"); 
		ThreadExam2 te1 = new ThreadExam2("¡Ú");
		
		Thread tr = new Thread(te);
		Thread tr1 = new Thread(te1);
		
		tr.start();
		tr1.start();
		
		System.out.print("!!!!!");
	}
}//class end

