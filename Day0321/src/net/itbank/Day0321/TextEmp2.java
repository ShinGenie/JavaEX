package net.itbank.Day0321;
import java.util.Scanner;
public class TextEmp2 {

	public static void main(String[] args) {
		//Scanner stdiIn=null; // ���� new �����ڸ� ���������Ѵ�. nullPointerException
		
		int i=0;
		double d=0;
		String name="";
		Scanner stdiIn=new Scanner(System.in);
		System.out.print("�̸� �Է� ");   name=stdiIn.nextLine();
		System.out.print("���� �Է� ");   i=stdiIn.nextInt();
		System.out.print("������ �Է� ");  d=stdiIn.nextDouble();
		System.out.println();
		System.out.println(name+"�� ���̴�"+i+"�� �����Դ� "+d+"Kg�Դϴ�");
		
		
		
	} //main end
}//class end
