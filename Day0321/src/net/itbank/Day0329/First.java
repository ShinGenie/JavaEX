package net.itbank.Day0329;

import java.text.*;
import java.util.*;


public class First {

	public static void main(String[] args) {
//		java.util.Date dt = new java.util.Date();
//		java.util.Calendar cal = Java.util.Calendar.getInstance();
		Date dt = new Date();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm--dd hh:mm:ss");
		System.out.println("날짜: " + dt);
		System.out.println("날짜: " + dt.toString());
		System.out.println("날짜: " + dt.toLocaleString());
		System.out.println();
	}//main end

}//class end
