package net.itbank.Day0329;

import java.text.*;
import java.util.*;


public class TestJumin {


	public static void main(String[] args) {
//		java.util.Date dt=new java.util.Date();
//		java.util.Calendar cal=Java.util.Calendar.getInstance();
		Date dt=new Date();
		Calendar calA=Calendar.getInstance();
		Calendar cal=new GregorianCalendar();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
	
		
		/*Calendar.Year�ʵ�, cal.get(calendar.year)
		 *static���� char���ϰ� charAt�Լ�
		 *static���� String���ϰ� substring�Լ�(int������ġ, int��+1)*/
		
//		String name="����";
//		String jumin="871230-3892578";
//		//2019-(1900+87)=����
//		//12�� 30�� �����Դϴ� substring(int,int)
//		//����� ������ �����Դϴ� charAt(int)
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("�̸�: ");
//		name=sc.nextLine();
//		System.out.print("�ֹι�ȣ: ");
//		jumin=sc.nextLine();
//		
//		
//		
//		//����
//
//		String age=(jumin.substring(0,2));
//		System.out.println("���̴� "+age+"��� �Դϴ�");
//		
//		//����
//		int gen=jumin.charAt(7);
//		if(gen==3) {
//			System.out.println("�����Դϴ�");
//		}else if(gen==4) {
//			System.out.println("�����Դϴ�");
//		}
//		
//		//����
		
		String name="����";
		String jumin="871230-3892578";
		String msg="";
		char gender='F';
		
		// ����
		gender=jumin.charAt(7);
		switch(gender) {
			case '1' :
			case '3' : msg="����"; break;
			case '2' :
			case '4' : msg="����"; break;
		}
		System.out.println("������"+gender+"�Դϴ�");
		
		//�̸�
		
		
		
		//����
		int nowyear=cal.get(Calendar.YEAR); // ���� ����
		int age=Integer.parseInt((jumin.substring(0,2)))+1900;
		int realage=nowyear-age;
		System.out.println("���̴� "+realage+" �Դϴ�");
		
		//����
		String birthM=jumin.substring(2,4);
		String birthD=jumin.substring(4,6);
		System.out.println(birthM+"�� "+birthD+"�� �����Դϴ�");
		
		//�ֹι�ȣ �����
//		int juminCope = -*******;
//		jumin.substring(beginIndex)
		/* String msg="";
		 * */
		
		
		
	}//main end
	

}//class end
