package net.itbank.Day0409;

import java.awt.Button;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestPWSplit{
	public static void main (String[] args) {
		
		String data = "2019//04//09//ȭ����////ȫ�浿";
		String [] ret = data.split("/"); //����. �׷��� StringTokenizer ���� ���
		for(int i=0; i<ret.length;i++) {
			System.out.print(ret[i]+" ");	
		}
		
		System.out.println();
		StringTokenizer st = new StringTokenizer(data,"/");
		while(st.hasMoreElements()==true) {
			System.out.print(st.nextToken()+" ");
		}
		
		
		System.out.println();
		String jumin="811020-2002313";
		if(jumin.matches("[0-9]+")==false) {
			System.out.println("�ֹι�ȣ�� Ư�����ڰ� �ֽ��ϴ�");
		}else {System.out.println("�ֹι�ȣ ������ �½��ϴ�");}
		
		// ���Խ� �̸� �����սô�. java.util.regex~~~
		
	}//main end
	


}//class end
