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
		Integer age = new Integer(27); // 숫자데이터 : 백터안에 넣을때는 반드시 객체화 시켜야함. 표준타입으로  new 객체생성 x
		int[] su = new int[27]; // 4바이트*27개 배열
		Boolean gen = new Boolean(false); // 
		Double point = new Double(3.89); // 더블형 클래스 : 대문자 
		double[] avg = new double[5]; // 표준타입 더블 배열
		
		ArrayList<String> seats= new ArrayList(); // 타입을 정해주는 것을 제너릭 이라고 한다 "<>" // ArrayList는 중복허용
		seats.add("춤춰봐"); 
		seats.add("손들어봐"); 
		seats.add("춤춰봐");  
		seats.add("뛰어봐");
		seats.add("노래불러봐");
		// capacity 매쏘드 없음 element 메소드 없음 addElement도 없음
		
		for(int i=0;i<seats.size();i++) {
			System.out.print(seats.get(i)+"  ");   
		}// 출력은 .get으로 하기~~~~!  // 권장권장 !!
		
		System.out.println();
//		Enumeration<String> et = seats.elements(); // enumeration 열거라는 뜻
		System.out.println();
//		System.out.println("용량: "+seats.capacity());
		System.out.println("크기: "+seats.size());
		
		
	}//main end

}//class end
