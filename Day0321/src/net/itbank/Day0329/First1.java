package net.itbank.Day0329;

import java.text.*;
import java.util.*;


public class First1 {

	public static void main(String[] args) {
//		java.util.Date dt = new java.util.Date();
//		java.util.Calendar cal = Java.util.Calendar.getInstance();
		Date dt = new Date();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd분 hh:mm:ss");
		System.out.println("날짜: " + dt);
		System.out.println("날짜: " + sdf.toString());
		System.out.println("날짜: " + dt.toLocaleString());
		String msg = sdf.format(dt);
		System.out.println("날짜: "+msg);
		System.out.println("***********************");
	}//main end

}//class end
