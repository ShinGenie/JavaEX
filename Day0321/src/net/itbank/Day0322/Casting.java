package net.itbank.Day0322;

public class Casting {
	public static void main(String[] args) {
		double avg=78.5; // double 8Byte= �ڳ���
		String data="1200";
		int a=(int)avg; 
		int	b=Integer.parseInt(data);// int 4Byte = �����
		System.out.println(data+98);
		System.out.println(b+98);
		
	}//main end
}//class 
