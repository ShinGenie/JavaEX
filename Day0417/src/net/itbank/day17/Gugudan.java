package net.itbank.day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream; // ��Ʈ��
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter; // ���ڴ����� ���

public class Gugudan  extends Thread {

	public static void main(String[] args) throws Exception {
		
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String path="C:\\dev\\gugudan.txt";
//		File file = new File(path);
//		PrintWriter pw=new PrintWriter(file); // 
//		PrintStream ps = System.out; // ����� �׳� ���� System.out.~~
//		ps.println("���Է�?");
//		int dan=Integer.parseInt(br.readLine()); // BufferedReader�� �ݵ�� readLine() ���
//		for(int i=1;i<10;i++) {
////			System.out.println(dan+"*"+i+"="+(dan*1));// ��������
//			pw.println(dan+"*"+i+"="+(dan*1));//������Ϸ� ���� �ڵ� ���ΰ���
////			pw.write(dan+"*"+i+"="+(dan*1)+" \n");//�����Ҷ� ���ΰ��� ����������ϴµ�,�׷��� �ȵ�
//		}
//		pw.close();// Ư�� ���� �� �б�ó���� close()�޼ҵ� �ʼ� 
//		System.out.println(path+"���Ϸ� ���强���ϼ̽��ϴ�");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String path = "C:\\dev\\gugudan.txt";
//		PrintWriter pw=new PrintWriter(file);
		////////////////////////��Ʈ�� �ܿ��////////////////////////////
		File file = new File(path);
		FileWriter fw=new FileWriter(file,true);//true �̾ ���� // ���ΰ���ȵ�
		PrintWriter pw1=new PrintWriter(fw);
		////////////////////////��Ʈ�� �ܿ��//////////////�� ���� �ڿ� �̾ ������������ //////////////
		////////////////////////������ ī�峻�� ����Ǵ� ��ó��//////////////////////////////
		System.out.println("���Է�?");
		int dan=Integer.parseInt(br.readLine());
		for(int i=0;i<10;i++) {
//			System.out.println(dan+"*"+i+"="+(dan*i));
//			pw.println(dan+"*"+i+"="+(dan*i)); //���Ϸ� ����
//			fw.write(dan+"*"+i+"="+(dan*i)); //���ΰ��� �ȵ�
			pw1.println(dan+"*"+i+"="+(dan*i));
		}
		pw1.close();
		System.out.println(path+"������ ����Ǿ����ϴ�");
	}
}//class end

