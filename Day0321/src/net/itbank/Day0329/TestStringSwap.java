package net.itbank.Day0329;
import java.util.*;

public class TestStringSwap {


	public static void main(String[] args) {
		String src="";
		String ret="";
		char ch='a';
		
		System.out.println("input: ");
		ch=new Scanner(System.in).nextLine().charAt(0); // ������ �ѱ��ڸ� �Է�
		//b �Է� B���, T�Է� t���
//		ret=Character.toString(ch);
//		System.out.println(ret.toUpperCase());
//		
//		ch.toUpperCase();
		if(ch>=65 && ch<=90) {
			src+=ch;
		} System.out.println(src.toLowerCase());
		if(ch>=97 && ch<=122) {// �ƽ�Ű�ڵ�� ��ȯ
			src+=ch; // ���Կ����ڷ� char ���� String ������ ��ȯ: �ļ�����
		} System.out.println(src.toUpperCase());
	}//main end


}//class end
