package net.itbank.day17;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class BoardMap {

	public static void main(String[] args) {
		Map<Integer,String> mp = new HashMap<Integer,String>(); // 제너릭 안에는 class 타입으로 줘야함 int -> Integer , double -> Double
		mp.put(1100,"수제버거");
		mp.put(1200,"생선버거");
		mp.put(1300,"치즈버거");
		mp.put(1400,"고기버거");

//		Set st = mp.keySet();
//		Iterator<Integer> it =st.iterator(); // iterator 반복이라는 뜻

		//while(it.hasNext()==true) {
		//	Integer temp = it.next();
		//	System.out.println(temp+ ":"+mp.get(temp)); // temp 가 키값 mp.get(temp)가 value값
		//}


//		Set st = mp.keySet();
		Iterator<Integer> it = mp.keySet().iterator();
		while(it.hasNext()==true) {
			Integer temp = it.next();
			System.out.println(temp);
			System.out.println(temp+mp.get(temp));
		}
	
	}//main end

}//class end
