package net.itbank.Day0409;

import java.awt.Button;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex{
	public static void main (String[] args) {
		
		Calendar cal = Calendar.getInstance();// ���ϰ��� Ȯ���ϼ���
		
		String data = "27�� ����� �����մϴ�"
				+"����ȭ��ȣ 02-9090-1234�̸�"
	            +"�繫�ǹ�ȣ 02-7065-6543�̸�"
				+"�ڵ��� ��ȣ 010-6548-5436�Դϴ�";
		// �����ڵ���\\d{2,3}-\\d{3,4}-\\d{4}
			
		String format = "\\d{2,3}-\\d{3,4}-\\d{4}"; // �������� �ΰ��� �ϳ��� ������ ǥ��, �ΰ��� ����
		Pattern pt = Pattern.compile(format);
		Matcher mt = pt.matcher(data);
		int count=0;
		while(mt.find()==true) {
			count++;
			System.out.println("��ȭ��ȣ: "+ mt.group());
		}
		System.out.println("�߰ߵ� ��ȭ��ȣ ��: "+ count);
		
	}//main end
	


}//class end
