package net.itbank.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getTime {
	public static String getTimes(){
		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
		return sdf.format(new Date());
	}
}
