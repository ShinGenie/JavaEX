package net.itbank.Day0329;

import java.text.*;
import java.util.*;


public class TestCalendar {

	public static void main(String[] args) {
//		java.util.Date dt = new java.util.Date();
//		java.util.Calendar cal = Java.util.Calendar.getInstance();
		Date dt = new Date();
		Calendar calA = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
		
		int nowyear = cal.get(Calendar.YEAR);	
		int nowm = cal.get(Calendar.MONTH);
		int nowd = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println();
		System.out.println(nowyear+"�� "+(nowm+1)+"�� "+nowd+"��");
		System.out.println(nowyear+"-"+(nowm+1)+"-"+nowd);
		
		/*calendar Ŭ������ �߻�Ŭ�����Դϴ�. void add(int, int)
		�߻�Ŭ������ �߻�żҵ尡 �ִ�.
		�߻�żҵ�� �żҵ带 ���� public void cooking() {}
		Į���� Ŭ�������� ��,��,��,��,��, �� ��� �����ö� ���ϰ� get(����)
		Į���� Ŭ������ MONTH �ʵ�� 0���� �����̶� +1�ϰ� ȭ�����*/
		
	}//main end

}//class end
