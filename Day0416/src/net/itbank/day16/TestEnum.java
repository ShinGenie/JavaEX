package net.itbank.day16;

import java.util.Calendar;

enum Lession{JAVA,XML,SPRING,MVC2,IPHONE}
enum Item {
	ADD(5),DEL(12),SEARCH(7),CANCLE(23);
	private final int var;
	Item(int v){ var=v;}
	public int getVar() {return var;}
}
public class TestEnum {//������ ���
	public static void main(String[] args) {
		Lession le=Lession.SPRING;
		Lession le1=Lession.JAVA;		
		System.out.println(le);
		System.out.println(Lession.JAVA);
		System.out.println(Lession.SPRING);
		Lession[] size = Lession.values();
		System.out.println("������ ũ�� : "+size.length);
		System.out.println();
		//��ġ ����ƽó�� ���� ����. �ڱⰡ �ڱ����� �����.
		
		Item[] it = Item.values();
		for(Item n:it) {
			System.out.println(n+" : "+n.getVar());
		}
		
		System.out.println("\n");
		Planet p= Planet.EARTH; 
		double area= p.getGravity();
//		planet p2=new Planet(542.98);// �������� ��ü���� �Ұ���
//		Calendar cal= new Calendar();//�߻�Ŭ������ ��ü���� �ȵ�
//		BoardImp board = new BoardImp();//�������̽��� ��ü�����ȵ�
	}//main end
}//class end
