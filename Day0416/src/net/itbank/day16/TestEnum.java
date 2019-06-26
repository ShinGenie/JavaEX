package net.itbank.day16;

import java.util.Calendar;

enum Lession{JAVA,XML,SPRING,MVC2,IPHONE}
enum Item {
	ADD(5),DEL(12),SEARCH(7),CANCLE(23);
	private final int var;
	Item(int v){ var=v;}
	public int getVar() {return var;}
}
public class TestEnum {//열거형 사용
	public static void main(String[] args) {
		Lession le=Lession.SPRING;
		Lession le1=Lession.JAVA;		
		System.out.println(le);
		System.out.println(Lession.JAVA);
		System.out.println(Lession.SPRING);
		Lession[] size = Lession.values();
		System.out.println("열거형 크기 : "+size.length);
		System.out.println();
		//마치 스태틱처럼 쓸수 있음. 자기가 자기정보 물고옴.
		
		Item[] it = Item.values();
		for(Item n:it) {
			System.out.println(n+" : "+n.getVar());
		}
		
		System.out.println("\n");
		Planet p= Planet.EARTH; 
		double area= p.getGravity();
//		planet p2=new Planet(542.98);// 열거형은 객체생성 불가능
//		Calendar cal= new Calendar();//추상클래스도 개체생성 안됨
//		BoardImp board = new BoardImp();//인터페이스도 객체생성안됨
	}//main end
}//class end
