package net.itbank.day17;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

public class Board3 {
	
	public static void main(String[] args) {

		String nic = new String("blue");
		Integer age = new Integer(27); // ���ڵ����� : ���;ȿ� �������� �ݵ�� ��üȭ ���Ѿ���. ǥ��Ÿ������  new ��ü���� x
		int[] su = new int[27]; // 4����Ʈ*27�� �迭
		Boolean gen = new Boolean(false); // 
		Double point = new Double(3.89); // ������ Ŭ���� : �빮�� 
		double[] avg = new double[5]; // ǥ��Ÿ�� ���� �迭
		
		Vector<String> vt= new Vector(); // Ÿ���� �����ִ� ���� ���ʸ� �̶�� �Ѵ� "<>"
		vt.add("blue"); 
		vt.add("27"); 
		vt.add("��");  
		vt.add("3.18");
		vt.add("�뷡�ҷ���");
		// �߰�add, addElement(Object), get(int), elementAt(int)<- object������  
		
//		for(int i=0;i<vt.size();i++) { System.out.print(vt.get(i)+" ");}
		Iterator it = vt.iterator();
		while(it.hasNext()==true) {System.out.print(it.next()+" ");}
//		Element
//		while(it.hasMoreElement()==true) {System.out.print(et.nextElement());}
		System.out.println();
		Enumeration<String> et = vt.elements(); // enumeration ���Ŷ�� ��
		System.out.println();
		System.out.println("�뷮: "+vt.capacity());
		System.out.println("ũ��: "+vt.size());
		
		
	}//main end

}//class end
