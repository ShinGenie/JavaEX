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

public class BoardSet {
	
	public static void main(String[] args) {
		
		Set<String> seats= new HashSet(); // Ÿ���� �����ִ� ���� ���ʸ� �̶�� �Ѵ� "<>" // ArrayList�� �ߺ����
		seats.add("�����"); 
		seats.add("32"); 
		seats.add("23.5");  
		seats.add("true");
		seats.add("�����");
		// capacity �Ž�� ���� element �޼ҵ� ���� addElement�� ����
		
//		for(int i=0;i<seats.size();i++) {
//			System.out.println(seats.get(i)+"  "); // get�� ���� ����
//		}
		
		//Iterator�� ����
		Iterator it = seats.iterator();
		while(it.hasNext()==true) {System.out.print(it.next()+" ");}
		
	
	
		//for / iterator enumeration
		

		
		
	}//main end

}//class end
