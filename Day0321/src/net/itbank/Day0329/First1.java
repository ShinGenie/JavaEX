package net.itbank.Day0329;

import java.text.*;
import java.util.*;


public class First1 {

	public static void main(String[] args) {
//		java.util.Date dt = new java.util.Date();
//		java.util.Calendar cal = Java.util.Calendar.getInstance();
		Date dt = new Date();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
		System.out.println("��¥: " + dt);
		System.out.println("��¥: " + sdf.toString());
		System.out.println("��¥: " + dt.toLocaleString());
		String msg = sdf.format(dt);
		System.out.println("��¥: "+msg);
		System.out.println("***********************");
	}//main end

}//class end
