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

public class Board4 {
	
	public static void main(String[] args) {

		String nic = new String("blue");
		Integer age = new Integer(27); // ���ڵ����� : ���;ȿ� �������� �ݵ�� ��üȭ ���Ѿ���. ǥ��Ÿ������  new ��ü���� x
		int[] su = new int[27]; // 4����Ʈ*27�� �迭
		Boolean gen = new Boolean(false); // 
		Double point = new Double(3.89); // ������ Ŭ���� : �빮�� 
		double[] avg = new double[5]; // ǥ��Ÿ�� ���� �迭
		
		ArrayList<String> seats= new ArrayList(); // Ÿ���� �����ִ� ���� ���ʸ� �̶�� �Ѵ� "<>" // ArrayList�� �ߺ����
		seats.add("�����"); 
		seats.add("�յ���"); 
		seats.add("�����");  
		seats.add("�پ��");
		seats.add("�뷡�ҷ���");
		// capacity �Ž�� ���� element �޼ҵ� ���� addElement�� ����
		
		for(int i=0;i<seats.size();i++) {
			System.out.print(seats.get(i)+"  ");   
		}// ����� .get���� �ϱ�~~~~!  // ������� !!
		
		System.out.println();
//		Enumeration<String> et = seats.elements(); // enumeration ���Ŷ�� ��
		System.out.println();
//		System.out.println("�뷮: "+seats.capacity());
		System.out.println("ũ��: "+seats.size());
		
		
	}//main end

}//class end
