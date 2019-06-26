package net.itbank.Common;
import java.util.*;

public class Ai { // 단독실행안됨

	String msg =""; // 전역변수, 필드 field
	int price=20000;
	int year=2001;
	String name="알파고";
	

	public Ai() {};
	public Ai(String name) {};
	public Ai(int year) {};
	public Ai(String nic, int y) {};
	
	
		
	public void google() {
			System.out.println("구글메소드");
			System.out.println("구글학습모듈");
		}//end
	
	protected void cooking() {
		System.out.println("쿠킹메소드");
		System.out.println("떡볶이,순대,튀김");
	}//end

}//class ends
