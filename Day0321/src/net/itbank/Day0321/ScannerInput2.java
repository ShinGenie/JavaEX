package net.itbank.Day0321;
import java.util.Scanner;
public class ScannerInput2 {

	public static void main(String[] args) {
		//Scanner stdiIn=null; // 에러 new 생성자를 만들어줘야한다. nullPointerException
		Scanner stdiIn=new Scanner(System.in);
		System.out.print("이름 나이 몸무게 ");
		String name= stdiIn.next(); // nextLine = 한줄의 데이터 엔터까지 모두 받는 함수 그래서 종료.  next();로 바꿔줘야함.
		/**/
		int i=stdiIn.nextInt();
		double d=stdiIn.nextDouble();
		System.out.println(name+"의 나이는"+i+"세 몸무게는 "+d+"Kg입니다");
		
		
		
	} //main end
}//class end
