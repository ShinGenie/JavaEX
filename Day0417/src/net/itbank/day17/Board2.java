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
		Integer age = new Integer(27); // 숫자데이터 : 백터안에 넣을때는 반드시 객체화 시켜야함. 표준타입으로  new 객체생성 x
		int[] su = new int[27]; // 4바이트*27개 배열
		Boolean gen = new Boolean(false); // 
		Double point = new Double(3.89); // 더블형 클래스 : 대문자 
		double[] avg = new double[5]; // 표준타입 더블 배열
		
		vt.add(new String("blue")); 
		vt.add(new Integer(27)); 
		vt.add(gen);  
		vt.add(point);
		vt.addElement(new Integer(27)); // 이렇게 써도 무방
		
		// 추가add, addElement(Object), get(int), elementAt(int)<- object형으로  
		
		for(int i=0;i<vt.size();i++) { // length 말고 싸이즈 -> 컬랙션 크기는 size()
			System.out.print(vt.get(i)+" ");
		}
		
		System.out.println();		
		System.out.println(vt);	
		System.out.println(vt.toString());
		
	}//main end

}//class end
