package net.itbank.Common;
import java.util.*;

public class Ai { // �ܵ�����ȵ�

	String msg =""; // ��������, �ʵ� field
	int price=20000;
	int year=2001;
	String name="���İ�";
	

	public Ai() {};
	public Ai(String name) {};
	public Ai(int year) {};
	public Ai(String nic, int y) {};
	
	
		
	public void google() {
			System.out.println("���۸޼ҵ�");
			System.out.println("�����н����");
		}//end
	
	protected void cooking() {
		System.out.println("��ŷ�޼ҵ�");
		System.out.println("������,����,Ƣ��");
	}//end

}//class ends
