package net.itbank.day17;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Board {
	
	public static void main(String[] args) {
		/////// java.util ///////
		Date dt;
		Calendar cal;
		GregorianCalendar gc;
		StringTokenizer token;
		Random rd;
		Scanner sc; 
		/////// java.util ///////
		
		int[] item = new int[5];
//		item[0]="kin"; //���δٸ� Ÿ��
		ArrayList list= new ArrayList();
		list.add("blue"); list.add(27); list.add("��"); list.add("����"); list.add(false);
		list.add("blue"); list.add(31); list.add("��"); list.add("�λ�"); list.add(false);
		System.out.println(list);
		
		Set st = new HashSet();
		st.add("blue"); st.add(27); st.add("��"); st.add("����"); st.add(false);
		st.add("blue"); st.add(31.5); st.add("��"); st.add("�λ�"); st.add(false);
		System.out.println(st);
		
		Map mp = new Hashtable();// Map �迭�� �߰��Ҷ� add ��� put
		mp.put(1100, "����Ŀ��");		
		mp.put(1200, "������Ű");		
		mp.put(1300, "��������");	 
		System.out.println(mp);
	}//main end

}//class end
