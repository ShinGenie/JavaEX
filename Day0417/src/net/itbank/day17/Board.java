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
//		item[0]="kin"; //서로다른 타입
		ArrayList list= new ArrayList();
		list.add("blue"); list.add(27); list.add("여"); list.add("서울"); list.add(false);
		list.add("blue"); list.add(31); list.add("남"); list.add("부산"); list.add(false);
		System.out.println(list);
		
		Set st = new HashSet();
		st.add("blue"); st.add(27); st.add("여"); st.add("서울"); st.add(false);
		st.add("blue"); st.add(31.5); st.add("남"); st.add("부산"); st.add(false);
		System.out.println(st);
		
		Map mp = new Hashtable();// Map 계열은 추가할때 add 대신 put
		mp.put(1100, "수제커피");		
		mp.put(1200, "수제쿠키");		
		mp.put(1300, "수제케익");	 
		System.out.println(mp);
	}//main end

}//class end
