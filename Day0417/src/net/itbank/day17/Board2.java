package net.itbank.day17;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

public class Board2 {
	
	public static void main(String[] args) {

		Vector vt= new Vector();
		String nic = new String("blue");
		Integer age = new Integer(27); // ���ڵ����� : ���;ȿ� �������� �ݵ�� ��üȭ ���Ѿ���. ǥ��Ÿ������  new ��ü���� x
		int[] su = new int[27]; // 4����Ʈ*27�� �迭
		Boolean gen = new Boolean(false); // 
		Double point = new Double(3.89); // ������ Ŭ���� : �빮�� 
		double[] avg = new double[5]; // ǥ��Ÿ�� ���� �迭
		
		vt.add(new String("blue")); 
		vt.add(new Integer(27)); 
		vt.add(gen);  
		vt.add(point);
		vt.addElement(new Integer(27)); // �̷��� �ᵵ ����
		
		// �߰�add, addElement(Object), get(int), elementAt(int)<- object������  
		
		for(int i=0;i<vt.size();i++) { // length ���� ������ -> �÷��� ũ��� size()
			System.out.print(vt.get(i)+" ");
		}
		
		System.out.println();		
		System.out.println(vt);	
		System.out.println(vt.toString());
		
	}//main end

}//class end
