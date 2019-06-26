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
		Integer age = new Integer(27); // 숫자데이터 : 백터안에 넣을때는 반드시 객체화 시켜야함. 표준타입으로  new 객체생성 x
		int[] su = new int[27]; // 4바이트*27개 배열
		Boolean gen = new Boolean(false); // 
		Double point = new Double(3.89); // 더블형 클래스 : 대문자 
		double[] avg = new double[5]; // 표준타입 더블 배열
		
		Vector<String> vt= new Vector(); // 타입을 정해주는 것을 제너릭 이라고 한다 "<>"
		vt.add("blue"); 
		vt.add("27"); 
		vt.add("여");  
		vt.add("3.18");
		vt.add("노래불러봐");
		// 추가add, addElement(Object), get(int), elementAt(int)<- object형으로  
		
//		for(int i=0;i<vt.size();i++) { System.out.print(vt.get(i)+" ");}
		Iterator it = vt.iterator();
		while(it.hasNext()==true) {System.out.print(it.next()+" ");}
//		Element
//		while(it.hasMoreElement()==true) {System.out.print(et.nextElement());}
		System.out.println();
		Enumeration<String> et = vt.elements(); // enumeration 열거라는 뜻
		System.out.println();
		System.out.println("용량: "+vt.capacity());
		System.out.println("크기: "+vt.size());
		
		
	}//main end

}//class end
