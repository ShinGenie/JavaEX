package net.itbank.day18;

import javax.swing.JFrame;

public class TestPlay extends JFrame implements Runnable{

	public void run(){
		int su=0;
		while(true) {
			su++;
			System.out.print("숫자: "+su+"\t");
			if(su%5==0) System.out.println();
			try {Thread.sleep(300);}catch(Exception e) {   }
		}//while end 
	}//run end

	public static void main(String[] args) {
		
		TestPlay tp=new TestPlay();
		Thread tr = new Thread(tp);
		tr.start();
		
		System.out.println("이름:홍길동");
		System.out.println("국어:90");
		System.out.println("영어:85\n");

		int dan=7;
		for(int i=1;i<5;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			try {Thread.sleep(300);}catch(Exception e) {   }
		}//for end
		
		
	}//main end


}//TestPlay class END





