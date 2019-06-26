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
		
		Set<String> seats= new HashSet(); // 타입을 정해주는 것을 제너릭 이라고 한다 "<>" // ArrayList는 중복허용
		seats.add("춤춰봐"); 
		seats.add("32"); 
		seats.add("23.5");  
		seats.add("true");
		seats.add("춤춰봐");
		// capacity 매쏘드 없음 element 메소드 없음 addElement도 없음
		
//		for(int i=0;i<seats.size();i++) {
//			System.out.println(seats.get(i)+"  "); // get을 쓸수 없음
//		}
		
		//Iterator로 접근
		Iterator it = seats.iterator();
		while(it.hasNext()==true) {System.out.print(it.next()+" ");}
		
	
	
		//for / iterator enumeration
		

		
		
	}//main end

}//class end
