package net.itbank.Day0321;
import java.util.Scanner;
public class ScannerInput2 {

	public static void main(String[] args) {
		//Scanner stdiIn=null; // ���� new �����ڸ� ���������Ѵ�. nullPointerException
		Scanner stdiIn=new Scanner(System.in);
		System.out.print("�̸� ���� ������ ");
		String name= stdiIn.next(); // nextLine = ������ ������ ���ͱ��� ��� �޴� �Լ� �׷��� ����.  next();�� �ٲ������.
		/**/
		int i=stdiIn.nextInt();
		double d=stdiIn.nextDouble();
		System.out.println(name+"�� ���̴�"+i+"�� �����Դ� "+d+"Kg�Դϴ�");
		
		
		
	} //main end
}//class end
