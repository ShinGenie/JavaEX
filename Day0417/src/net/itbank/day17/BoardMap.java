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
		Map<Integer,String> mp = new HashMap<Integer,String>(); // ���ʸ� �ȿ��� class Ÿ������ ����� int -> Integer , double -> Double
		mp.put(1100,"��������");
		mp.put(1200,"��������");
		mp.put(1300,"ġ�����");
		mp.put(1400,"������");

//		Set st = mp.keySet();
//		Iterator<Integer> it =st.iterator(); // iterator �ݺ��̶�� ��

		//while(it.hasNext()==true) {
		//	Integer temp = it.next();
		//	System.out.println(temp+ ":"+mp.get(temp)); // temp �� Ű�� mp.get(temp)�� value��
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
