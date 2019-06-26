package net.itbank.Day0403;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Jumin {
	/**
	 * 주민번호 masking
	 * @param ssn
	 * @param hashDash
	 * @return
	 * @throws RuntimeException
	 * 
	 * https://wikidocs.net/276
	 */
	public static String getSsnMasked(String ssn, boolean hashDash)throws RuntimeException{

		StringBuffer rtnStr = new StringBuffer();

		if(ssn != null && ssn.length()==7){
			rtnStr.append(ssn.subSequence(0, 1)).append("******");
		}else if(ssn != null && ssn.length()==13){
			rtnStr.append(ssn.subSequence(0,6));
			if(hashDash){
				rtnStr.append("-");
			}
			rtnStr.append(ssn.subSequence(6,7)).append("*******");
		}else if(ssn != null && ssn.length() == 14){
			rtnStr.append(ssn.subSequence(0,8)).append("*******");
			}

		return rtnStr.toString();

	}//end


public static void main(String[]args){
	Jumin jn=new Jumin();
//	getSsnMasked("",true);

	int nYear;
	int nMonth;
	int nDay;

	Calendar cal = new GregorianCalendar();
	nYear = cal.get(Calendar.YEAR);
	nMonth = cal.get(Calendar.MONTH)+1;
	nDay = cal.get(Calendar.DATE);

	//뒷자리 마스킹
	String jumin="900224-3648711";
	String jumin0=jumin.substring(7, 14);
	String jumin1=jumin.replaceAll(jumin0, "*******");
	System.out.println("jumin masked: "+ jumin1);

	//나이
	int recent=nYear;
	int past= 1900+Integer.parseInt(jumin.substring(0,2));
	System.out.println("나이는 " +(recent-past));

	//성별
	System.out.print("성별은 ");
	if(jumin.charAt(7)==1){
		System.out.println("남자");
	}else if(jumin.charAt(7)==3){
		System.out.println("남자");
	}else{System.out.println("여자");}

	//생년월일
	String birthY=19+jumin.substring(0, 2);
	String birthM=jumin.substring(2, 4);
	String birthD=jumin.substring(4, 6);
	System.out.println("생일은 "+ birthY + "년 " + birthM +"월 "+birthD+"일");
}

}//class end
