package net.itbank.Day0321;
import java.util.Scanner;
public class TextEmp2 {

	public static void main(String[] args) {
		//Scanner stdiIn=null; // 에러 new 생성자를 만들어줘야한다. nullPointerException
		
		int i=0;
		double d=0;
		String name="";
		Scanner stdiIn=new Scanner(System.in);
		System.out.print("이름 입력 ");   name=stdiIn.nextLine();
		System.out.print("나이 입력 ");   i=stdiIn.nextInt();
		System.out.print("몸무게 입력 ");  d=stdiIn.nextDouble();
		System.out.println();
		System.out.println(name+"의 나이는"+i+"세 몸무게는 "+d+"Kg입니다");
		
		
		
	} //main end
}//class end
